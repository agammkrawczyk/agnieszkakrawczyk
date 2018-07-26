package com.kodilla.good.patterns.challenges.Flights;


import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class FindFlight {


    public void findFlightFromAirport(String departureAirport) {

        System.out.println( "Flights from departure Airport - " + departureAirport );
        Set<Destination> flights = Board.getAllFlights().stream()
                .filter( entry -> entry.getDepartureAirport().equals( departureAirport ) )
                .collect( Collectors.toSet() );
        System.out.println( flights );


    }


    public void findFlightToAirport(String arrivalAirport) {

        System.out.println( " Flights to arrival Airport " + arrivalAirport );
        Set<Destination> flightA = Board.getAllFlights().stream()
                .filter( entry -> entry.getArrivalAirport().equals( arrivalAirport ) )
                .collect( Collectors.toSet() );
        System.out.println( flightA );


    }

    public void FindTransferAirport(String arrivalAirport, String departureAirport) {
        System.out.println( "Sreaching for transfer Airport" );
        List<Destination> flightTA = Board.getAllFlights().stream()
                .filter( entry -> entry.getArrivalAirport().equals( arrivalAirport ) )
                .collect( Collectors.toList() );
//System.out.println( "TA"+flightTA );

        List<Destination> flightTD = Board.getAllFlights().stream()
                .filter( entry -> entry.getDepartureAirport().equals( departureAirport ) )
                .collect( Collectors.toList() );
//System.out.println( "TD"+flightTD );


        List<Destination> transfer = new ArrayList<>();
        for (Destination a: flightTD){
            for (Destination b :flightTA) {
                if (a.getArrivalAirport().equals( b.getDepartureAirport() )){
        transfer.add( a);
        transfer.add( b );
               }
            }
        }
        System.out.println( transfer );
    }
}

