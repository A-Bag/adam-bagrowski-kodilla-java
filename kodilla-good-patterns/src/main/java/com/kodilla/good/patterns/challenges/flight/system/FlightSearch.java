package com.kodilla.good.patterns.challenges.flight.system;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch {
    private FlightsDB flightsDB;

    public FlightSearch(FlightsDB flightsDB) {
        this.flightsDB = flightsDB;
    }

    public List<Flight> searchByDepartureAirport (String airport) {
        return flightsDB.getListOfFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> searchByArrivalAirport (String airport) {
        return flightsDB.getListOfFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());
    }

    public List<List<Flight>> searchByMidAirport (String departureAirport, String arrivalAirport, String midAirport) {
        List<Flight> flightsFromDepartureToMidAirport = flightsDB.getListOfFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getArrivalAirport().equals(midAirport))
                .collect(Collectors.toList());

        List<Flight> flightsFromMidToArrivalAirport = flightsDB.getListOfFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(midAirport))
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        return Arrays.asList(flightsFromDepartureToMidAirport, flightsFromMidToArrivalAirport);
    }

    public Map<Flight, List<Flight>> searchByMidAirportAndDepartureTime
            (String departureAirport, String arrivalAirport, String midAirport, LocalTime departureTime) {
        List<Flight> flightsFromDepartureToMidAirport = flightsDB.getListOfFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getArrivalAirport().equals(midAirport))
                .filter(flight -> flight.getDepartureTime().isAfter(departureTime.minusHours(1)))
                .collect(Collectors.toList());

        List<Flight> flightsFromMidToArrivalAirport = flightsDB.getListOfFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(midAirport))
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        Map<Flight, List<Flight>> eachFlightToMidAirportWithListOfFlightsToArrivalAirport =
                flightsFromDepartureToMidAirport.stream()
                        .collect(Collectors.toMap(flightToMid -> flightToMid,
                                flightToMid -> flightsFromMidToArrivalAirport.stream()
                                        .filter(flightToArr -> flightToArr.getDepartureTime()
                                                .isAfter(flightToMid.getArrivalTime()))
                                        .collect(Collectors.toList())));

        eachFlightToMidAirportWithListOfFlightsToArrivalAirport =
                eachFlightToMidAirportWithListOfFlightsToArrivalAirport.entrySet().stream()
                        .filter(entry -> !entry.getValue().isEmpty())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return eachFlightToMidAirportWithListOfFlightsToArrivalAirport;
    }
}
