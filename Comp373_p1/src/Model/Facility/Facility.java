package Model.Facility;

import Model.Address.Address;
import Model.Address.Addresses;
import Model.Maintenance.Request;
import Model.Maintenance.Requests;
import Model.Reservation.Reservation;
import Model.Reservation.Reservations;

import java.util.List;

public interface Facility {

    void setFacilities(List<Facility> facilities);

    void setRequests(List<Request> requests);

    void setReservations(List<Reservation> reservations);

    void setAddress(Address address);

    void setName(String name);

    void setCapacity(int capacity);

    void setCurrentCapacity(int capacity);

    void addFacility(Facility facility);

    void addRequest(Request request);

    void addReservation(Reservation reservation);

    List<Facility> getFacilities();

    List<Request> getRequests();

    List<Reservation> getReservations();

    Address getAddress();

    String getName();

    int getCapacity();

    int getCurrentCapacity();
}
