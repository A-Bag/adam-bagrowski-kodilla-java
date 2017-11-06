package com.kodilla.good.patterns.challenges.flight.system;

import java.util.Arrays;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;
    private String[] midAirports;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Flight(String departureAirport, String arrivalAirport, String... midAirports) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.midAirports = midAirports;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String[] getMidAirports() {
        return midAirports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (midAirports != null) {
            if (!Arrays.equals(midAirports, flight.midAirports)) return false;
        }
        if (!arrivalAirport.equals(flight.arrivalAirport)) return false;
        return departureAirport.equals(flight.departureAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        if (midAirports != null) {
            result = 31 * result + Arrays.hashCode(midAirports);
        }
        return result;
    }
}
