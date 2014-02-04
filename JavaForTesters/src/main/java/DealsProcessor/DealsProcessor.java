package DealsProcessor;

/**
 * Created by Lena on 01.02.14.
 */

import java.util.*;

//This class is called "Program" in the Practice 3 video (https://www.youtube.com/watch?v=dLVquhA3TQ8&list=SPD964614607573AFD&index=3)
public class DealsProcessor {
    //all the date we will store in memory
    private Deal[] deals;
    private Product[] products;

    private String getFromKeyboard(String question) {
        //
        return "";
    }

    private Product getProductFromKeyboard(){
        //double res=0;
        String productTitle = getFromKeyboard("Product title? ");
//        double productPrice = (double)getFromKeyboard("Product price? ");
//        int productQuantity = (int)getFromKeyboard("Product quantity? ");
        String productPrice = getFromKeyboard("Product price? ");
        String productQuantity = getFromKeyboard("Product quantity? ");
        Product pr = new Product();
        pr.setTitle(productTitle);
        pr.setPrice(Double.valueOf(productPrice));
        pr.setQuantity(Integer.valueOf(productQuantity));
        return pr;
    }

    private Product[] getThreeProductsFromKeyboard() {
        System.out.println("\nPlease enter data on the yhree products of the Deal.");
        Product[] products = new Product[3];
        for (int i=0; i < 3; i++) {
            products[i] =  getProductFromKeyboard();
        }
        return products;
        //pr.setQuantity(getFromKeyboard("How many of product " + pr.getTitle() + " is being sold?"));
    }
    private Party inputParty(String partyType) {
        String partyName = getFromKeyboard(partyType + " name? ");
        Party party = new Party(partyName);
        return party;
    }

    public Deal input() {
        //input all data:
//        String buyerName = getFromKeyboard("buyer name? ");
//        String sellerName = getFromKeyboard("seller name? ");
//        Party buyer = new Party(buyerName);
//        Party seller = new Party(sellerName);
        Party buyer = inputParty("buyer");
        Party seller = inputParty("seller");
        Product[] products = getThreeProductsFromKeyboard();

        Deal deal = new Deal(buyer,seller,products);
        return deal;
    }
    public static void main(String[] args) {


        //input
        //output
    }
}
