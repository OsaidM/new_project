package com.example.codereview.magic;

/**
 * GOOD EXAMPLE - named constants instead of magic numbers.
 *
 * The business rules are now visible at a glance and each rule
 * lives in exactly one place.
 */
public class MagicNumbersGood {

    private static final double TAX_RATE = 0.15;
    private static final double FREE_DISCOUNT_THRESHOLD = 1000.0;
    private static final double LARGE_ORDER_DISCOUNT_RATE = 0.10;
    private static final double MEMBER_DISCOUNT_AMOUNT = 25.0;

    public double calculateFinalPrice(double price, int quantity, boolean isMember) {
        double total = price * quantity;
        if (total > FREE_DISCOUNT_THRESHOLD) {
            total = total * (1 - LARGE_ORDER_DISCOUNT_RATE);
        }
        if (isMember) {
            total = total - MEMBER_DISCOUNT_AMOUNT;
        }
        return total + (total * TAX_RATE);
    }

    public static void main(String[] args) {
        System.out.println(new MagicNumbersGood().calculateFinalPrice(120, 10, true));
    }
}
