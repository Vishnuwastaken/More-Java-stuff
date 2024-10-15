// Write a sub procedure that calculates the D of a quadratic
import java.util.*;
import java.lang.*;
public class Function {
    static double discriminant (double a, double b, double c){
        return (b*b)-4*a*c;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("You'd be solving discriminant and will need to enter a,b,c");
        System.out.print("Enter a: ");
        double value1 = input.nextDouble();
        System.out.print("Enter b: ");
        double value2 = input.nextDouble();
        System.out.print("Enter c: ");
        double value3 = input.nextDouble();
        double D = discriminant(value1, value2, value3);
        if (D<0){
            System.out.print("Equation has no real roots");
            System.out.print('\n' + "Discriminant is "+ D);
        }
        else if (D==0){
            System.out.print("Equation has 1 real root");
            double Y = ((-value2)/(2*value1));
            System.out.print('\n' + "Discriminant is "+ D + '\n');
            System.out.print("The root is " + Y);
        }
        else {
            System.out.print("Equation has 2 distinct roots");
            double X = (((-value2) + (Math.sqrt(D)))/(2*value1) );
            double X1 = (((-value2) - (Math.sqrt(D)))/(2*value1) );
            System.out.print('\n' + "Discriminant is "+ D + '\n');
            System.out.print("The root is " + X + " or " + X1);
        }
    }
}

// Write a menu-driven calculator program with functions for (Sum, Difference, Product, Quotient, Quit)
//import java.util.*;
//public class Function {
//    static double sum(double a, double b){
//        return a+b;
//    }
//    static double diff(double a, double b){
//        return a-b;
//    }
//    static double product(double a, double b){
//        return a*b;
//    }
//    static double quotient(double a, double b){
//        return a/b;
//    }
//    static void quit(){
//        System.out.print("Thank you!");
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.print("Enter a number: ");
//            double number = input.nextDouble();
//            System.out.print("Enter a second number: ");
//            double number1 = input.nextDouble();
//            System.out.println("Press 1 to add");
//            System.out.println("Press 2 to subtract");
//            System.out.println("Press 3 to multiply");
//            System.out.println("Press 4 to divide");
//            System.out.println("Press 5 to quit");
//            System.out.print("Choose an operation: ");
//            choice = input.nextInt();
//            if (choice == 1) {
//                System.out.println(sum(number, number1));
//            } else if (choice == 2) {
//                System.out.println(diff(number, number1));
//            } else if (choice == 3) {
//                System.out.println(product(number, number1));
//            } else if (choice == 4) {
//                System.out.println(quotient(number, number1));
//            } else {
//                quit();
//            }
//        }
//        while (choice != 5);
//    }
//}

// Define a function that returns absolute value of a number
//import java.util.*;
//public class Function {
//    static float abs(float number){
//        if (number >= 0){
//            return number;
//        }
//        else {
//            return (-number);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number to absolute value: ");
//        float value = input.nextFloat();
//        System.out.print(abs(value));
//    }
//}

// Write a function that increments a variable passed as a parameter
//import java.util.*;
//public class Function {
//    static void increment(int n){
//        n += 1;
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int n = input.nextInt();
//        increment(n);
//        System.out.print(n);
//    }
//}

