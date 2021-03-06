package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchingFlight {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put( "Warszawa", true );
        airports.put( "Gdynia", true );
        airports.put( "Krawków", true );
        airports.put( "Poznań", true );
        airports.put( "Białystok", false );

        boolean readyArrivalAiport= airports.get( flight.getDepartureAirport());
        boolean readyDestinationAiport= airports.get(flight.getArrivalAirport());

        if (!airports.containsKey( flight.getArrivalAirport() ) || (!airports.containsKey( flight.getDepartureAirport() ))){

        throw new RouteNotFoundException();
        }

       if (  readyDestinationAiport == false|| readyArrivalAiport== false ){


            System.out.println( "The aiport is not ready" );
        }

        else { System.out.println("Destination is possible");
        }

    }

}
