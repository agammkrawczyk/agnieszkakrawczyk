package com.kodilla.good.patterns.challenges.Flights;

import java.util.*;

public class Board {

    public static Map<NumberFlight, Destination> getAllFlights() {


        Map<NumberFlight,Destination> allFlights = new HashMap<>();


        allFlights.put( new NumberFlight( 1 ), new Destination( "Olsztyn", "Kraków" ) );
        allFlights.put( new NumberFlight( 2 ), new Destination( "Olsztyn", "Warszawa" ) );
        allFlights.put( new NumberFlight( 3 ), new Destination( "Warszawa", "Gdańsk" ) );
        allFlights.put( new NumberFlight( 4 ), new Destination( "Kraków", "Gdynia" ) );
        allFlights.put( new NumberFlight( 5 ), new Destination( "Warszawa", "Radom" ) );


        return allFlights;
    }


    }



