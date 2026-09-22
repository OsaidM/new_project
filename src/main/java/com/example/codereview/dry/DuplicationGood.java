package com.example.codereview.dry;

/**
 * GOOD EXAMPLE - shared logic extracted into one place (DRY).
 *
 * Validation and tax calculation now exist exactly once.
 * Fixing a bug fixes it for every customer type.
 */
public class DuplicationGood {

    private static final double TAX_RATE = 0.15;
    private static final double VIP_DISCOUNT_AMOUNT = 10.0;

    public double priceForRegularCustomer(double price, int quantity) {
        return calculateTotalWithTax(price, quantity);
    }

    public double priceForVipCustomer(double price, int quantity) {
        return calculateTotalWithTax(price, quantity) - VIP_DISCOUNT_AMOUNT;
    }

    private double calculateTotalWithTax(double price, int quantity) {
        validate(price, quantity);
        double total = price * quantity;
        return total + (total * TAX_RATE);
    }

    private void validate(double price, int quantity) {
        if (price < 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid price or quantity");
        }
    }

    public static void main(String[] args) {
        DuplicationGood shop = new DuplicationGood();
        System.out.println(shop.priceForRegularCustomer(50, 2));
        System.out.println(shop.priceForVipCustomer(50, 2));
    }
}
