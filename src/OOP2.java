// write a class client which has data members, customer id (int), name (string), arrive, leave (date) using class date
// also define constructor, setters, and getters of this class
// define the class date with 3 private data members, day, month, yr where all are int and member function which displays date in the format of dd/mm/yr
import java.util.*;
class date {
    private int day,month,year;
    public date(){
        System.out.println("hi");
    }
    public date(int dd, int mm, int yr){
        day = dd;
        month = mm;
        year = yr;
    }
    public void display(){
        System.out.println(day + " / " + month + " / " + year);
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
}
class client{
    private int id;
    private String name;
    private date arrive,leave;
    public client(int id, String name, date arrive, date leave){
        this.id = id;
        this.name = name;
        this.arrive = arrive;
        this.leave = leave;
    }
    public void display(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("arrive: ");
                 arrive.display();
        System.out.println("leave: ");
                leave.display();
    }
}
public class OOP2 {
    public static void main(String[] args) {
        date d = new date();
        d.display();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day: ");
        int day = input.nextInt();
        System.out.println("Enter month: ");
        int month = input.nextInt();
        System.out.println("enter yr: ");
        int yr = input.nextInt();

        d.setDay(day);
        d.setMonth(month);
        d.setYear(yr);
        d.display();

        System.out.println("Enter what you want to view (d, m, y): ");
        char choice = input.next().charAt(0);
        if (choice == 'd') {
            System.out.print(d.getDay());
        }
        else if (choice == 'm') {
            System.out.print(d.getMonth());
        }
        else if (choice == 'y') {
            System.out.print(d.getYear());
        }


//        date d1 = new date(30,1,1950);
//        date d2 = new date(2, 2, 2222);
//        client c1 = new client(544, "Bob", d1, d2);
//        c1.display();
    }
}