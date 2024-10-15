// Write a program to calculate the grade of a student based on the following system
// If marks > 80, the student gets 80, A. if 60-80, B. if 50-60, C. if <50, D. It should contiue as long as user wnats
//import java.util.*;
//public class Whileloop {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        char n = ' ';
//        while (n != 'n'){
//            System.out.print("enter your marks to see grade: ");
//            int marks = input.nextInt();
//            if (marks > 80 && marks <= 100){
//                System.out.print("That is an A ");
//            }
//            else if (marks > 60 && marks <= 80){
//                System.out.print("That is a B");
//            }
//            else if (marks > 50 && marks <= 60){
//                System.out.print("That is a C");
//            }
//            else if (marks >= 0 && marks <= 50){
//                System.out.print("That is a D");
//            }
//            else{
//                System.out.print("\n Value over 100 or below 0. Prob a mistake");
//            }
//            System.out.print("\nDo you want to check another grade (Press n to exit): ");
//            n = input.next().charAt(0);
//        }
//    }
//}

// Input an integer and display how many digits there are in it
//import java.util.*;
//public class Whileloop {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        char n = ' ';
//        while (true){
//            int count = 0;
//            System.out.print("Enter a integer: ");
//            int integer = input.nextInt();
//            while (integer != 0){
//                int digit = integer % 10;
//                integer = integer/10;
//                count++;
//            }
//            System.out.println("It has " + count + " digits");
//            System.out.print("Do you want to continue (Press n to exit): ");
//            n = input.next().charAt(0);
//            if (n=='n'){
//                break;
//            }
//        }
//    }
//}

// Write a progam to input a positive integer, and keep looping till they put a pos integer, and display the sum of digits of number entered
//import java.util.*;
//public class Whileloop {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n;
//        do {
//            System.out.print("Please enter a positive number: ");
//            n = input.nextInt();
//        }
//        while (n <= 0);
//        System.out.print("U FINALLY ENTER POS NUMBER");
//    }
//}


// Display the reverse integer. Ex. 321, display 123.
//import java.util.Scanner;
//public class Whileloop {
//    public static void main(String[] args){
//        int num, div,reverse=0;
//        Scanner input=new Scanner(System.in);
//        System.out.print("Enter the number for find reverse: ");
//        num=input.nextInt();
//        while(num>0){
//            div=num%10;
//            reverse=reverse*10+div;
//            num=num/10;
//        }
//        System.out.print("Reverse is: "+ reverse);
//        }
//    }

// Display if a number inputted is palindrome (when reversed it is same as inputted)
//import java.util.Scanner;
//public class Whileloop {
//    public static void main(String[] args) {
//        int num, div, reverse=0;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number to see if palindorme: ");
//        num = input.nextInt();
//        int original = num;
//        while (num>0){
//            div=num%10;
//            reverse=reverse*10+div;
//            num=num/10;
//        }
//        if (reverse == original) {
//            System.out.print("That is a palindrome");
//        }
//        else {
//            System.out.print("That is not palindrome");
//        }
//    }
//}

// Write a program to input multiple pos integer from user until they put a 0 and display highest num entered and keep looping if neg number
import java.util.*;
public class Whileloop {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n;
      int max = 0;
      do {
          do {
              System.out.print("Enter a number: ");
              n = input.nextInt();
          }
          while (n<0);
          if (n>max){
              max = n;
          }
      }
      while (n!=0);
      System.out.print("The highest value is " + max);
    }
}