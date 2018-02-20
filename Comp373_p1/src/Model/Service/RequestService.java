package Model.Service;

import Model.Facility.Facility;
import Model.Maintenance.Request;
import Model.Maintenance.Requests;

import java.util.Date;
import java.util.List;


public class RequestService {

    public Request createRequest(String description, Date time, int cost, int downTime, boolean status){
        Request request = new Requests();

        request.setDescription(description);
        request.setTime(time);
        request.setCost(cost);
        request.setDownTime(downTime);
        request.setStatus(status);

        return request;
    }

    public void addRequest(Request request, Facility facility){
        facility.addRequest(request);
    }

    public int calcCost(Facility facility){
        int cost = 0;
        List<Request> requests = facility.getRequests();
        for (int i = 0; i < requests.size(); i++){
            cost += requests.get(i).getCost();
        }

        return cost;
    }


}
