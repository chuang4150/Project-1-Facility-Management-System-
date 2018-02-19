package Model.Facility;

import Model.Address.Address;
import Model.Address.Addresses;
import Model.Maintenance.Request;
import Model.Maintenance.Requests;
import Model.Reservation.Reservation;
import Model.Reservation.Reservations;

import java.util.List;

public class Facilities implements Facility {

    private  List<Facility> facilities;
    private List<Request> requests;
    private List<Reservation> reservations;
    private Address address;
    private String name;
    private int capacity;
    private int currentCapacity;

    public void setFacilities(List<Facility> facilities){
        this.facilities = facilities;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void setAddress(Address address) {
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

    public List<Request> getRequests() {
        return requests;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public List<Facility> getFacilities(){
        return facilities;
    }

    public Address getAddress() {
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

    public void addRequest(Request request) {
        requests.add(request);
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void addFacility(Facility facility){
        facilities.add(facility);
    }
}
