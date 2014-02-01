package DealsProcessor;

import java.lang.reflect.Array;
import java.util.Date;

/**
 * Created by Lena on 01.02.14.
 */
public class Deal {
    ////int quantityOfProduct;
    Date date;
    Party buyer;
    Party seller;
    Array products;
    //if we can easily calculate, then it is better to use method getSumOfDeal
    //else it is better to use value dealSum;
    public double getSum() {
        //return sum of getCost() for each product
    }
}
