package com.kodilla.good.patterns.challenges.Flights;


import java.util.Map;
import java.util.stream.Collector;

public class FindFlight {


        public String findFlightFromAirport (String departureAirport) {

            System.out.println( "Flights from departure Airport - " + departureAirport );
        FindFlight findFlight= new FindFlight();

        String findFlightShow= Board.getAllFlights().entrySet().stream()
                    .filter( entry -> entry.getValue().equals( departureAirport ) )
                    .sorted().toString();

        return findFlightShow;
        }


        public void findFlightToAirport (String arrivalAirport){

            System.out.println( " Flights to arrivalAirport " + arrivalAirport );
            Board.getAllFlights().entrySet().stream()
                    .filter( entry -> entry.getValue().equals( arrivalAirport ) )
                    .forEach( s->System.out.println( s ) );


    }

}
