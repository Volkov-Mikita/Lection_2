package People;
import Transport.*;
public class Driver extends Person{
    public Driver(String name, String id){
        super(name,id);
    }

    public void drive(Transport t){
        System.out.println("The driver " + getName() + " drives the " + t.getType() + " " + t.getId());
        t.move();
    }
    @Override
    public void displayInfo(){
        System.out.println("Driver: " + getName() + "; ID: " + getId());
    }
}
