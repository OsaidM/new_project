package com.example.codereview.methods;

/**
 * GOOD EXAMPLE - small methods, each with a single responsibility.
 *
 * Same behavior as LongMethodBad, decomposed so every method
 * answers one question and can be tested on its own.
 */
public class LongMethodGood {

    private static final double TAX_RATE = 0.15;
    private static final double BULK_DISCOUNT_RATE = 0.10;
    private static final int BULK_DISCOUNT_THRESHOLD = 10;

    public void processOrder(String customer, String product, int quantity, double price) {
        if (!isValidOrder(customer, quantity)) {
            return;
        }
        double total = calculateTotal(price, quantity);
        printReceipt(customer, product, quantity, total);
    }

    private boolean isValidOrder(String customer, int quantity) {
        if (customer == null || customer.isEmpty()) {
            System.out.println("Invalid customer");
            return false;
        }
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
            return false;
        }
        return true;
    }

    private double calculateTotal(double price, int quantity) {
        double total = price * quantity;
        if (quantity > BULK_DISCOUNT_THRESHOLD) {
            total = total * (1 - BULK_DISCOUNT_RATE);
        }
        return total + (total * TAX_RATE);
    }

    private void printReceipt(String customer, String product, int quantity, double total) {
        System.out.println("===== RECEIPT =====");
        System.out.println("Customer: " + customer);
        System.out.println("Product:  " + product);
        System.out.println("Qty:      " + quantity);
        System.out.println("Total:    " + total);
        System.out.println("===================");
    }

    public static void main(String[] args) {
        new LongMethodGood().processOrder("Ahmad", "Keyboard", 12, 25.0);
    }
}
