package Book;

import Emailable.Emailable;
import Purchasable.Purchasable;
import Services.MailService;

public class EBook extends Book implements Purchasable, Emailable {
    String filetype;
    public EBook(String isbn, String title, int year, double price, String filetype) {
        super(isbn, title, year, price);
        this.filetype = filetype;
    }
    public String getFiletype() {
        return filetype;
    }
    @Override
    public double buy(int quantity, String email,String address) {
        email(email);
        return price*quantity;
    }
    @Override
    public void email(String email) {
        MailService mailService = new MailService();
        mailService.send(email, filetype);
    }
}
