package Transport;

import People.Passenger;

public class Bus extends Transport implements PassengerCarrier{
    private boolean isDoubleDecker;

    public Bus(String id, int routeNumber, int capacity, boolean isDoubleDecker, String type){
        super(id,routeNumber,capacity, type);
        this.isDoubleDecker = isDoubleDecker;
    }
    @Override
    public void displayInfo(){
        System.out.println("Bus id: " + getId() +
                           ", Route: " + getRouteNumber() +
                           ", capacity: " + getCapacity() +
                           ", Double-decker: " + (isDoubleDecker ? "Yes" : "No"));
    }

    @Override
    public void move() {
        System.out.println("The bus " + getId() + " goes on route number:" + getRouteNumber());
    }


    @Override
    public void boardPassenger(Passenger p){
        System.out.println("the passenger " + p.getName() + " boarded the bus " + getId());
    };
    @Override
    public void disembarkPassenge(Passenger p){
        System.out.println("The passenger " + p.getName() + " left the bus " + getId());
    };


}
