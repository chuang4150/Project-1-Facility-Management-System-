package Model.Facility;

import Model.Address.Address;
import Model.Address.Addresses;
import Model.Maintenance.Request;
import Model.Maintenance.Requests;
import Model.Reservation.Reservation;
import Model.Reservation.Reservations;

import java.util.List;

public class Facilities implements Facility {

    private List<Requests> requests;
    private List<Reservations> reservations;
    private Addresses address;
    private String name;
    private int capacity;
    private int currentCapacity;

    public void setRequests(List<Requests> requests) {
        this.requests = requests;
    }

    public void setReservations(List<Reservations> reservations) {
        this.reservations = reservations;
    }

    public void setAddress(Addresses address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public List<Requests> getRequests() {
        return requests;
    }

    public List<Reservations> getReservations() {
        return reservations;
    }

    public Addresses getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void addRequest(Requests request) {
        requests.add(request);
    }

    public void addReservation(Reservations reservation) {
        reservations.add(reservation);
    }
}
