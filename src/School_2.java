//import java.util.*;
//public class School_2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[]names = new String[5];
//        int []grades = new int[5];
//        System.out.print("Enter name to store in an array: \n");
//        for (int i=0; i<5; i++){
//            names[i] = input.nextLine();
//        }
//        int sum = 0;
//        for (int i=0; i<5; i++){
//            System.out.print("Enter the grade for " + names[i] + ": ");
//            grades[i] = input.nextInt();
//            sum = sum+ grades[i];
//        }
//        for (int i=0; i<5; i++){
//            System.out.println(names[i] + " has a grade of: " + grades[i]);
//        }
//        float avg = sum/5f;
//        System.out.print('\n' + "The avg of all grades is: " + avg);
//    }
//}

//import java.util.*;
//public class School_2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[]names = new String[5];
//        int []grades = new int[5];
//        int sum = 0;
//        for (int i=0; i<5; i++){
//            System.out.print("Name: ");
//            names[i] = input.nextLine();
//            System.out.print("Grade of " + names[i] + ": ");
//            grades[i] = input.nextInt();
//            input.nextLine();
//            sum+=grades[i];
//        }
//        for (int i=0; i<5; i++){
//            System.out.println(names[i] + " has a grade of: " + grades[i]);
//        }
//        float avg = sum/5f;
//        System.out.print('\n' + "The avg of all grades is: " + avg);
//    }
//}

//public class School_2 {
//    public static void main(String[] args) {
//        int[][]a = {{10,20}, {30,40}};
//        System.out.println("Two dimensional arrays are: ");
//        System.out.println(a[0][0]);
//        System.out.println(a[0][1]);
//        System.out.println(a[1][0]);
//        System.out.println(a[1][1]);
//    }
//}

public class School_2 {
    public static void main(String[] args) {
        int[][]a = {{10,20}, {30,40}, {50,60}};
        System.out.println("Two dimensional array element are: ");
        for (int i =0; i< a.length; i++){
            for (int j = 0; j<a[0].length; j++){
                System.out.println(a[i][j]);
            }
        }

    }
}

//public class School_2 {
//    public static void main(String[] args) {
//        Product[] obj = new Product[5];
//        obj[0] = new Product(23907, "Dell Laptop");
//        obj[1] = new Product(91240, "HP 630");
//        obj[2] = new Product(29823, "LOG OLED TV");
//        obj[3] = new Product(11908, "MI Note Pro Max 9");
//        obj[4] = new Product(43590, "Kingston USB");
////        System.out.println("Product object 1: ");
////        obj[0].display();
////        System.out.println("Product object 2: ");
////        obj[1].display();
////        System.out.println("Product object 3: ");
////        obj[2].display();
////        System.out.println("Product object 4: ");
////        obj[3].display();
////        System.out.println("Product object 5: ");
////        obj[4].display();
//        for (int i=0; i<5; i++){
//            System.out.println("Product " + (i+1) + ": ");
//            obj[i].display();
//        }
//    }
//}
//class Product{
//    int pro_id;
//    String pro_name;
//    Product(int pid, String n){
//        pro_id = pid;
//        pro_name = n;
//    }
//    public void display(){
//        System.out.print("Product Id = " + pro_id + " " + " Product name = " + pro_name);
//        System.out.println();
//    }
//}
//
