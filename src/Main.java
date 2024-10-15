import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int i,sum=0;
//        String[] subject = {"Physics", "Chem", "Math", "Eng", "Comp Sci"};
//        int[] marks = new int[subject.length];
//        for(i=0;i<subject.length;i++){
//            System.out.println("Enter grade for " + subject[i] + ": ");
//            marks[i] = input.nextInt();
//            sum=sum+marks[i];
//        }
//        float avg = (sum)/5f;
//        System.out.println("Your avg is: " + avg);
//        System.out.println(" So you got an: ");
//        if (avg>=90 && avg<100){
//            System.out.println(" A");
//        }
//        else if (avg<=89 && avg>=80){
//            System.out.println(" B");
//        }
//        else if (avg<=79&& avg>=70){
//            System.out.println(" C");
//        }
//        else if (avg<=69 && avg>=60){
//            System.out.println(" D");
//        }
//        else{
//            System.out.println("You fail");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int num;
//        Scanner input = new Scanner(System.in);
//        System.out.print("enter a number: ");
//        num = input.nextInt();
//        if (num==1){
//            System.out.println(num + " neither odd even");
//        }
//        else if (num%2==1){
//            System.out.println(num + " odd");
//        }
//        else if (num%2==0){
//            System.out.println(num + "  even");
//        }
//
//    }
//}