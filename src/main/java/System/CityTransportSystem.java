package System;

import People.Passenger;
import People.Driver;
import Transport.Transport;
import Transport.PassengerCarrier;

import java.util.ArrayList;
import java.util.List;

public class CityTransportSystem {
    private List<Transport> transports;
    private List<Driver> drivers;
    private List<Passenger> passengers;

    public CityTransportSystem(){
        this.transports = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }
    public void addTransport(Transport t){
        transports.add(t);
    }

    public void addPassenger(Passenger p){
        passengers.add(p);
    }

    public void addDriver(Driver d){
        drivers.add(d);
    }


    public void boardingPassenger(Transport transport, Passenger passenger){
        if (transport instanceof PassengerCarrier carrier){
            if (transport.getCapacity() > 0){
                carrier.boardPassenger(passenger);
                transport.setCapacity(transport.getCapacity()-1);
            }
            else {
                System.out.println("No more seats available in: " + transport.getType() + " " + transport.getId());
            }
        }
    }

    public void disembarkingPassenger (Transport transport, Passenger passenger){
        if (transport instanceof  PassengerCarrier carrier){
            carrier.disembarkPassenge(passenger);
            transport.setCapacity(transport.getCapacity() + 1);
        }
    }

    public void displayAllInfo(){
        System.out.println("--------Transport system info-------");
        System.out.println("Transports:");
        for (Transport t: transports){
            t.displayInfo();
        }
        System.out.println("Drivers:");
        for (Driver d: drivers){
            d.displayInfo();
        }
        System.out.println("Passengers: ");
        for (Passenger p: passengers){
            p.displayInfo();
        }
    }


}
