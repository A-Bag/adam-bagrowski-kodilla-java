package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {
    private List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent (Continent continent){
        listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        Set<Country> filteringSet = new HashSet<>();
        return listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .filter(country -> filteringSet.add(country))
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
