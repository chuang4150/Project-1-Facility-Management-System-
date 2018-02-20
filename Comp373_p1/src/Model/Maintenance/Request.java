package Model.Maintenance;

import java.util.Date;


public interface Request {

    void setDescription(String description);

    void setTime(Date time);

    void setCost(int cost);

    void setDownTime(int downTime);

    void setStatus(boolean status);

    String getDescription();

    Date getTime();

    int getCost();

    int getDownTime();

    boolean getStatus();

}
