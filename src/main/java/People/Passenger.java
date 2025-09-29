package People;

public class Passenger extends Person {
    private String ticketNumber;

    public Passenger(String name, String id, String ticketNumber){
        super(name,id);
        this.ticketNumber = ticketNumber;
    }

    @Override
    public void displayInfo(){
        System.out.println("Passenger: " + getName() + "; ID: " + getId() + "; ticket number: " + getTicketNumber());
    }

    public String getTicketNumber() {
        return ticketNumber;
    }


}
