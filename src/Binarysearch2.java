//public class Binarysearch2 {
//    static void binarysearch(int[] numbers, int searchvalue){
//        int low = 0;
//        int high = numbers.length-1;
//        boolean found = false;
//        while (low<=high && !found){
//            int mid = (low+high)/2;
//            if(numbers[mid]==searchvalue){
//                System.out.println(searchvalue + " Found at index " + mid);
//                found = true;
//            }
//            else if (searchvalue>numbers[mid]){
//                high = mid-1;
//            }
//            else{
//                low = mid+1;
//            }
//        }
//        if (!found){
//            System.out.println(searchvalue + " wasnt found");
//        }
//    }
//    public static void main(String[] args) {
//     int[] array = {100,80,60,40,20};
//     binarysearch(array, 30);
//    }
//}


public class Binarysearch2 {
    static void binarysearch(String A[], String searchvalue){
        int low = 0;
        int high = A.length-1;
        boolean found = false;
        while (low<=high && !found){
            int mid = (low+high)/2;
            if (A[mid].equalsIgnoreCase(searchvalue)){
                System.out.print(searchvalue + " found at " + mid);
                found = true;
            }
            else if (A[mid].compareToIgnoreCase(searchvalue)>0){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if (!found){
            System.out.print(searchvalue + " Not found");
        }
    }
    public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "Carrot", "Dragonfruit", "Elon"};
        binarysearch(array, "Banana");
    }
}