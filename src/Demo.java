import java.util.*;
import java.lang.*;
public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter double value: ");
        double value = input.nextDouble();
        System.out.println(Math.sqrt(value));
        System.out.println(Math.pow(value,2));
    }
}
