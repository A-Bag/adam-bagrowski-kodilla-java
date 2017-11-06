package com.kodilla.good.patterns.challenges.flight.system;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    FlightsDB flightsDB;

    public FlightSearch(FlightsDB flightsDB) {
        this.flightsDB = flightsDB;
    }

    public List<Flight> searchByDepartureAirport (String airport) {
        return flightsDB.getListOfFlights().stream()
                .filter(flight -> flight.getDepartureAirport() == airport)
                .collect(Collectors.toList());
    }

    public List<Flight> searchByArrivalAirport (String airport) {
        return flightsDB.getListOfFlights().stream()
                .filter(flight -> flight.getArrivalAirport() == airport)
                .collect(Collectors.toList());
    }

    public List<Flight> searchByMidAirport (String airport) {
        return flightsDB.getListOfFlights().stream()
                .filter(flight -> flight.getMidAirports() != null)
                .filter(flight -> Arrays.stream(flight.getMidAirports())
                        .anyMatch(midAirport -> midAirport == airport))
                .collect(Collectors.toList());
    }
}
