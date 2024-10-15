//import java.util.*;
//public class School_stuff {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = input.nextLine();
//        System.out.println("Your name is: " + name);
//
//        System.out.print("Enter your address: ");
//        String address = input.nextLine();
//        System.out.println("Your address is: " + address);
//
//        System.out.print("When is your birthday: ");
//        String birthday = input.nextLine();
//        System.out.println("Your birthday is: " + birthday);
//
//        System.out.print("What are your hobbies: ");
//        String hobbies = input.nextLine();
//        System.out.println("Your hobbies are: " + hobbies);
//    }
//}

// Correct the error code (Day 2)
import java.util.*;
public class School_stuff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fnum,snum,ans;
        char sign = 0;
        System.out.println("Welcome, This is a simple calculator with if statement");

        System.out.print("Enter first number: ");
        fnum = input.nextInt();

        System.out.print("Enter second number: ");
        snum = input.nextInt();

        System.out.print("enter mathematical operator: ");
        sign = input.next().charAt(0);

        if (sign == '+' ) {
            ans = fnum+snum;
            System.out.print("Sum is: " + ans);
        }
        else if (sign == '-'){
            ans = fnum-snum;
            System.out.print("Diffrence is: " + ans);
        }
        else if (sign == '/'){
            ans = fnum/snum;
            System.out.print("Division is: " + ans);
        }
        else if (sign == '*'){
            ans = fnum*snum;
            System.out.print("The product is: " + ans);
        }
        else{
            System.out.print("Invalid entry try again");
        }
    }
}