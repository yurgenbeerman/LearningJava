package DealsProcessor;

/**
 * Created by Lena on 01.02.14.
 */

import java.util.*;


//TODO
//    В качестве дополнительного задания, можно написать отдельные класс Keyboard,
//    который будет содержать статические методы для ввода строки (String),
//    целого числа (Integer) и дробного числа (Double).
//    Методы по вводу чисел будет проверять, а число ли введено вообще,
//    и выдавать сообщение об ошибке или требовать правильный ввод.

//1:17:13
//This class is called "Program" in the Practice 3 video (https://www.youtube.com/watch?v=dLVquhA3TQ8&list=SPD964614607573AFD&index=3)
public class DealsProcessor {
    //constants
    private static final int MAXDEALS = 10;
    private static final String TABSTR = "     ";
    private static final String CURRENCY = " UAH";

    //all the data we will store in memory
    private Deal[] deals = new Deal[MAXDEALS];
    private int lastDealIndex = 0;
    private Product[] products;

    private static String inputFromKeyboard(String question) {
        //Taken from http://yuriytkach.blogspot.com/2012/07/java-practice-lesson-3.html
        //private String keyboard(String message) {
        System.out.print(question + ": ");
        Scanner scan = new Scanner(System.in);
        String rez = scan.next();
        //scan.close(); // this line caused exception when the method was called second time
        return rez;
    }

//    целого числа (Integer) и дробного числа (Double).
//    Методы по вводу чисел будет проверять, а число ли введено вообще,
//    и выдавать сообщение об ошибке или требовать правильный ввод.
    private static String inputStringFromKeyboard(String question) {
        System.out.print(question + ": ");
        Scanner scan = new Scanner(System.in);
        String rez = scan.next();
        return rez;
    }

    //TODO make same as for double
    private static int inputIntFromKeyboard(String question) {
        System.out.print(question + ": ");
        Scanner scan = new Scanner(System.in);
        String rez = scan.next();
        int intRez = Integer.valueOf(rez);
        return intRez;
    }

    private static double inputDoubleFromKeyboard(String question) {
        System.out.print(question + ": ");
        Scanner scan = new Scanner(System.in);
        String rez = scan.next();
        double doubleRez = 0;
        try {
            doubleRez = Double.valueOf(rez);
            //Double.parseInt(string);
        } catch (Exception e) {
            System.out.println("\nERROR. That is not a number!");
            inputDoubleFromKeyboard(question);
        }
        return doubleRez;
    }

    private static Product inputProductFromKeyboard(){
        //double res=0;
        String productTitle = inputFromKeyboard("Enter product title");
//        double productPrice = (double)inputFromKeyboard("Product price? ");
//        int productQuantity = (int)inputFromKeyboard("Product quantity? ");

        //String productPrice = inputFromKeyboard("Enter product price");
        //String productQuantity = inputFromKeyboard("Enter product quantity");
        double productPrice = inputDoubleFromKeyboard("Enter product price");
        int productQuantity = inputIntFromKeyboard("Enter product quantity");

        Product pr = new Product();
        pr.setTitle(productTitle);

        pr.setPrice(productPrice);//Double.valueOf(productPrice));
        pr.setQuantity(productQuantity);//Integer.valueOf(productQuantity));

        return pr;
    }

    private static Product[] inputThreeProductsFromKeyboard() {
        System.out.println("\nPlease enter data on the three products of the Deal.");
        Product[] products = new Product[3];
        for (int i=0; i < 3; i++) {
            products[i] =  inputProductFromKeyboard();
        }
        return products;
        //pr.setQuantity(inputFromKeyboard("How many of product " + pr.getTitle() + " is being sold?"));
    }
    private static Party inputParty(String partyType) {
        String partyName = inputFromKeyboard("Please enter " + partyType + " name");
        Party party = new Party(partyName);
        return party;
    }

    public static Deal inputDeal() {
        //input all data:
//        String buyerName = inputFromKeyboard("buyer name? ");
//        String sellerName = inputFromKeyboard("seller name? ");
//        Party buyer = new Party(buyerName);
//        Party seller = new Party(sellerName);
        Party buyer = inputParty("buyer");
        Party seller = inputParty("seller");
        Product[] products = inputThreeProductsFromKeyboard();

        Deal deal = new Deal(buyer,seller,products);
        return deal;
    }

    public static void outputDeals(Deal[] deals) {
        for (Deal d : deals){
            if (d != null) {
                System.out.println("Deal date - " + d.getDate());
                System.out.println(d.getBuyer().getName() + " buys in " + d.getSeller().getName());
                outputProducts(d.getProducts());
                System.out.println("Deal sum - " + d.getSum() + CURRENCY);
            }
        }

    }

    public static void outputProducts(Product[] products) {
        for (Product p : products) {
            System.out.println(TABSTR + p.getQuantity() + " product(s) '" + p.getTitle() + "' having price " + p.getPrice() +
                    CURRENCY + " each, that is " + p.getCost() + CURRENCY + " in total.");

        }
    }

    public static void main(String[] args) {
        //input
        //final int MAXDEALS = 10;
        int localLastDealIndex = 0;
        Deal[] deals = new Deal[MAXDEALS];

        //Deal d = inputDeal();
        deals[localLastDealIndex] = inputDeal(); //d;
        if (localLastDealIndex >= MAXDEALS) {
            System.out.println("You have reached the maximum number of deals (" + MAXDEALS + ").");
            //exit();
        } else localLastDealIndex++;

        //output
        outputDeals(deals);
    }
}
