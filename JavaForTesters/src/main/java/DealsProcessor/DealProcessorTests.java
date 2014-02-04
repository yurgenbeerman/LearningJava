package DealsProcessor;

import java.util.*;

/**
 * Created by Lena on 01.02.14.
 */
public class DealProcessorTests {
    public static void main(String[] args) {

}
    //test methods of Product class
    private static void testProduct(){
        Product p = new Product();
        p.setPrice(11.11);
        p.setQuantity(10);
        double cost = p.getCost();
        if (cost != 11.11*10) {
            System.out.println("Product.getCost() works WRONG!");
        }
    }
}