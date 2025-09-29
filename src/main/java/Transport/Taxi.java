package Transport;

import People.Passenger;

public class Taxi extends Transport implements PassengerCarrier{
    private boolean isAvailable;

    public Taxi(String id, int routeNumber, int capacity, boolean isAvailable,String type){
        super(id,routeNumber,capacity,type);
        this.isAvailable = isAvailable;
    }

    @Override
    public void move() {
        System.out.println("The taxi " + getId() + " goes on route number: " + getRouteNumber());
    }

    @Override
    public void displayInfo(){
        System.out.println("Taxi id: " + getId() +
                ", Route: " + getRouteNumber() +
                ", capacity: " + getCapacity() +
                ", is available: " + (isAvailable ? "Yes" : "No"));
    }

    public void boardPassenger(Passenger p){
        if (isAvailable){
            System.out.println("the passenger " + p.getName() + " boarded the taxi " + getId());
            isAvailable = false;
        }
        else {
            System.out.println("Taxi is not available");
        }

    };
    @Override
    public void disembarkPassenge(Passenger p){
        System.out.println("The passenger " + p.getName() + " left the taxi " + getId());
        isAvailable = true;
    };

}
