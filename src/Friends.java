//// the Date has 3 properties, day, month, yr all int with a default constructor, parameterized constructor,
import java.util.*;
class Date1 {
    private int day, month, year;
    public Date1(){
        day = 0;
        month = 0;
        year = 0;
    }
    public Date1(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return (day + " / " + month + " / " + year);
    }
    public int getDay(){
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
}
// it has 2 properties, name &Date of birth
class Human{
    private String name;
    private Date1 birthday;
    public Human(){
        name = null;
        birthday = null;
    }
    public Human(String name, Date1 birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public String toString(){
        return ("Name: " + name + " Birthday: " + birthday);
    }

    public String getName() {
        return name;
    }
}
// create an array of humans as a property of friend class
public class Friends {
    static Scanner input = new Scanner(System.in);
    private Human friends[];
    public Friends(){
        friends = new Human[10];
    }
    public void addfriend(Human h){
        int i = 0;
        while (friends[i]!= null && i<10 ){
            i++;
        }
        if (i==10){
            System.out.println("You have too many friends");
        }
        else {
            friends[i] = new Human();
            friends[i] = h;
        }
    }
    public String toString(){
        String s = " ";
        for (int i=0; friends[i]!=null && i<10;i++){
            s += '\n' + friends[i].toString();
        }
        return s;
    }
    public void search(){
        System.out.println("Enter a name to search: ");
        String name = input.nextLine();
        boolean found = false;
        for (int i=0; friends[i]!=null && i<10;i++){
            if (name.equalsIgnoreCase(friends[i].getName())){
                System.out.println(friends[i]);
                found = true;
                break;
            }
        }
        if (found == false){
            System.out.println(name + " not found");
        }
    }

    public void delfriend(){
        System.out.println("Which friend do you want to delete: ");
        String name = input.nextLine();
        int count=-1;
        boolean found = false;
        for (int i=0; friends[i]!=null; i++){
            if (name.equalsIgnoreCase(friends[i].getName())){
                count=i;
                found = true;
                break;
            }
        }

        if (found==true){
            int i;
            for ( i = count; friends[i]!=null;i++){
                friends[i] = friends[i+1];
            }
            friends[i] = null;
        }
        if (found == false){
            System.out.println("Invalid friend name");
        }

    }

    public static void main(String[] args) {
        int choice;
        String name;
        int day,month,yr;
        Date1 bday;
        Human h;
        Friends f = new Friends();

        do {
            System.out.println("1 for adding a friend ");
            System.out.println("2 for displaying all friends ");
            System.out.println("3 display details of a specific friend: ");
            System.out.println("4 to delete a friend");
            System.out.println("5 to exit");
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1){
                System.out.println("Enter name: ");
                name = input.nextLine();
                System.out.println("Enter day of birth: ");
                day = input.nextInt();
                System.out.println("Enter month of birth: ");
                month = input.nextInt();
                System.out.println("Enter year of birth: ");
                yr = input.nextInt();
                bday = new Date1(day,month,yr);
                h = new Human(name, bday);
                f.addfriend(h);
            }
            else if (choice==2){
                System.out.println(f);
            }
            else if (choice==3){
                f.search();
            }
            else if (choice==4){
                f.delfriend();
            }
            else if (choice==5){
                System.out.println("thank u");
            }
            else {
                System.out.println("Invalid choice entered");
            }
        }
           while(choice!=5);

    }
}
