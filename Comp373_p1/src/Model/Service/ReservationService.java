package Model.Service;

import Model.Facility.Facility;
import Model.Maintenance.Request;
import Model.Maintenance.Requests;
import Model.Reservation.Reservation;
import Model.Reservation.Reservations;

import java.util.Date;
import java.util.List;

public class ReservationService {




    //checks to see if facility is in use
    public boolean atCapacity(Facility facility){
        if(facility.getCurrentCapacity() > 0){
            return false;
        }
        else {
            return true;
        }
    }

    //assign facility to use for a specific time interval
    public void assignFacilityToUse(Date startDate, Date endDate, Facility facility, String name, String purpose){
        if (atCapacity(facility) == false){
            Reservation reservation = new Reservations();

            reservation.setName(name);
            reservation.setPurpose(purpose);
            reservation.setStart(startDate);
            reservation.setEnd(endDate);

            facility.addReservation(reservation);
            int current = facility.getCurrentCapacity();
            current = current - 1;
            facility.setCurrentCapacity(current);
        }
    }

    //vacates facility for use
    public void vacateFacility(Facility facility){
        List<Reservation> reservations = null;
        facility.setReservations(reservations);
        facility.setCurrentCapacity(facility.getCapacity());
    }

    //returns amount times facility had been used
    public int getUsage(Facility facility){
        return facility.getCurrentCapacity();
    }
}
