import java.util.*;
public class School_4 {
    public static void main(String[] args) {
        int a,b,c,d,max;
        System.out.println("Enter 4 integers: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        max=a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        if (d>max){
            max=d;
        }
        System.out.println("Max number is: " + max);
    }
}
