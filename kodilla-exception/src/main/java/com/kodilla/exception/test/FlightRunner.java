package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String args[]) {

        Flight flight = new Flight("Warszawa", "New York");
        SearchingFlight searchingFlight= new SearchingFlight();

        try {
            searchingFlight.findFilght(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("We hope this destination will be poosible in future");
        }
        finally{ System.out.println( "Thank you  for using our airlines" );
    }


    }
}

