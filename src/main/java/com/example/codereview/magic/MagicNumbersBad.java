package com.example.codereview.magic;

/**
 * BAD EXAMPLE - magic numbers.
 *
 * Review checklist failures:
 *  - Unexplained literals (0.15, 0.9, 1000) force the reader to guess.
 *  - If the business rule changes, you must hunt down every literal.
 */
public class MagicNumbersBad {

    public double calculateFinalPrice(double price, int quantity, boolean isMember) {
        double total = price * quantity;
        if (total > 1000) {
            total = total * 0.9;
        }
        if (isMember) {
            total = total - 25;
        }
        return total + (total * 0.15);
    }

    public static void main(String[] args) {
        System.out.println(new MagicNumbersBad().calculateFinalPrice(120, 10, true));
    }
}
