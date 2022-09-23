public class ShipCostCalculator {
    public static void main(String[] args) {

    double itemPrice;
    double SHIPPING_RATE=.02;
    double totalPrice;
    double shippingCost=0;


        System.out.println("What is the price of your item?");
        itemPrice=96;
        System.out.println("Your item price is: " + itemPrice);

        if (itemPrice<100) {
            shippingCost = itemPrice * SHIPPING_RATE;
        }
        totalPrice=shippingCost+itemPrice;


        System.out.println("Your shipping price is: " + shippingCost);
        System.out.println("Your total price is: " + totalPrice);
    }
}
