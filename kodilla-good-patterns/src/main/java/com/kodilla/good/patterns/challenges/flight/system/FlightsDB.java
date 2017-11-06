package com.kodilla.good.patterns.challenges.flight.system;

import java.util.ArrayList;
import java.util.List;

public class FlightsDB {
    private List<Flight> listOfFlights = new ArrayList<>();

    public void addFlight(Flight flight){
        listOfFlights.add(flight);
    }

    public int getFlightsQuantity(){
        return listOfFlights.size();
    }

    public List<Flight> getListOfFlights() {
        return listOfFlights;
    }
}
