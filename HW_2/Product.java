package MTS.HW_1;

public class Product {
    int amount; // product amount
    float price; // product price
    float discount; // product discount

    /**
     * Constructor
     * @param amount
     * @param price
     * @param discount
     */
    public Product(int amount, float price, float discount) {
        this.amount = amount;
        this.price = price;
        this.discount = discount;
    }

    /**
     * Print price without discount
     * and price with discount
     * @param p
     */
    static void getPriceList(Product p) {
        System.out.printf("Price without discount: %.2f\n", p.amount * p.price);
        System.out.printf("Price with discount: %.2f\n", p.amount * p.price * (1 - p.discount));
    }
}
