// reverse an array of strings
//public class StringArrays {
//    static void reverse(String[] words){
//        for (int i=0, j= words.length-1 ; i<= words.length/2; i+=1, j--){
//            String temp = words[i];
//            words[i] = words[j];
//            words[j] = temp;
//        }
//    }
//    static void display(String[] array){
//        System.out.println();
//        for (int i=0; i< array.length; i++){
//            System.out.print(array[i] + " , ");
//        }
//    }
//
//    public static void main(String[] args) {
//        String[] fruit = {"Apple", "Banana", "Coconut", "Dragonfruit", "Orange"};
//        display(fruit);
//        reverse(fruit);
//        display(fruit);
//
//    }
//}

// Write a function that takes an ID as a parameter and displays the name of the student corresponding with the ID
public class StringArrays {
    static void searchid(int[] studentid, String[] studentname, int id){
        boolean found = false;
        for (int i=0; i< studentid.length; i++){
            if (studentid[i] == id){
                found = true;
                System.out.print(studentname[i]);
                break;
            }
            }
        if (!found){
            System.out.print("Not found");
        }
        }
        static void searchname(int[] studentid, String[] studentname, String name){
        boolean found =  false;
        for (int i=0; i< studentname.length;i++){
            if (studentname[i].equalsIgnoreCase(name)){
                found = true;
                System.out.print(studentname[i] + " -  " + studentid[i]);
                break;
            }
        }
        if (!found){
            System.out.print("Not found ");
        }
        }

    public static void main(String[] args) {
        String[] names = {"Bob", "Tom", "Jerry"};
        int [] idnum = {10,20,30};
//        searchid(idnum,names, 20);
        searchname(idnum, names, "Bob");

    }
}

// Write a function that searches for a name and displays its corresponding ID if found else shows error msg