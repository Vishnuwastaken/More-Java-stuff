package stat;

public class Vehicle {
    private String make, model;
    private int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start(){
        System.out.println("Starting the " + year + " " + make + " " + model);
    }
    public static void stop(){
        System.out.println("stopping all vehicles");
    }
}
