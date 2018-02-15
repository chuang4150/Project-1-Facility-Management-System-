package Model.Service;

import Model.Facility.Facility;

public class FacilityService {

    private Facility facility;

    public void setFacility(Facility facility){
        this.facility = facility;
    }

    public Facility getFacility(){
        return facility;
    }
}
