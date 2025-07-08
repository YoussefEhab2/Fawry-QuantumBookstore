package Book;

import Purchasable.Purchasable;
import Services.Shippingservice;
import Shippable.Shippable;

public class PaperBook extends Book implements Shippable, Purchasable {
    int stock;
    public PaperBook(String isbn, String title, int year, double price, int stock) {
    super(isbn, title, year, price);
    this.stock = stock;
    }
    @Override
    public void ship(String address) {
        Shippingservice shippingservice = new Shippingservice();
        shippingservice.ship(address,title);
    }
    @Override
    public double buy(int quantity,String email,String address){
        if(quantity>stock){
            throw new IllegalArgumentException("Quantity exceeds stock");
        }
        stock-=quantity;
        ship(address);
        return price*quantity;
    }
    public int getStock() {
        return stock;
    }
}
