package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.kodilla.good.patterns.challenges.Flights.Board.getAllFlights;

public class Application {
    public static void main(String args[]) {

        String departureAirport = "Warszawa";
        Optional<String> transferAirport = Optional.ofNullable("Olsztyn");
        String arrivalAirport = "Gdańsk";

        Destination destination= new Destination( departureAirport,transferAirport,arrivalAirport );
        FindFlight findFlight = new FindFlight();

        Board board = new Board();

        Map<Integer, Destination>allFlights= getAllFlights();
        findFlight.findFlightFromAirport( departureAirport,allFlights );
        findFlight.findFlightToAirport( arrivalAirport,allFlights );
        findFlight.findFlightWithTransferAirport( transferAirport,allFlights );
}
}
