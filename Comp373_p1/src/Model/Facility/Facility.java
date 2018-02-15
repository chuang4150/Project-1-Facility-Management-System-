package Model.Facility;

import Model.Address.Address;
import Model.Address.Addresses;
import Model.Maintenance.Request;
import Model.Maintenance.Requests;
import Model.Reservation.Reservation;
import Model.Reservation.Reservations;

import java.util.List;

public interface Facility {

    void setRequests(List<Requests> requests);

    void setReservations(List<Reservations> reservations);

    void setAddress(Addresses address);

    void setName(String name);

    void setCapacity(int capacity);

    void setCurrentCapacity(int capacity);

    void addRequest(Requests request);

    void addReservation(Reservations reservation);

    List<Requests> getRequests();

    List<Reservations> getReservations();

    Addresses getAddress();

    String getName();

    int getCapacity();

    int getCurrentCapacity();
}
