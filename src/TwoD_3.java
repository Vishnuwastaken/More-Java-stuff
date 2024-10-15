// Write a function which checks if a matrix is a Binary matrix. (A matrix whose elements are only 0 or 1)
//import java.util.*;
//public class TwoD_3 {
//    public static boolean binary(int[][] array){
//        int i=0,j=0;
//        boolean found = true;
//        while (i < array.length && found){
//            j =0;
//            while (j < array[0].length && found){
//                if (array[i][j]!=0 && array[i][j]!=1){
//                    found = false;
//                }
//                j++;
//            }
//            i++;
//        }
//        return found;
//    }
//    public static void read (int[][] A){
//        Scanner input = new Scanner(System.in);
//        for (int i=0;i< A.length;i++){
//            System.out.print("Enter row " + (i+1) + ": ");
//            for (int j=0; j< A[0].length;j++){
//                A[i][j] = input.nextInt();
//            }
//        }
//    }
//    public static void display(int[][] A){
//        for (int i=0;i< A.length;i++){
//            for (int j=0; j<A[0].length;j++){
//                System.out.print(A[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int column,row;
//        System.out.print("How many row: ");
//        row = input.nextInt();
//        System.out.print("How many column: ");
//        column = input.nextInt();
//        int[][] matrix = new int[row][column];
//        read(matrix);
//        display(matrix);
//        boolean ans = binary(matrix);
//        System.out.print("The matrix is binary: " + ans);
//    }
//}

// if the matrix is an Identity matrix ( A matrix in which the entries on the main  diagonal are 1 and outside the main diagonal are all zero)
import java.util.Scanner;
public class TwoD_3 {
    public static void read(double[][] Array){
        Scanner input = new Scanner(System.in);
        for (int i=0;i<Array.length;i++){
            System.out.print("Enter row " + (i+1) + " : ");
            for (int j=0; j<Array[0].length; j++){
                Array[i][j] = input.nextDouble();
            }
        }
    }
    public static void display(double[][] Array){
        for (int i =0;i< Array.length;i++){
            for (int j=0;j<Array[0].length;j++){
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static boolean identity(double[][] Array){
        boolean valid = true;
        for (int i=0;i< Array.length;i++){
            for (int j=0; j<Array[0].length;j++){
                if (i==j && Array[i][j]!=1){
                    return false;
                }
                if (i!=j && Array[i][j]!=0){
                    return false;
                }
            }
            }
        return true;
    }
    // if the matrix is an Integer matrix
    public static boolean integer(double[][] Array){
        boolean invalid = false;
        int i=0, j;
        while (i< Array.length && !invalid){
            j =0;
            while (j<Array[0].length && !invalid){
                if (Array[i][j] != (int) Array[i][j]){
                    invalid = true;
                }
                j++;
            }
            i++;
        }
        return !invalid;
    }
    // if the matrix is an arrowhead matrix ( matrix containing zeros in all entries except for the first row, first column, and main diagonal)
    public static boolean arrowhead(double[][] Array){
        int i = 0,j;
        boolean valid = true;
        while (i< Array.length && valid){
            j = 0;
            while (j<Array[0].length && valid){
                if (i==j){
                if (Array[i][j] == 0) {
                    valid = false;
                }
                }
                else if (i==0){
                    if (Array[i][j] == 0){
                        valid = false;
                    }
                }
                else if (j==0){
                    if (Array[i][j] == 0)
                        valid = false;
                }
                else if (Array[i][j] != 0){
                    valid = false;
                }
                j++;
            }
            i++;
        }
        return valid;
    }
    // write a function to find the transpose of the matrix
    public static double[][] transpose(double[][] Array){
        double[][] Array2 = new double[Array[0].length][Array.length];
        int i,j;
        for (i=0;i<Array.length;i++){
            for (j=0;j<Array[0].length;j++){
                Array2[j][i] = Array[i][j];
            }
        }
        return Array2;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows: ");
        int row = input.nextInt();
        double[][] Array = new double[row][row];
        read(Array);
        display(Array);
        boolean ans = identity(Array);
        System.out.println("Identity is " +  ans);
        boolean ans1 = integer(Array);
        System.out.println("Integer array is " + ans1);
        boolean ans2 = arrowhead(Array);
        System.out.println("Arrowhead Matrix is " + ans2);
        double[][] Array2 = {{1,2,3,4}, {4,5,6,7}};
        System.out.println("Original matrix is: ");
        display(Array2);
        double[][] ans3 = transpose(Array2);
        System.out.println("The transpose matrix is: ");
        display(ans3);
    }
    }
