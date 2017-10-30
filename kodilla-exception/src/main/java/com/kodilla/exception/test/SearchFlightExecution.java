package com.kodilla.exception.test;

public class SearchFlightExecution {
    public static void main(String[] args) {
        SearchFlight searchFlight = new SearchFlight();
        Flight flight1 = new Flight("Berlin", "Warsaw");
        Flight flight2 = new Flight("Berlin", "London");
        Flight flight3 = new Flight("London", "Berlin");

        try {
            searchFlight.findFlight(flight3);
        }catch(RouteNotFoundException e) {
            System.out.println("Flight not found!");
        }
    }
}
