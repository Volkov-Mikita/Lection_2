package Transport;

import People.Passenger;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String id;
    private int routeNumber;
    private int capacity;
    private String type;


    public Transport(String id, int routeNumber, int capacity, String type){
        this.id = id;
        this.routeNumber = routeNumber;
        this.capacity = capacity;
        this.type = type;
    }
    public void move(){}

    public abstract void displayInfo();


    public String getId() {
        return id;
    }


    public int getRouteNumber() {
        return routeNumber;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

}
