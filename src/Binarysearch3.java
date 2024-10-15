import java.util.*;
public class Binarysearch3 {
    // function selection sort
    public static void selection(int[]A, String[]B){
        int i,min,j;
        for (i=0;i<=A.length-2;i++){
            min=i;
            for (j=i+1;j<=A.length-1;j++){
                if (B[j].compareToIgnoreCase(B[min]) < 0){
                    min=j;
                }
            }
            String temp = B[i];
            B[i] = B[min];
            B[min] = temp;
            int temp2 = A[i];
            A[i] = A[min];
            A[min] =temp2;
        }
    }
    // function to display both array
    public static void display(int[]A, String[]B){
        int i;
        for (i=0;i<A.length;i++){
            System.out.print(B[i] + " , ");
            System.out.print(A[i] + " , ");
            System.out.println();
        }
    }
    // function that does binary search
    public static void search(int[]A, String[]B){
        Scanner input = new Scanner(System.in);
        int i,j,mid;
        int low = 0;
        int high = A.length-1;
        boolean found = false;
        System.out.print("Enter name to search: ");
        String search = input.nextLine();
        while (!found && low<=high){
            mid = (low+high)/2;
            if (B[mid].compareToIgnoreCase(search)==0){
                System.out.println(search + " found at position: " + (mid+1));
                System.out.println(search + " has grade of " + A[mid]);
                found =true;
            }
            else if (search.compareToIgnoreCase(B[mid])<0){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if (!found){
            System.out.print(search + " wasn't found");
        }
    }

    public static void main(String[] args) {
        int[] marks = {1,6,2,7};
        String[] names = {"Bob", "Jim", "Jeff", "Fish"};
        System.out.println("Before sorting: ");
        display(marks, names);
        selection(marks,names);
        System.out.println("After sorting: ");
        display(marks, names);
        search(marks, names);
    }
}
