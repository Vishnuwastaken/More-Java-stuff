package readingmaterial;

public class ReadingMaterial {
    protected static  String bookstoreName;
    private int id;
    private String title;
    private int pages;
    private int price;
    ReadingMaterial(int id, String title, int pages, int price){
        bookstoreName = "K&M Bookstore";
        this.id = id;
        this.pages = pages;
        this.price = price;
    }

    public static String getBookstoreName() {
        return bookstoreName;
    }
    public static void setBookstoreName(String bookstoreName) {
        ReadingMaterial.bookstoreName = bookstoreName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void changePriceBy(int increase){
        int newPrice = price + increase;
        if (newPrice>=0){
            this.price = newPrice;
        }
    }
    public static void main(String[] args) {
        ReadingMaterial readM = new ReadingMaterial(1025, "A Title", 99, 15);
        System.out.println(readM.id);
        System.out.println(readM.title);
        System.out.println(readM.pages);
        System.out.println(readM.price);

        readM.setId(1035);
        System.out.println("New id: " + readM.getId());
        readM.setTitle("Magazine");
        System.out.println("New Title: " + readM.getTitle());

        Book book1 = new Book(1060, "Little Prince", 250, 59, 2, "Antoine French guy");
        System.out.println(readM.getId());
        System.out.println(readM.getTitle());

    }

}
