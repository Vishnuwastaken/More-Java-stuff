// define a class book which has an id, name, price
// define another class library, which has an array of books as an attribute
// In library write a function to add a book to library
// Write a function find the most expensive book

class Book{
    private int id;
    private String name;
    private int price;

    public Book(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class Lib{
    public Book[] books = new Book[10];

    public void addBook(Book newBook){
        int i=0;
        while(books[i]!=null && i<10){
            i++;
        }
        books[i] = newBook;
    }
    // return book with price of 100 or return highest price
    public int price(){
        int j=0;
        int max=0;
        while (books[j]!=null && j<10){
            if (books[j].getPrice() > books[max].getPrice()){
                max = j;
            }
            if (books[j].getPrice() == 100){
                max = j;
                break;
            }

            j++;
        }
        return max;
    }
    public void display(){
        int i =0;
        while (books[i]!=null && i<10){
            System.out.print(books[i].toString());
            i++;
        }
    }
}
public class OOP3 {
    public static void main(String[] args) {
        Lib L1 = new Lib();
        Book B1 = new Book(1, "Bible", 30);
        Book B2 = new Book(2, "History", 40);
        Book B3 = new Book(3, "Comp Sci", 50);
        L1.addBook(B1);
        L1.addBook(B2);
        L1.addBook(B3);
        int highprice =L1.price();
        System.out.println(L1.books[highprice].toString());
    }
}
