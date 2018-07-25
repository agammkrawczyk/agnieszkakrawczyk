package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;
import java.util.Optional;

public class Destination {
    private final String departureAirport;
    private final Optional<String> transferAirport;
    private final String arrivalAirport;

    public Destination(final String departureAirport, final Optional<String> transferAirport, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.transferAirport = transferAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Optional<String> getTransferAirport() {
        return transferAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "departureAirport='" + departureAirport + '\'' +
                ", transferAirport=" + transferAirport +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return Objects.equals( departureAirport, that.departureAirport ) &&
                Objects.equals( transferAirport, that.transferAirport ) &&
                Objects.equals( arrivalAirport, that.arrivalAirport );
    }

    @Override
    public int hashCode() {

        return Objects.hash( departureAirport, transferAirport, arrivalAirport );
    }
}

