package com.kodilla.good.patterns.challenges.Flights;
import com.kodilla.good.patterns.challenges.Flights.Board;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFlight {



    public void findFlightFromAirport(String departureAirport,  Map<Integer,Destination>allFlights) {
        System.out.println("Flights from departure Airport - "+ departureAirport);

        allFlights.entrySet().stream()
                .filter( entry -> entry.getValue().equals( allFlights.get( departureAirport ) ) )
                .forEach( System.out::println );

    }

    public void findFlightToAirport(String arrivalAirport, Map<Integer,Destination>allFlights) {

        System.out.println( " Flights to arrivalAiport " + arrivalAirport );
        allFlights.entrySet().stream()
                .filter( entry -> entry.getValue().getDepartureAirport().equals( arrivalAirport ) )
                .forEach( System.out::println );
    }

    public void findFlightWithTransferAirport(Optional<String> transferAirport, Map<Integer,Destination> allFlights) {

        System.out.println( "Flights through transferAirport " +transferAirport);
        allFlights.entrySet().stream()
                .filter( entry -> (entry.getValue().equals(transferAirport) ) )
                .forEach( System.out::println );
    }

}