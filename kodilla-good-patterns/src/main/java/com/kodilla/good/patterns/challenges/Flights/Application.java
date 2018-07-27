package com.kodilla.good.patterns.challenges.Flights;



public class Application {
    public static void main(String args[]) {


        Destination destination= new Destination( "Olsztyn","Warszawa");


        FindFlight findFlight = new FindFlight();

        findFlight.findFlightFromAirport( destination.getDepartureAirport());
        findFlight.findFlightToAirport(  destination.getArrivalAirport());
        findFlight.FindTransferAirport( destination.getArrivalAirport(),destination.getDepartureAirport() );

}
}
