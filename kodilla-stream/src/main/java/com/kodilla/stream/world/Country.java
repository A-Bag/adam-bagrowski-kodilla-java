package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    final String countryName;
    final int peopleQuantity;

    public Country(final String countryName, final int peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return new BigDecimal(peopleQuantity);
    }
}
