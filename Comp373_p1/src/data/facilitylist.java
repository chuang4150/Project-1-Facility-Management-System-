
import Model.Facility.Facilities;
import Model.Facility.Facility;

public class facilityList{

    Facility facility = new Facilities();

    List<Request> requests = null;
    List<Reservation> reservations = null;

    facility.setName("Doyle Hall");
    facility.setCapacity(50);
    facility.setCurrentCapacity(facility.getCapacity());
    facility.setRequests(requests);
    facility.setReservations(reservations);

    Facility facility1 = new Facilities();
    List<Request> requests = null;
    List<Reservation> reservations = null;

    facility1.setName("De Nobili Hall");
    facility1.setCapacity(100);
    facility1.setCurrentCapacity(facility1.getCapacity());
    facility1.setRequests(requests);
    facility1.setReservations(reservations);

    Facility facility2 = new Facilities();
    List<Request> requests = null;
    List<Reservation> reservations = null;

    facility2.setName("Mertz Hall");
    facility2.setCapacity(300);
    facility2.setCurrentCapacity(facility2.getCapacity());
    facility2.setRequests(requests);
    facility2.setReservations(reservations);

    Facility facility3 = new Facilities();
    List<Request> requests = null;
    List<Reservation> reservations = null;

    facility3.setName("Bellarmine Hall");
    facility3.setCapacity(220);
    facility3.setCurrentCapacity(facility.getCapacity());
    facility3.setRequests(requests);
    facility3.setReservations(reservations);

    Facility facility4 = new Facilities();
    List<Request> requests = null;
    List<Reservation> reservations = null;

    facility4.setName("Georgetown");
    facility4.setCapacity(193);
    facility4.setCurrentCapacity(facility4.getCapacity());
    facility4.setRequests(requests);
    facility4.setReservations(reservations);

}