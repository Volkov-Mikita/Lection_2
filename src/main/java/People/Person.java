package People;

public abstract class Person {
    private String name;
    private String id;

    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }

    public abstract void displayInfo();

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


}
