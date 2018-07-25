package com.kodilla.good.patterns.challenges.Flights;
import com.kodilla.good.patterns.challenges.Flights.Board;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFlight {


    public void findFlightFromAirport(String departureAirport) {


        System.out.println("Flights from departure Airport - "+ departureAirport);

       Board.getAllFlights().entrySet().stream()
                .filter( entry -> entry.getValue().equals( Board.getAllFlights().get( departureAirport ) ) )
                .forEach( System.out::println );

    }

    public void findFlightToAirport(String arrivalAirport) {

        System.out.println( " Flights to arrivalAiport " + arrivalAirport );
        Board.getAllFlights().entrySet().stream()
                .filter( entry -> entry.getValue().getDepartureAirport().equals( arrivalAirport ) )
                .forEach( System.out::println );
    }

    public void findFlightWithTransferAirport(Optional<String> transferAirport) {

        System.out.println( "Flights through transferAirport " +transferAirport);
        Board.getAllFlights().entrySet().stream()
                .filter( entry -> (entry.getValue().equals(transferAirport) ) )
                .forEach( System.out::println );
    }

}