package Model.Reservation;

import java.util.Date;

public class Reservations implements Reservation {

    private String name;
    private String purpose;
    private Date start;
    private Date end;

    public void setName(String name){
        this.name = name;
    }

    public void setPurpose(String purpose){
        this.purpose = purpose;
    }

    public void setStart(Date start){
        this.start = start;
    }

    public void  setEnd(Date end){
        this.end = end;
    }

    public String getName(){
        return name;
    }

    public String getPurpose(){
        return purpose;
    }

    public Date getStart(){
        return start;
    }

    public Date getEnd(){
        return end;
    }
}
