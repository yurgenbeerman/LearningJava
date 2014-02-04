package DealsProcessor;

import java.util.*;
/**
 * Created by Lena on 01.02.14.
 */
public class Deal {
    ////int quantityOfProduct;
    private Date date = new Date(); // (1)works undependently of conctructor invoced (there may be diffferent constructors)
    private Party buyer;
    private Party seller;
    private Product[] products;

    public Deal(
            Party buyer,
            Party seller,
            Product[] pr
            ){
        this.buyer = buyer;
        this.seller = seller;
        this.products = pr;
        //date = new Date(); // see (1)
    }
    //if we can easily calculate, then it is better to use method getSumOfDeal
    //else it is better to use value dealSum;
    public double getSum() {
        double res=0;
        for (Product pr : products) {
        res += pr.getCost();//return sum of getCost() for each product
        }
        return res;
    }


    public Product[] getProducts() {
        return products;
    }

    public Date getDate() {
        return date;
    }

    public Party getBuyer() {
        return buyer;
    }

    public Party getSeller() {
        return seller;
    }




}
