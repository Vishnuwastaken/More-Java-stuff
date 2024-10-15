import java.util.*;

public class practiceDel {
    public static void display(int A[]){
        for (int i = 0; i<A.length;i++){
            System.out.println(A[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[] = new int[10];
        System.out.println("How many values do you want to enter: ");
        int size = input.nextInt();
        for (int i=0;i<size;i++){
            System.out.println("Enter number: ");
            A[i] = input.nextInt();
        }
        display(A);
        System.out.println("Enter value to del: ");
        int delnum = input.nextInt();
        int count=0;
        for (int i =0; i<size;i++){
            if (A[i] == delnum){
                 count = i;
            }
        }
        for (int i=count;i<size;i++){
            A[i] = A[i+1];
        }
        A[size-1] = 0;
        display(A);


    }
}
