import Inventory.Inventory;
import Book.PaperBook;
import Book.Book;
import Book.EBook;
import Book.Demobook;
import Services.PurchaseService;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addBook(new PaperBook("ISBN001", "Java 101", 2010, 250, 3));
        inventory.addBook(new EBook("ISBN002", "Clean Code", 2015, 150, "pdf"));
        inventory.addBook(new Demobook("ISBN003", "Design Patterns", 2000, 0));

        inventory.printInventory();

        PurchaseService purchaseService = new PurchaseService(inventory);

        System.out.println("\n-- Buying Java 101 --");
        double amount = purchaseService.buy("ISBN001", 2, "something@gmail.com", "Cairo, Egypt");
        System.out.println("Total paid: " + amount);

        System.out.println("\n-- Buying Clean Code --");
        amount = purchaseService.buy("ISBN002", 1, "something@gmail.com", "N/A");
        System.out.println("Total paid: " + amount);

        System.out.println("\n-- Removing outdated books --");
        inventory.removeOutdatedBook(9);
        inventory.printInventory();
    }
}