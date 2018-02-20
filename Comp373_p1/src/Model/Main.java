package Model;

import Model.Address.Address;
import Model.Address.Addresses;
import Model.Facility.Facilities;
import Model.Facility.Facility;
import Model.Maintenance.Request;
import Model.Maintenance.Requests;
import Model.Reservation.Reservation;
import Model.Service.RequestService;
import Model.Service.ReservationService;
import data.facilityList;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        Facility facility = new Facilities();

        RequestService requestService = new RequestService();

        ReservationService reservationService = new ReservationService();

        List<Request> requests = new ArrayList<>();
        List<Reservation> reservations = new ArrayList<>();


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

        Request request = new Requests();

        request.setStatus(false);
        request.setDownTime(5);
        request.setCost(500);
        request.setDescription("Heating Broken");
        request.setTime(Calendar.getInstance().getTime());

        requestService.addRequest(request,facility);

        reservationService.assignFacilityToUse(Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),
               facility, "David Saffo", "Study");





        System.out.println(facility.getName());
        System.out.println(facility.getCapacity());
        System.out.println(facility.getCurrentCapacity());
        System.out.println(facility.getAddress().getAddress1());
        System.out.println(facility.getAddress().getAddress2());
        System.out.println(facility.getAddress().getCity());
        System.out.println(facility.getAddress().getState());
        System.out.println(facility.getAddress().getZip());
        System.out.println(requestService.calcCost(facility));
        System.out.println(requestService.calcDownTime(facility));





    }
}
