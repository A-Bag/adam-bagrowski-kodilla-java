package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> listOfContinents = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
