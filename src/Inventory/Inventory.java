package Inventory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Book.Book;
public class Inventory {
    private List<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public void printInventory() {
        for (Book book : books) {
            System.out.println(book.getIsbn() + " - " + book.getTitle() + " (" + book.getYear() + ")");
        }
    }
    public Book getBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    public void removeOutdatedBook(int number) {
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        books.removeIf(book ->((currentyear-book.getYear())>number));

    }
}
