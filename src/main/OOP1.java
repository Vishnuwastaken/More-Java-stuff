//import java.util.*;
//public class OOP1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number between 0 and 1000: ");
//        int value = input.nextInt();
//        if (value<1000 && value>0){
//            int first = value%10;
//            int newvalue = value/10;
//            int second = newvalue%10;
//            newvalue = newvalue/10;
//            int third = newvalue%10;
//            newvalue = newvalue/10;
//            int sum = first+second+third;
//            System.out.println(sum);
//        }
//        else{
//            System.out.println("Too big or small");
//
//        }
//    }
//
//}

//import java.util.*;
//public class OOP1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter distance: ");
//        int distance = input.nextInt();
//        System.out.println("Enter hours taken");
//        int hours = input.nextInt();
//        System.out.println("enter minutes taken: ");
//        int minutes = input.nextInt();
//        System.out.println("enter second taken: ");
//        int second = input.nextInt();
//        int totalsecond = (hours*3600)+(minutes*60)+second;
//        float speedms = (float)(distance/totalsecond);
//        int distancekm = distance/1000;
//        int totalhr = hours + (minutes/60) + (second/3600);
//        float speedhr = (float)(distancekm/totalhr);
//        System.out.println("The speed in m/s" + speedms );
//        System.out.println("Speed in km/hr " + speedhr);
//    }
//}

//public class OOP1 {
//    static void myMethod(String fname, int age){
//        System.out.println(fname + " is " + age);
//    }
//
//    public static void main(String[] args) {
//        myMethod("Liam", 5);
//        myMethod("Jenny", 8);
//        myMethod("Anja", 31);
//    }
//}

package main;
import java.util.*;
public class OOP1 {
    static int myMethod(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first value: ");
        int x = input.nextInt();
        System.out.println("enter second value: ");
        int y= input.nextInt();
        int z = myMethod(x,y);
        System.out.println(z);
    }
}