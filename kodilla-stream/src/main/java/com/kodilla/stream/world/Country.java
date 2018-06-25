package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal peopleQuanitity;

    public Country(final String countryName, final BigDecimal peopleQuanitity) {
        this.countryName = countryName;
        this.peopleQuanitity = peopleQuanitity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuanitity() {
        return peopleQuanitity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQuanitity=" + peopleQuanitity +
                '}';
    }
}