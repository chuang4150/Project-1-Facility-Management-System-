package Model.Reservation;

import java.util.Date;

public interface Reservation {

    void setName(String name);

    void setPurpose(String purpose);

    void setStart(Date start);

    void  setEnd(Date end);

    String getName();

    String getPurpose();

    Date getStart();

    Date getEnd();
}
