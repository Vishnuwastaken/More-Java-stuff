import java.util.*;
class movieMagic{
    private int year;
    private String title;
    private float rating;
    public movieMagic(){
        year = 0;
        title = "";
        rating = 0;
    }
    public void accept(int year, String title, float rating){
        this.year = year;
        this.title = title;
        this.rating = rating;
    }
    public void display(){
        if (rating>=0 && rating<=2){
            System.out.println(title + " was a flop");
        }
        else if (rating>2 && rating<=3.4){
            System.out.println(title + " was a semi hit");
        }
        else if (rating>3.4 && rating<=4.5){
            System.out.println(title + " was a hit");
        }
        else {
            System.out.println(title + " was a super hit");
        }
    }
}
public class ArrayofObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        movieMagic[]movies = new movieMagic[3];
        for (int i=0; i< movies.length; i++){
            System.out.println("Enter movie title: ");
            String title = input.nextLine();
            System.out.println("Enter release year: ");
            int year = input.nextInt();
            System.out.println("Enter rating: ");
            float rating = input.nextFloat();
            input.nextLine();
            movies[i] = new movieMagic();
            movies[i].accept(year, title, rating);
        }
        for (int i=0; i<movies.length; i++){
            movies[i].display();
        }
    }
}