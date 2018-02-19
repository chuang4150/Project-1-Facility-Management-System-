package Model.Maintenance;

import java.sql.Time;

public interface Request {

    void setDescription(String description);

    void setTime(Time time);

    void setCost(int cost);

    void setDownTime(int downTime);

    void setStatus(boolean status);

    String getDescription();

    Time getTime();

    int getCost();

    int getDownTime();

    boolean getStatus();

}
