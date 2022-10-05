/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

import java.util.Objects;

/**
 *
 * @author brandonwebdev
 */
public class Flight {

    private Plane plane;
    private Place departureAirport;
    private Place destinationAiroport;

    public Flight(Plane plane, Place departureAirport, Place destinationAiroport) {
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.destinationAiroport = destinationAiroport;
    }

    public Plane getPlane() {
        return plane;
    }

    public Place getDepartureAirport() {
        return departureAirport;
    }

    public Place getDestinationAiroport() {
        return destinationAiroport;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.plane);
        hash = 37 * hash + Objects.hashCode(this.departureAirport);
        hash = 37 * hash + Objects.hashCode(this.destinationAiroport);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flight other = (Flight) obj;
        if (!Objects.equals(this.plane, other.plane)) {
            return false;
        }
        if (!Objects.equals(this.departureAirport, other.departureAirport)) {
            return false;
        }
        if (!Objects.equals(this.destinationAiroport, other.destinationAiroport)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return plane + " (" + departureAirport + "-" + destinationAiroport + ")";
    }

}
