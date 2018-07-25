package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;


public class Destination {
    private final String departureAirport;

    private final String arrivalAirport;

    public Destination(final String departureAirport, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }


    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "departureAirport='" + departureAirport + '\'' +

                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return Objects.equals( departureAirport, that.departureAirport ) &&
                Objects.equals( arrivalAirport, that.arrivalAirport );
    }

    @Override
    public int hashCode() {

        return Objects.hash( departureAirport, arrivalAirport );
    }
}

