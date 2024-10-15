// Create 2D Array to store marks of 4 students in 2 subjecst
//import java.util.*;
//public class TwoD_Array {
//    public static void main(String[]args){
//        Scanner input = new Scanner(System.in);
//        int marks[][] = new int[4][2];
//        for(int i=0; i<4; i++){
//            for (int j=0; j<2; j++ ){
//                System.out.print("enter marks: ");
//                marks[i][j] = input.nextInt();
//            }
//
//        }
//        for (int i=0; i<4; i++){
//            for (int j=0; j<2; j++){
//                System.out.print(marks[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
// create an array to store integers in a Table form after inputting the num of rows & column from user.
// input values from user, and store in array, input a value and display the indices of the element
import java.util.*;
public class TwoD_Array {
    public static void main(String []args){
        int column, row;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of rows to populate: ");
        row = input.nextInt();
        System.out.print("Enter the amount of columns to populate: ");
        column = input.nextInt();
        int[][] num = new int[row][column];
        int i,j;
        for (i=0;i<row;i++){
            System.out.println("Enter element of row " + (i+1) + ": ");
            for (j=0;j<column;j++){
                num[i][j] = input.nextInt();
            }
        }
        for (i=0;i<row;i++){
            for (j=0;j<column;j++){
                System.out.print(num[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.print("Enter a number to search for: ");
        int search = input.nextInt();
        boolean found = false;
        for (i=0; i<row;i++){
            for (j=0; j<column; j++){
                if (search == num[i][j]){
                    System.out.print(search + " found at " + (i+1) + " , " + (j+1));
                    found = true;
                    break;
                }
                if (found){
                    break;
                }
            }
        }
        if (!found){
            System.out.print(search + " not found");
        }
        }
    }
