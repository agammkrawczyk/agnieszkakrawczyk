package com.kodilla.good.patterns.challenges.Flights;

import java.util.*;

public class Board {


    public static Map<Integer, Destination> getAllFlights() {

         Map<Integer,Destination> allFlights = new HashMap<>();

        allFlights .put ( 1, new Destination( "Olsztyn", Optional.empty(), "Warszawa" ) );
        allFlights .put ( 2, new Destination( "Olsztyn", Optional.ofNullable( "Poznań" ), "Warszawa" ) );
        allFlights .put ( 3, new Destination( "Warszawa", Optional.ofNullable( "Poznan" ), "Gdańsk" ) );
        allFlights .put ( 4, new Destination( "Kraków", Optional.ofNullable( "Olsztyn" ), "Gdynia" ) );
        allFlights .put ( 5, new Destination( "Warszawa", Optional.empty(), "Radom" ) );



        return allFlights;
    }
}