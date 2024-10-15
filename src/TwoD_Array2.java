// create a 2d array of order 4 of ints and find the sum of the elements on either diagonal
//import java.util.*;
//public class TwoD_Array2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int sum = 0;
//        int num[][] = {{1,2,3,4},{5,6,7,8}, {9,1,2,3},{4,7,6,5}};
//        for (int i=0;i< num.length;i++){
//            for(int j=0;j< num[0].length;j++){
//                if (i==j || i+j == num.length-1 ){
//                    sum+=num[i][j];
//                }
//                System.out.print(num[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        System.out.print("The sum of diagonal: " + sum);
//    }
//}

// input a square 2d array and display, if the array is a diagonal array
import java.util.*;
public class TwoD_Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of 2d array: ");
        size = input.nextInt();
        int[][] square = new int[size][size];
        for (int i=0;i<size;i++){
            System.out.print("Enter row " + (i+1) + " : ");
            for (int j=0;j<size;j++){
                square[i][j] = input.nextInt();
            }
        }
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
        boolean valid = true;
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if ((i == j && square[i][j]==0) || (i!=j && square[i][j]!=0)){
                    valid = false;
                    break;
                }
            }
            if (!valid){
                break;
            }
        }
        if (valid){
            System.out.print("It is a diagonal array");
        }
        else {
            System.out.print("Not a diagonal array");
        }
    }
}