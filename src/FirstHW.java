//    Write a program to input marks in 3 subjects as integers and display their average    ( n1 + n2 + n3)/3
import java.util.* ;
public class FirstHW {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Eng Grade: ");
        int Eng = input.nextInt();
        System.out.print("Enter your Math Grade: ");
        int Math = input.nextInt();
        System.out.print("Enter your Science Grade: ");
        int Sci = input.nextInt();
        float avg = (Eng+Math+Sci)/3f;
        System.out.println("The avg is: " + avg );
    }
}

//        Write a program to the display first five multiples of an integer n read from the user
//import java.util.*;
//public class FirstHW {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number/ integer to see multiples: ");
//        int entry = input.nextInt();
//        System.out.println(entry+ "x1= " + entry);
//        System.out.println(entry+ "x2= " + entry*2);
//        System.out.println(entry+ "x3= " + entry*3);
//        System.out.println(entry+ "x4= " + entry*4);
//        System.out.println(entry+ "x5= " + entry*5);
//    }
//}