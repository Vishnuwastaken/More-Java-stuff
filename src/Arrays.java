// Declare an array that can store 5 names
//import java.util.*;
//public class Arrays {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] names = new String[3];
//        int i;
//        for (i = 0; i < names.length; i++) {
//            System.out.print("Enter a name: ");
//            names[i] = input.nextLine();
//        }
//        for (i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }
//    }
//}

// Write a program to input 5 integers into a array and display the highest and the lowest number
//public class Arrays {
//    public static void main(String[] args) {
//        int[] a = {-7,-10,-2,-13,-15};
//        int max = a[0];
//        int min = a[0];
//        for (int i = 1; i<a.length; i++){
//            if (a[i]>max){
//                max = a[i];
//            }
//            else if (a[i] < min){
//                min = a[i];
//            }
//        }
//        System.out.println("Max =  " + max);
//        System.out.print("Min =  " + min);
//    }
//}

// Write a code to find the avg of all elements of an array
//public class Arrays {
//    public static void main(String[] args) {
//        int[] a = {2, 4, 6, 8, 10};
//        int sum = 0;
//        for (int i = 0; i<a.length; i++){
//            sum += a[i];
//        }
//        float avg = sum/(float)a.length;
//        System.out.print("The avg is:  " + avg);
//    }
//}

// Write a program to swap the highest and lowest numbers in the array
public class Arrays {
    public static void main(String[] args) {
        int[] a = {29, 47, 66, 81, 10};
        int max = a[0];
        int min = a[0];
        int maxpos = 0;
        int minpos = 0;
        for (int i = 0; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
                maxpos = i;
            }
            else if (a[i] < min){
                min = a[i];
                minpos = i;
            }
        }
        int temp = a[maxpos];
        a[maxpos] = a[minpos];
        a[minpos] = temp;
        for (int j : a) {
            System.out.println(j);
        }
    }
}
