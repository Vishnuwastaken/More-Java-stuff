import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 1000: ");
        int num,sum=0,digit;
        do {
            num = input.nextInt();
        } while (num>1000 || num<0);
        while (num>0){
            digit = num%10;
            sum+=digit;
            num = num/10;
        }
        System.out.print(sum);
    }
}
