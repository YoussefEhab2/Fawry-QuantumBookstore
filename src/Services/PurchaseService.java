package Services;

import Book.Book;
import Inventory.Inventory;
import Purchasable.Purchasable;

public class PurchaseService {
Inventory inventory;
public PurchaseService(Inventory inventory) {
    this.inventory = inventory;
}
public double buy(String isbn,int quantity,String email,String address) {
    Book book=inventory.getBook(isbn);
    if(book==null) {
       throw new IllegalArgumentException("Book not found");
    }else{
        if(book instanceof Purchasable purchasable){
            return purchasable.buy(quantity,email,address);
        }else{
            throw new IllegalArgumentException("This book is not for sale");
        }
    }
}
}
