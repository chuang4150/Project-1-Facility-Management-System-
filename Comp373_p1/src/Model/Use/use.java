package com.ebook.use;

import java.util.Date;

public class use {

    private boolean vacant;
    private Date startDate;
    private Date endDate;
    private int usage;
    private int amtInspections;

    public use(){
        vacant = true;
    }

    //checks to see if facility is in use
    public boolean isInUseDuringInterval(Date start, Date end){
        if(endDate.after(start) || startDate.before(end)){
            return true;
        }
        return false;
    }

    //assign facility to use for a specific time interval
    public void assignFacilityToUse(Date startDate, Date endDate){
        vacant = true;

        //Set start and end date of facility use
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //vacates facility for use
    public void vacateFacility(){
        vacant = true;
    }

    //facility is in use
    public void facilityInUse(){
        vacant = false;
    }

    //returns amount of inspections for a facility
    public getInspections(){
        return amtInspections;
    }

    //prints amount of inspections for a facility
    public void listInspections(){
        system.out.println("This facility had " + amtInspections);

    }

    //returns amount times facility had been used
    public getUsage(){
        return usage;
    }

    //lists amount of usage of the building and if its vacant
    public void listActualUsage(){
        system.out.println("This facility was used annually" + usage);
        system.out.println("Is this facility vacant? " + vacant);
    }


}
