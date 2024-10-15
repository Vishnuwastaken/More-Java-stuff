// Write a program to store names and marks of 5 students in 2 arrays and display name of student with highest marks
// input a name and display a students marks if the name isnt found, display an appropriate msg
import java.util.*;
public class Array3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = {"Bob", "Jim", "Tim", "Jeff", "John"};
        int[] marks = new int[5];
        for (int i=0; i<5; i++){
            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = input.nextInt();
        }
        for (int j=0; j<5; j++){
            System.out.println(names[j] + " has " + marks[j]);
        }
        int highest = marks[0];
        String topper = names[0];
        int sum = 0;
        for (int k=0; k<5;k++){
            sum = sum+marks[k];
            if (marks[k] > highest){
                highest = marks[k];
                topper = names[k];
            }
        }
        input.nextLine();
        System.out.print("Enter a name to see marks: ");
        String searchname = input.nextLine();
        boolean found = false;
        int i = 0;
        while(!found && i<5){
            if (names[i].equalsIgnoreCase(searchname)){
                found = true;
                System.out.println(searchname.toUpperCase() + " was found and had marks of: " + marks[i]);
            }
            i++;
        }
        float avg = sum/5f;
        System.out.println("The topper is: " + topper);
        System.out.println("The avg of 5 ppl is: " + avg);
        if (!found){
            System.out.println(searchname.toUpperCase() + " not found");
        }
    }
}

/*
NAMES = ["Bob", "Jim", "Tim", "Jeff", "John"]
MARKS[] = new Array(5)
loop I from 0 to 4
    output ("Enter the marks of", NAMES[I], ": ")
    input MARKS[I]
end loop
loop J from 0 to 4
    output (NAMES[J], " has " + MARKS[J])
end loop
 */

