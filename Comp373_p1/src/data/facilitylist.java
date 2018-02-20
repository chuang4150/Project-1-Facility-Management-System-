package data;

import Model.Address.Address;
import Model.Address.Addresses;
import Model.Facility.Facilities;
import Model.Facility.Facility;
import Model.Maintenance.Request;
import Model.Reservation.Reservation;
import Model.Service.RequestService;
import Model.Service.ReservationService;

import java.util.List;

public class facilityList{

    public static void database() {




        Facility facility = new Facilities();

        List<Request> requests = null;
        List<Reservation> reservations = null;


        facility.setName("Doyle Hall");
        facility.setCapacity(50);
        facility.setCurrentCapacity(facility.getCapacity());
        facility.setRequests(requests);
        facility.setReservations(reservations);

        Address address = new Addresses();

        address.setAddress1("1040 West Granville Ave.");
        address.setAddress2("N/A");
        address.setCity("Chicago");
        address.setState("IL");
        address.setZip(60660);

        facility.setAddress(address);



    }
}
