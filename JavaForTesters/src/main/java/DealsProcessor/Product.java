package DealsProcessor;

/**
 * Created by Lena on 01.02.14.
 */
public class Product {

    String title;
    double price;
    int quantity;
    //int quantityAvailable;

    public double getCost() {
        return (quantity * price);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
