import Transport.*;
import System.CityTransportSystem;
import People.*;
public class Main {
    public static void main(String[] args) {
        CityTransportSystem system = new CityTransportSystem();
        Bus bus = new Bus("B53", 53, 3, false, "Yellow Bus");
        Tram tram = new Tram("T12", 2, 120, 25.5, "T1 tram");
        Taxi taxi = new Taxi("TX10", 11, 4, true, "Grey Taxi");

        system.addTransport(bus);
        system.addTransport(tram);
        system.addTransport(taxi);

        Driver d1 = new Driver("Bob", "A100");
        Driver d2 = new Driver("Alex", "A110");
        Driver d3 = new Driver("John", "A111");

        system.addDriver(d1);
        system.addDriver(d2);
        system.addDriver(d3);

        Passenger p1 = new Passenger("Mike", "P01", "T1");
        Passenger p2 = new Passenger("Oleg", "P02", "T2");
        Passenger p3 = new Passenger("Maks", "P03", "T3");
        Passenger p4 = new Passenger("Sasha", "P04", "T4");
        Passenger p5 = new Passenger("Nikita", "P05", "T5");

        system.addPassenger(p1);
        system.addPassenger(p2);
        system.addPassenger(p3);
        system.addPassenger(p4);
        system.addPassenger(p5);

        d1.drive(bus);
        d2.drive(tram);
        d3.drive(taxi);


        system.boardingPassenger(bus, p1);
        system.boardingPassenger(bus, p2);
        system.boardingPassenger(bus, p3);
        system.boardingPassenger(bus, p4);
        system.boardingPassenger(taxi, p5);

        system.disembarkingPassenger(bus, p1);
        system.disembarkingPassenger(taxi, p5);

        system.displayAllInfo();

    }
}
