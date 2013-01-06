package chapter8;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/6/13
 * Time: 10:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class Item48 {

    public static void main (String[] args)
    {
        //Double Version
//        double funds = 1.00;
//        int itemsBought = 0;
//        for(double price = .10; funds>=price; price +=.10)
//        {
//            funds -= price;
//            itemsBought++;
//        }
//
//        System.out.println(itemsBought + " itemsBought. ");
//        System.out.println("Change: $" + funds);

        //Big Decimal version
        final BigDecimal TEN_CENTS = new BigDecimal(".10");
        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for(BigDecimal price = TEN_CENTS; funds.compareTo(price)>=0;price = price.add(TEN_CENTS))
        {
            itemsBought++;
            funds = funds.subtract(price);
        }
           System.out.println(itemsBought + " itemsBought. ");
           System.out.println("Change: $" + funds);
    }
}
