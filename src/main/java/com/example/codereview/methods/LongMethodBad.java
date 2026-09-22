package com.example.codereview.methods;

/**
 * BAD EXAMPLE - one long method doing everything.
 *
 * Review checklist failures:
 *  - Method is long and does many things (no single responsibility).
 *  - Hard to test, hard to reuse, hard to read.
 */
public class LongMethodBad {

    public void processOrder(String customer, String product, int quantity, double price) {
        // validate
        if (customer == null || customer.isEmpty()) {
            System.out.println("Invalid customer");
            return;
        }
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
            return;
        }
        // calculate
        double total = price * quantity;
        if (quantity > 10) {
            total = total * 0.9;
        }
        double totalWithTax = total + (total * 0.15);
        // print receipt
        System.out.println("===== RECEIPT =====");
        System.out.println("Customer: " + customer);
        System.out.println("Product:  " + product);
        System.out.println("Qty:      " + quantity);
        System.out.println("Total:    " + totalWithTax);
        System.out.println("===================");
    }

    public static void main(String[] args) {
        new LongMethodBad().processOrder("Ahmad", "Keyboard", 12, 25.0);
    }
}
