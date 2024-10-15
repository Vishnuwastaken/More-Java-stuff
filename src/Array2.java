// Write a function that will take an array of real numbers, and searches for a particular value,
// if the value is found, returns the index where it is found else returns -1
import java.util.*;
public class Array2 {
    static void read(int[] num){
        Scanner input = new Scanner(System.in);
        for (int i=0; i< num.length;i++){
            System.out.print("Enter value " + (i+1) + ": ");
            num[i] = input.nextInt();
        }
    }
    static void display(int[] num){
        for (int i =0; i<num.length;i++){
            System.out.print(num[i] + " | ");
        }
        System.out.println();
    }
    static int linearsearch(int[]num, int search){
        for (int i=0;i<num.length;i++){
            if (search==num[i]){
                return i;
            }
        }
        return -1;
    }
    // Search for a value and displays the index if the value is found and displays msg not found otherwise
    static void linearsearch1(int[]num, int search){
        boolean found = false;
        for (int i=0;i<num.length;i+=1){
            if (search==num[i]){
                System.out.print(search + " Found at " + (i+1) + " position");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.print(search + " not found");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        read(a);
        display(a);
        System.out.print("Enter a value to search: ");
        int value = input.nextInt();
        linearsearch1(a, value);
//        if (answer==-1){
//            System.out.print("Value not found in array");
//        }
//        else{
//            System.out.print("It was found at position " + (answer+1));
//        }
    }
}
