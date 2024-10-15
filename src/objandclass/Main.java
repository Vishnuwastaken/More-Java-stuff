package objandclass;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camera", 2018, 22000.50);
        myCar.displayCarDetails();
        myCar.setPrice(25000.75);
        System.out.println("New price: $" + myCar.getPrice());
    }
}
