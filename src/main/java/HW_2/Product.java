package HW_2;

import java.math.BigDecimal;

/**
 * The class stores product fields like
 * amount, price and discount
 */
public class Product {
    int amount; // product amount
    BigDecimal price; // product price
    BigDecimal discount; // product discount

    /**
     * Constructor
     *
     * @param amount set product amount
     * @param price set product price
     * @param discount set product discount
     */
    public Product(int amount, BigDecimal price, BigDecimal discount) {
        this.amount = amount;
        this.price = price;
        this.discount = discount;
    }
}
