package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World {


    private final List<Continent> continentsList = new ArrayList<>();


    public void addContinentToWorld(Continent continent){
        continentsList.add(continent);
    }

    public List<Continent> getContinentsList() {
        return continentsList;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal numberOfPeople = continentsList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country::getPeopleQuanitity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return numberOfPeople;
    }


}
