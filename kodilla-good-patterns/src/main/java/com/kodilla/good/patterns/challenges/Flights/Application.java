package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.kodilla.good.patterns.challenges.Flights.Board.getAllFlights;

public class Application {
    public static void main(String args[]) {


        Destination destination= new Destination( "Warszawa",Optional.ofNullable("Olsztyn"),"Gdańśk");


        FindFlight findFlight = new FindFlight();


        Map<Integer, Destination>allFlights= Board.getAllFlights();
        findFlight.findFlightFromAirport( destination.getDepartureAirport());
        findFlight.findFlightToAirport(  destination.getArrivalAirport());
        findFlight.findFlightWithTransferAirport(  destination.getTransferAirport());
}
}
