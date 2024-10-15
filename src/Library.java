import java.util.*;
public class Library {
    private int acc_num;
    private String title,author;
    private Boolean bestseller;

    public Library(){
        acc_num = 0;
        title = "";
        author = "";
        bestseller = false;
    }
    public Library(int acc_num, String title, String author, Boolean bestseller){
        this.acc_num = acc_num;
        this.title = title;
        this.author = author;
        this.bestseller = bestseller;
    }
    public void input(int acc_num, String title, String author, Boolean bestseller){
        this.acc_num = acc_num;
        this.title = title;
        this.author = author;
        this.bestseller = bestseller;
    }
    // first 3 days no fine, any additional day up to 10th day, 2$ daily, beyond that 5$ daily
    public int compute(int days){
        int fine;
        if (bestseller==false){
            if (days<=3){
                return 0;
            }
            else if (days<=10 && days>3){
                fine = (days-3)*2;
                return fine;
            }
            else {
                fine = (days-10)*5 + 14;
                return fine;
            }
        }
        else{
            if (days<3){
                return 0;
            }
            else if (days<=7 && days>3){
                fine = (days-3)*2;
                return fine;
            }
            else{
                fine = (days-7)*4 + 8;
                return fine;
            }
        }


    }
    public void display(){
        System.out.println("Accesion number: " + acc_num);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Best seller: " + bestseller);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library book = new Library();
        book.display();
        System.out.println("Enter accesion number: ");
        int acc_num = input.nextInt();
        input.nextLine();
        System.out.println("Enter title: ");
        String title = input.nextLine();
        System.out.println("Enter author: ");
        String author = input.nextLine();

        System.out.println("Was it a best seller (y or any thing else):  ");
        char sell = input.next().charAt(0);
        if (sell == 'y'){
            book.bestseller = true;
        }
        else{
            book.bestseller = false;
        }

        book.input(acc_num, title, author, book.bestseller);
        book.display();

        System.out.println("Enter days late of submission: ");
        int days = input.nextInt();
        int fine = book.compute(days);
        System.out.println("You have to pay a fine of: " + fine);


        Library book2 = new Library(30, "Crucible", "Miller", false);
        book2.display();

    }
}
