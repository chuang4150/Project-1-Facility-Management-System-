package Model;

import Model.Address.Address;
import Model.Address.Addresses;
import Model.Facility.Facilities;
import Model.Maintenance.Request;
import Model.Maintenance.Requests;
import Model.Reservation.Reservation;
import Model.Reservation.Reservations;
import Model.Service.FacilityService;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Requests> requests = null;
        List<Reservations> reservations = null;

        FacilityService facilityService = new FacilityService();

        Facilities facility = new Facilities();



        facility.setName("Doyle Hall");
        facility.setCapacity(50);
        facility.setCurrentCapacity(facility.getCapacity());
        facility.setRequests(requests);
        facility.setReservations(reservations);

        Addresses address = new Addresses();

        address.setAddress1("1040 West Granville Ave.");
        address.setAddress2("N/A");
        address.setCity("Chicago");
        address.setState("IL");
        address.setZip(60660);

        facility.setAddress(address);

        System.out.println(facility.getName());
        System.out.println(facility.getCapacity());
        System.out.println(facility.getCurrentCapacity());
        System.out.println(facility.getAddress().getAddress1());
        System.out.println(facility.getAddress().getAddress2());
        System.out.println(facility.getAddress().getCity());
        System.out.println(facility.getAddress().getState());
        System.out.println(facility.getAddress().getZip());




    }
}
