// write a method that sorts an array in Selection Sort and Bubble Sort
import java.util.*;
public class Sorting {
    public static void selection(int[] A){
        int i,j,min, temp;
        for (i=0;i<= A.length-2;i++){
            min = i;
            for (j=i+1;j<=A.length-1;j++){
                if (A[j] < A[min]){
                    min = j;
                }
            }
            temp = A[i];
            A[i] = A[min];
            A[min]  = temp;
        }
    }
    public static void bubble(int[] A ){
        int i,j,temp;
        for (i=0;i<=A.length-2;i++){
            for (j=0;j<=A.length-2-i;j++){
                if(A[j] > A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }
    public static void display(int[] A){
        int i;
        for (i=0;i<A.length;i++){
            System.out.print(A[i] + " , ");
        }
        System.out.println();
    }
    public static int[] read(){
        Scanner input = new Scanner(System.in);
        int size,i;
        System.out.print("Enter size of array: ");
        size = input.nextInt();
        int[] A = new int[size];
        for (i=0;i<size;i++){
            System.out.print("Enter element " + (i+1) + " : ");
            A[i] = input.nextInt();
        }
        return A;
    }
    public static void main(String[] args) {
        int[] Array = read();
        display(Array);
//        bubble(Array);
        selection(Array);
        display(Array);

    }
}
