package Model.Maintenance;

import java.sql.Time;

public class Requests implements Request {


    private Time time;
    private String description;
    private int cost;
    private int downTime;
    private boolean status;

    public void setTime(Time time){
        this.time = time;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public void setDownTime(int downTime){
        this.downTime = downTime;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public Time getTime(){
        return time;
    }

    public String getDescription(){
        return description;
    }

    public int getCost(){
        return cost;
    }

    public int getDownTime(){
        return downTime;
    }

    public boolean getStatus(){
        return status;
    }

}
