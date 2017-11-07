package com.kodilla.good.patterns.challenges.flight.system;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.*;

public class FlightSystemTestSuite {
    FlightsDB flightsDB;
    FlightSearch flightSearch;
    @Before
    public void beforeAllTests(){
        flightsDB = new FlightsDB();
        flightSearch = new FlightSearch(flightsDB);
        flightsDB.addFlight(new Flight("Warsaw", "Paris",
                LocalTime.of(6,0), LocalTime.of(8,0)));
        flightsDB.addFlight(new Flight("Warsaw", "Paris",
                LocalTime.of(7,50), LocalTime.of(10,0)));
        flightsDB.addFlight(new Flight("Warsaw", "Paris",
                LocalTime.of(10,0), LocalTime.of(12,0)));
        flightsDB.addFlight(new Flight("Paris", "London",
                LocalTime.of(12,0), LocalTime.of(14,0)));
        flightsDB.addFlight(new Flight("Paris", "Warsaw",
                LocalTime.of(9,0), LocalTime.of(11,0)));
        flightsDB.addFlight(new Flight("Warsaw", "Berlin",
                LocalTime.of(13,0), LocalTime.of(15,0)));
        flightsDB.addFlight(new Flight("Copenhagen", "Warsaw",
                LocalTime.of(10,0), LocalTime.of(12,0)));
        flightsDB.addFlight(new Flight("Warsaw", "London",
                LocalTime.of(14,0), LocalTime.of(16,0)));
    }

    @Test
    public void testAddFlight() {
        //Arrange
        //Act
        //Assert
        Assert.assertEquals(8,flightsDB.getFlightsQuantity());
    }

    @Test
    public void testSearchByDepartureAirport() {
        //Arrange
        //Act
        List<Flight> list = flightSearch.searchByDepartureAirport("Warsaw");
        //Assert
        List<Flight> expectedList = Arrays.asList(
                new Flight("Warsaw", "Paris",
                        LocalTime.of(6,0), LocalTime.of(8,0)),
                new Flight("Warsaw", "Paris",
                        LocalTime.of(7,50), LocalTime.of(10,0)),
                new Flight("Warsaw", "Paris",
                        LocalTime.of(10,0), LocalTime.of(12,0)),
                new Flight("Warsaw", "Berlin",
                        LocalTime.of(13,0), LocalTime.of(15,0)),
                new Flight("Warsaw", "London",
                        LocalTime.of(14,0), LocalTime.of(16,0)));
        Assert.assertEquals(5, list.size());
        Assert.assertEquals(expectedList, list);
    }

    @Test
    public void testSearchByArrivalAirport() {
        //Arrange
        //Act
        List<Flight> list = flightSearch.searchByArrivalAirport("Berlin");
        //Assert
        List<Flight> expectedList = Arrays.asList(
                new Flight("Warsaw", "Berlin",
                        LocalTime.of(13,0), LocalTime.of(15,0)));
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(expectedList, list);
    }

    @Test
    public void testSearchByMidAirport() {
        //Arrange
        //Act
        List<List<Flight>> list = flightSearch.searchByMidAirport(
                "Warsaw", "London", "Paris");
        //Assert
        List<Flight> flightsFromDepartureToMidAirport = Arrays.asList(
                new Flight("Warsaw", "Paris",
                        LocalTime.of(6,0), LocalTime.of(8,0)),
                new Flight("Warsaw", "Paris",
                        LocalTime.of(7,50), LocalTime.of(10,0)),
                new Flight("Warsaw", "Paris",
                        LocalTime.of(10,0), LocalTime.of(12,0)));
        List<Flight> flightsFromMidToArrivalAirport = Arrays.asList(
                new Flight("Paris", "London",
                        LocalTime.of(12,0), LocalTime.of(14,0)));
        List<List<Flight>> expectedList = Arrays.asList(flightsFromDepartureToMidAirport, flightsFromMidToArrivalAirport);
        Assert.assertEquals(expectedList, list);
    }

    @Test
    public void testSearchByMidAirportAndDepartureTime() {
        //Arrange
        //Act
        Map<Flight, List<Flight>> map = flightSearch.searchByMidAirportAndDepartureTime(
                "Warsaw", "London", "Paris", LocalTime.of(8,0));
        //Assert
        Map<Flight, List<Flight>> expectedMap = new HashMap<>();
        List<Flight> flightsFromMidToArrivalAirport = Arrays.asList(
                new Flight("Paris", "London",
                        LocalTime.of(12,0), LocalTime.of(14,0)));
        expectedMap.put(new Flight("Warsaw", "Paris",
                LocalTime.of(7,50), LocalTime.of(10,0)), flightsFromMidToArrivalAirport);
        expectedMap.put(new Flight("Warsaw", "Paris",
                LocalTime.of(10,0), LocalTime.of(12,0)), new ArrayList<>());
        Assert.assertEquals(expectedMap, map);
    }
}
