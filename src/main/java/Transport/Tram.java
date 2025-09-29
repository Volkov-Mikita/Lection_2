package Transport;

import People.Passenger;

public class Tram extends Transport implements PassengerCarrier{
    private double trackLength;

    public Tram(String id, int routeNumber, int capacity, double trackLength,String type){
        super(id,routeNumber,capacity,type);
        this.trackLength = trackLength;
    }

    @Override
    public void move() {
        System.out.println("The tram " + getId() + " goes on route number: " + getRouteNumber());
    }

    @Override
    public void displayInfo(){
        System.out.println("Tram id: " + getId() +
                ", Route: " + getRouteNumber() +
                ", capacity: " + getCapacity() +
                ", track length: " + getTrackLength());
    }
    public void boardPassenger(Passenger p){
        System.out.println("the passenger " + p.getName() + " boarded the tram " + getId());
    };
    @Override
    public void disembarkPassenge(Passenger p){
        System.out.println("The passenger " + p.getName() + " left the tram " + getId());
    };
    public double getTrackLength() {
        return trackLength;
    }

}
