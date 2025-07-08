package Book;

public class Book {
    String isbn;
    String title;
    int year;
    double price;
    public Book(String isbn, String title, int year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
}
