package com.kodilla.good.patterns.challenges.Flights;

import java.util.*;

public final class Board {


    public static Set<Destination> getAllFlights() {


        Set<Destination> allFlights = new HashSet<>();


        allFlights.add( new Destination( "Olsztyn", "Kraków" ) );
        allFlights.add( new Destination( "Kraków", "Warszawa" ) );
        allFlights.add( new Destination( "Warszawa", "Gdańsk" ) );
        allFlights.add( new Destination( "Kraków", "Gdynia" ) );
        allFlights.add( new Destination( "Warszawa", "Radom" ) );
        allFlights.add( new Destination( "Warszawa", "Praga" ) );
        allFlights.add( new Destination( "Olsztyn", "Lublin" ) );
        allFlights.add( new Destination( "Olsztyn", "Katowice" ) );
        allFlights.add( new Destination( "Katowice", "Warszawa" ) );
        allFlights.add( new Destination( "Kraków","Radom" ) );
        allFlights.add( new Destination( "Katowice","Radom" ) );

        return allFlights;
    }


}



