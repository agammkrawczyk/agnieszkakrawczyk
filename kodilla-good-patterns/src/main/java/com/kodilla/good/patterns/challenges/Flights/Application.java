package com.kodilla.good.patterns.challenges.Flights;

import java.util.Map;


public class Application {
    public static void main(String args[]) {


        Destination destination= new Destination( "Warszawa","Gdańśk");


        FindFlight findFlight = new FindFlight();
        Map<NumberFlight, Destination>allFlights =Board.getAllFlights();
        findFlight.findFlightFromAirport( destination.getDepartureAirport());
        findFlight.findFlightToAirport(  destination.getArrivalAirport());

}
}
