// Write a program with a function binaryserach that displays the index, of the element found
public class Binarysearch {
    static void binarysearch(int A[], int searchvalue){
        int low = 0;
        int high = A.length-1;
        boolean found = false;
        while(low <= high && !found){
            int mid = (low+high)/2;
            if (A[mid]==searchvalue){
                System.out.print("Element found at index " + mid);
                found = true;
            }
            else if (searchvalue>A[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
       if (!found){
           System.out.print("Value not found");
       }
    }
    public static void main(String[] args) {
     int array[] = {5,10,15,20,25};
     binarysearch(array, 9);
    }
}
