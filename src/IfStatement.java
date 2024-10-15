// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their salary and year of service and print the net bonus amount.
//import java.util.*;
//public class IfStatement{
//    public static void main(String[] args){
//        Scanner inp = new Scanner(System.in);
//        System.out.print("Enter  your years of working: ");
//        int years = inp.nextInt();
//        if (years > 5){
//            System.out.print("Enter ur salary: ");
//            int salary = inp.nextInt();
//            float bonus = salary*0.05f;
//            System.out.print("Your bonus is " + bonus + "$");
//        }
//        else{
//            System.out.print("You haven't worked 5 yrs yet");
//        }
//    }
//}
//
// Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ) alphabet or not an alphabet
//import java.util.*;
//public class IfStatement {
//    public static void main(String[] args){
//        Scanner inp = new Scanner(System.in);
//        System.out.print("Enter a character: ");
//        char character = inp.next().charAt(0);
//        if (character >= 'a' && character <= 'z'){
//            System.out.print("Its small case letter");
//            }
//        else if (character >= 'A' && character <= 'Z'){
//            System.out.print("Its a upper case letter");
//        }
//        else{
//            System.out.print("Not a alphabet");
//        }
//
//    }
//}

// A student will not be allowed to sit in exam if his/her attendance is less than 75%.Take following input from userNumber of classes heldNumber of classes attended.And printpercentage of class attendedIs student is allowed to sit in exam or not.
import java.util.*;
public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many classes held: ");
        int class_held = input.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int class_attend = input.nextInt();
        float rate = ((float)class_attend/(float)class_held) * 100;
        System.out.println(rate + "% of classes were attended");
        if (rate>= 75 && rate <= 100){
            System.out.print("\n YOU CAN SIT IN EXAM");
        }
        else if (rate < 75){
            System.out.print(" \n ATTEND MORE CLASSES YOU CANT SIT");
        }
        else{
            System.out.print("\n The value is over 100, you entered it the opposite way");
        }
    }
}