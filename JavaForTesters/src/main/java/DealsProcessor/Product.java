package DealsProcessor;

/**
 * Created by Lena on 01.02.14.
 */
public class Product {
    String title;
    double price;
    //int quantityAvailable;
    int quantity;

    public double setCost() {
        return quantity * price;
    }

}
