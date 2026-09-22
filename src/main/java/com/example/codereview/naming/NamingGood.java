package com.example.codereview.naming;

/**
 * GOOD EXAMPLE - intention-revealing names.
 *
 * Same logic as NamingBad, but every name explains itself.
 * No comments are needed because the code reads like prose.
 */
public class NamingGood {

    private static final double VAT_RATE = 0.15;

    public double calculateTotalWithVat(double unitPrice, int quantity, double discountRate) {
        double subtotal = unitPrice * quantity;
        double discountedTotal = subtotal - (subtotal * discountRate);
        return discountedTotal + (discountedTotal * VAT_RATE);
    }

    public static void main(String[] args) {
        NamingGood invoice = new NamingGood();
        System.out.println(invoice.calculateTotalWithVat(9.99, 3, 0.10));
    }
}
