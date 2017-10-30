package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("London", false);
        if(airports.get(flight.getArrivalAirport()) == null) {
            throw new RouteNotFoundException();
        } else if(airports.get(flight.getArrivalAirport())) {
            System.out.println("Arrival airport accessible!");
        } else {
            System.out.println("Arrival airport not accessible!");
        }
    }
}
