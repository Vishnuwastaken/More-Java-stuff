//import java.util.*;
//public class School_3 {
//    public static void main(String[] args) {
//        int counter;
//        int numberOfElements;
//        int item;
//        int[] array;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number of elements: ");
//        numberOfElements = input.nextInt();
//        array = new int[numberOfElements];
//        System.out.println("Enter " + numberOfElements + " integers: ");
//        for (counter =0; counter<numberOfElements; counter++){
//            array[counter] = input.nextInt();
//
//            System.out.println("Enter value to search for: ");
//            item = input.nextInt();
//            for (counter=0; counter<numberOfElements;counter++){
//                if (array[counter] == item){
//                    System.out.println(item + "is present at location " + (counter+1));
//                    break;
//                }
//            }
//            if (counter == numberOfElements){
//                System.out.println(item + "Doesnt exist");
//            }
//        }
//    }
//}

import java.util.*;
public class School_3 {
    public static void main(String[] args) {
        int size, i,j,temp;
        int array[] = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        size = input.nextInt();

        System.out.print("Enter array elements: ");
        for (i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        System.out.print("Sorting array using selection sort technique");
        for (i=0;i<size;i++){
            for (j=i+1;j<size;j++){
                if (array[i] > array[j]){
                    temp =array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Now the array after sorting is: \n ");
        for (i=0; i<size;i++){
            System.out.print(array[i] + " ");
        }
    }
}