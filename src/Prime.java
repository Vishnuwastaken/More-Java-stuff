//import java.util.*;
//public class Prime {
//    public static void main(String[] args) {
//        for (int number = 2; number<=100; number++){
//            int count = 0;
//            for (int i =2; i<=number/2; i++){
//                if (number%i == 0){
//                    ++count;
//                    break;
//                }
//            }
//            if (count==0){
//                System.out.println(number);
//            }
//        }
//    }
//}

// Find the hcf of 2 numbers
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, num1, small, hcf = 1;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num1 = input.nextInt();
        small = Math.min(num, num1);
        for (int i = small; i>=1; i--){
            if (num%i==0 && num1%i==0){
                hcf = i;
                break;
            }
        }
        System.out.print(hcf);
    }
}