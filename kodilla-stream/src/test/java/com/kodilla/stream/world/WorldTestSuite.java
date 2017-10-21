package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Arrange
        World world = new World();
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        world.listOfContinents.add(europe);
        world.listOfContinents.add(asia);
        world.listOfContinents.add(africa);
        europe.listOfCountries.add(new Country("Poland", 40000000));
        europe.listOfCountries.add(new Country("Germany", 80000000));
        europe.listOfCountries.add(new Country("Russia", 120000000));
        europe.listOfCountries.add(new Country("Hungary", 12000000));
        asia.listOfCountries.add(new Country("China", 1000000000));
        asia.listOfCountries.add(new Country("India", 1100000000));
        africa.listOfCountries.add(new Country("Egypt", 100000000));
        africa.listOfCountries.add(new Country("South Africa", 60000000));

        //Act
        BigDecimal worldPopulation = world.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("2512000000");

        //Assert
        Assert.assertEquals(expectedPopulation, worldPopulation);
    }
}
