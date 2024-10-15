// Write a program to input N numbers from the user and store them in an array
//import java.util.*;
//public class list {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] number = new int[10];
//        int n;
//        System.out.print("Enter how many numbers u want to enter: ");
//        n = input.nextInt();
//        for (int i = 0; i<n; i++){
//            System.out.print("Enter a number: ");
//            number[i] = input.nextInt();
//        }
//        for (int i = 0; i<n; i++){
//            System.out.print(number[i] + " || ");
//        }
//    }
//}

// Write a program to input N names from user and their corresponding marks in seperate array
//import java.util.*;
//public class list {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] name = new String[10];
//        int [] marks = new int[10];
//        int size;
//        System.out.print("Enter how many names (and marks) you want to enter: ");
//        size = input.nextInt();
//        for (int i = 0; i<size; i++){
//            String ch = input.nextLine();
//            System.out.print("Enter your name: ");
//            name[i] = input.nextLine();
//            System.out.print("Enter your marks: ");
//            marks[i] = input.nextInt();
//        }
//        int limit;
//        System.out. print("Enter a value that the marks have to be displayed: ");
//        limit = input.nextInt();
//        System.out.println("Name        Marks   ");
//        for (int i = 0; i<size; i++){
//            if (marks[i] > limit){
//                System.out.println(name[i] + "       "  + marks[i]);
//            }
//        }
//    }
//}

// Write a program to input a positive integer and display all its factors
//import java.util.*;
//public class list {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number;
//        int count = 0;
//        do {
//            System.out.print("Enter a pos integer: ");
//            number = input.nextInt();
//        }
//        while (number <= 0);
//        System.out.println("The factors are: ");
//        for (int i=1; i<=number; i++){
//            if (number%i == 0){
//                count ++;
//                System.out.print(i + " || ");
//            }
//        }
//        System.out.print("\nThere are " +  count + " number");
//    }
//    }

// Write a program to input a positive integer and display whether it is a prime number or not
import java.util.*;
public class list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count =0;
        do {
            System.out.print("Enter a pos integer: ");
            number = input.nextInt();
        }
        while (number <= 0);
        for (int i=2; i<=number/2; i++){
            if (number%i==0){
                count++;
                break;
            }
        }
//        System.out.println("Factors = " + count);
        if (number==1){
            System.out.print(number + " is neither prime or composite");
        }
        else if (count==0){
            System.out.print(number + " is prime number");
        }
        else{
            System.out.print(number + " is composite number");
        }
        }
    }
//
