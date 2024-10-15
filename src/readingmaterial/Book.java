package readingmaterial;

public class Book extends ReadingMaterial{
    private int chapters;
    private String author;
    public Book(int id, String title, int pages, int price, int chapters, String author){
        super(id, title, pages, price);
        this.chapters = chapters;
        this.author = author;
    }
    public int getChapters() {
        return chapters;
    }
    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

}
