//import java.util.*;
//
//public class HW {
//    public static void main(String[] args) {
//        int size, i, j, temp,min;
//        int[] Array = new int[10];
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter array size: ");
//        size = input.nextInt();
//
//        System.out.print("Enter array elements: ");
//        for (i = 0; i < size; i++) {
//            Array[i] = input.nextInt();
//        }
//        for (i = 0; i < size-1; i++) {
//            min = i;
//            for (j = i + 1; j < size; j++) {
//                if (Array[j] < Array[min]){
//                    min = j;
//                }
//            }
//            temp = Array[min];
//            Array[min] = Array[i];
//            Array[i] = temp;
//        }
//        System.out.println("The array after sorting is: ");
//        for (i = 0; i < size; i++) {
//            System.out.print(Array[i] + " ");
//        }
//        System.out.println( "\n"+"Enter search value: ");
//        int search = input.nextInt();
//        boolean found = false;
//        for (i = 0; i < size; i++) {
//            if (Array[i] == search) {
//                System.out.println(search + " found at " + (i + 1));
//                found=true;
//                break;
//            }
//        }
//        if (!found){
//            System.out.println(search + " not found");
//        }
//    }
//}

public class HW {
    public static void main(String[] args) {
        int count, max =10;
        for (count=0;count<=max-6;count++){
            System.out.println(count);
        }
        System.out.print("After loop " + count);
    }
}

