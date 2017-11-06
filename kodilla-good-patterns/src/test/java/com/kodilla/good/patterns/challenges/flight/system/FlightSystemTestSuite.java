package com.kodilla.good.patterns.challenges.flight.system;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FlightSystemTestSuite {
    FlightsDB flightsDB;
    FlightSearch flightSearch;
    @Before
    public void beforeAllTests(){
        flightsDB = new FlightsDB();
        flightSearch = new FlightSearch(flightsDB);
        flightsDB.addFlight(new Flight("Warsaw", "Paris"));
        flightsDB.addFlight(new Flight("Paris", "Warsaw"));
        flightsDB.addFlight(new Flight("Warsaw", "Berlin"));
        flightsDB.addFlight(new Flight("Copenhagen", "Warsaw", "Cracow"));
        flightsDB.addFlight(new Flight("Warsaw", "London", "Wroclaw", "Berlin"));
    }

    @Test
    public void testAddFlight() {
        //Arrange
        //Act
        //Assert
        Assert.assertEquals(5,flightsDB.getFlightsQuantity());
    }

    @Test
    public void testSearchByDepartureAirport() {
        //Arrange
        //Act
        List<Flight> list = flightSearch.searchByDepartureAirport("Warsaw");
        //Assert
        List<Flight> expectedList = Arrays.asList(
                new Flight("Warsaw", "Paris"),
                new Flight("Warsaw", "Berlin"),
                new Flight("Warsaw", "London", "Wroclaw", "Berlin"));
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(expectedList, list);
    }

    @Test
    public void testSearchByArrivalAirport() {
        //Arrange
        //Act
        List<Flight> list = flightSearch.searchByArrivalAirport("Berlin");
        //Assert
        List<Flight> expectedList = Arrays.asList(
                new Flight("Warsaw", "Berlin"));
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(expectedList, list);
    }

    @Test
    public void testSearchByMidAirport() {
        //Arrange
        //Act
        List<Flight> list = flightSearch.searchByMidAirport("Wroclaw");
        //Assert
        List<Flight> expectedList = Arrays.asList(
                new Flight("Warsaw", "London", "Wroclaw", "Berlin"));
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(expectedList, list);
    }
}
