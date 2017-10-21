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
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        europe.addCountry(new Country("Poland", 40000000));
        europe.addCountry(new Country("Germany", 80000000));
        europe.addCountry(new Country("Russia", 120000000));
        europe.addCountry(new Country("Hungary", 12000000));
        asia.addCountry(new Country("China", 1000000000));
        asia.addCountry(new Country("India", 1100000000));
        asia.addCountry(new Country("Russia", 120000000));
        africa.addCountry(new Country("Egypt", 100000000));
        africa.addCountry(new Country("South Africa", 60000000));

        //Act
        BigDecimal worldPopulation = world.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("2512000000");

        //Assert
        Assert.assertEquals(expectedPopulation, worldPopulation);
    }
}
