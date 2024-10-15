// Write a program to display all numbers from 10-1
//public class Loops {
//    public static void main(String[] args) {
//        int i;
//        for (i=10; i>=1;i-=1 ){
//            System.out.println(i);
//        }
//    }
//}

// Show the number series(1,4,7,10) from 1-50
//public class Loops {
//    public static void main(String[] args) {
//        int i;
//        for (i=1;i<50;i+=3){
//            System.out.print(i + "  ");
//        }
//    }
//}

// Write a code to print all multiples of N from 200-250
//import java.util.*;
//public class Loops {
//    public static void main(String[] args) {
//        int i;
//        int count = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number whos multiples u want to see: ");
//        int n = input.nextInt();
//        for (i=200;i<=250; i++){
//            if (i%n==0){
//                System.out.print(i + " ");
//                count++;
//            }
//        }
//        System.out.print("\n The number of multiples = " + count);
//    }
//}

//  Write a code to input 5 ppl's age, and show how many of them are adults
//import java.util.*;
//public class Loops {
//    public static void main(String[] args) {
//        int i;
//        int count = 0;
//        Scanner input = new Scanner(System.in);
//        for (i=1; i<=5; i++){
//            System.out.print("Enter you age: ");
//            int age = input.nextInt();
//            if (age >= 18){
//                System.out.println("You are an adult");
//                count+=1;
//            }
//            else{
//                System.out.println("You are not an adult");
//            }
//        }
//        System.out.print("The number of adults are " + count);
//    }
//}

// Write a program to input the salary of 5 employees, and display their avg salary using for loop *HW*
import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        float total = 0;
        for (i=1; i<=5; i++){
            System.out.print("enter your salary: ");
            total += input.nextInt();
        }
        System.out.print("\nAvg: " + (total/5) + '\n');
    }
}