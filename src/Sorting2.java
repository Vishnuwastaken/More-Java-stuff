// create 2 parallel arrays marks, and name. Sort both of them in descending order of marks
public class Sorting2 {
    public static void display(int [] Array, String [] Array2){
        System.out.println("Names:        Marks: ");
        for (int i=0;i<Array.length;i++){
            System.out.println(Array2[i] + "    " + Array[i]);
        }
    }
    //write a function binary search that takes marks as parameter and displays their name
//    public static void binary_search(int[] marks, String[] names, int search){
//        boolean found = false;
//        int low=0, high =  ;
//
//
//    }

    public static void main(String[] args) {
        String[] names = {"Bob", "Jeff", "Tim", "Tom"};
        int[] marks = {4,2,7,3};
        int i,j,temp;
        String temp2;
        display(marks, names);
        for (i=0;i<=marks.length-2;i++){
            for (j=0;j<=marks.length-2-i;j++){
                if (marks[j] < marks[j+1]){
                    temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                    temp2 = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp2;
                }
            }
        }
        System.out.print("After sorting: ");
        display(marks,names);
    }
}
