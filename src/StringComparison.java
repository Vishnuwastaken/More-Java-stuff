// Write a program to input names and marks of students in 2 different arrays
// input a name and display the marks if the name is found, else error msg
public class StringComparison {

    static void search(String names[], int marks[], String namesearch){
        boolean found = false;
        for (int i=0; i<names.length; i++){
            if (names[i].equalsIgnoreCase(namesearch)){
                System.out.print(marks[i]);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.print("Name not found");
        }
    }
    public static void main(String[] args) {
        String N[] = {"Bob", "Jim", "Tom"};
        int M[] = {5,3,7};
        search(N,M, "Pete");

    }
}
