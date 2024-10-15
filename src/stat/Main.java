package stat;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Toyota", "Corolla", 2015);
        Vehicle car2 = new Vehicle("Honda", "Civic", 2020);

        car1.start();
        car2.start();

        Vehicle.stop();
    }
}
