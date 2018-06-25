package com.kodilla.stream.world;
import java.util.List;
import java.util.ArrayList;


public final class Continent {
    private final String continentName;
    private final List<Country> countriesList = new ArrayList<>();

    public Continent( final String continentName) {
        this.continentName = continentName;
    }
    public void addCountryToContintnet(Country country){
        countriesList.add( country );
}

    public List<Country>getCountriesList(){
        return countriesList;
}

}
