// Write the following functions: 1. Input an array of integers, 2. Display the array, 3. Returns the highest value in array
//import java.util.*;
//public class Functionswitharray {
//    static void read(int[] N){
//        Scanner input = new Scanner(System.in);
//        System.out.println();
//        for (int i =0; i<N.length; i++){
//            System.out.print("Enter a number: ");
//            N[i] = input.nextInt();
//        }
//    }
//    static void display(int[] N){
//        for (int i =0; i<N.length; i++){
//            System.out.print(N[i] + " | | ");
//        }
//    }
//    static int max(int[] N){
//        int highest = N[0];
//        for (int i=1; i<N.length;i++){
//            if (N[i] > highest){
//                highest = N[i];
//            }
//        }
//        return highest;
//    }
//    public static void main(String[] args) {
//        int[] A = new int[5];
//        display(A);
//        read(A);
//        display(A);
//        System.out.print( '\n' + "Highest value: " + max(A));
//    }
//}

// Write a program to input an array from the user and display whether the value was found or not
//import java.util.*;
//public class Functionswitharray {
//    static void read(int A[]){
//        Scanner input = new Scanner(System.in);
//        for (int i=0; i< A.length; i++){
//            System.out.print("Enter a element: ");
//            A[i] = input.nextInt();
//        }
//    }
//    static int linearsearch(int B[], int value){
//        for (int i=0; i<B.length; i++){
//            if (B[i] == value){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] A = new int[5];
//        read(A);
//        int answer = linearsearch(A, 100);
//        if (answer == -1){
//            System.out.println("100 not found in array");
//        }
//        else{
//            System.out.print("100 found at position: " + (answer+1));
//        }
//    }
//}

// Write a function that takes an array as a parameter and returns the sum of all the elements of the array
import java.util.*;
public class Functionswitharray {
    static void read(int A[]){
        Scanner input = new Scanner(System.in);
        for (int i=0; i< A.length; i++){
            System.out.print("Enter a element: ");
            A[i] = input.nextInt();
        }
    }
    static int linearsearch(int B[], int value){
        for (int i=0; i<B.length; i++){
            if (B[i] == value){
                return i;
            }
        }
        return -1;
    }
    static int sum(int C[]){
        int total = 0;
        for (int i=0; i<C.length; i++){
            total += C[i];
        }
        return total;
    }
    // Function to find a sum of all odd numbers in a array
    static int sumodd(int D[]){
        int total = 0;
        for (int i=0; i<D.length; i++){
            if (D[i]%2 != 0){
                total += D[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] A = new int[5];
        read(A);
        /*int answer = linearsearch(A, 100);
        if (answer == -1){
            System.out.println("100 not found in array");
        }
        else{
            System.out.print("100 found at position: " + (answer+1));
        }*/
        System.out.print( '\n' +"The sum of all elements is: " + sum(A));
        System.out.print('\n' + "The sum of all odd number is: " + sumodd(A));
    }
}

