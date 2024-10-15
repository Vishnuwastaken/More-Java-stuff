package selection;

public class Car {
    private String make;
    private String model;
    private int year;
    private boolean isElectric;

    public Car(String make, String model, int year, boolean isElectric){
        this.make = make;
        this.model = model;
        this.year = year;
        this.isElectric = isElectric;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public boolean isElectric() {
        return isElectric;
    }
    public static void main(String[] args) {
        Car mycar = new Car("Tesla", "Model S", 2022, true);
        if (mycar.isElectric()){
            System.out.println("my car is electric");
        }
        else{
            System.out.println("my car isnt electric");
        }
    }
}
