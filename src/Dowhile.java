
// Write a program to input multiple pos integer from user until they put a 0 and display lowest num entered and keep looping if neg number
//import java.util.*;
//    public class Dowhile {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            int n;
//            int max = 0;
//            int min = 999999999;
//            do {
//                do {
//                    System.out.print("Enter a number: ");
//                    n = input.nextInt();
//                }
//                while (n<0 );
//                if (n<min && n!=0){
//                    min = n;
//                }
//                else if (n>max){
//                    max= n;
//                }
//            }
//            while (n!=0);
//            System.out.println("The lowest value is " + min);
//            System.out.print("The highest value is " + max);
//        }
//    }

// Input 2 numbers from the user and swap (interchange) the values
import java.util.*;
public class Dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, temp;
        System.out.print("Enter a number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        System.out.println("First number is " + n1);
        System.out.println("Second number is " + n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("The swapped first number is " + n1);
        System.out.print("The swapped second number is " + n2);
    }
}
