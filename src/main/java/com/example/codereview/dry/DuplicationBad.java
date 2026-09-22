package com.example.codereview.dry;

/**
 * BAD EXAMPLE - duplicated logic (violates DRY: Don't Repeat Yourself).
 *
 * Review checklist failures:
 *  - The same validation + price formula is copy-pasted in two methods.
 *  - A bug fixed in one copy will survive in the other.
 */
public class DuplicationBad {
    private final double VAT = 0.15;
    private final double DISCOUNT = 10;
    
    public double priceForRegularCustomer(double price, int quantity) {
        
        return calculateTotalWithTax(price, quantity);
    }

    public double priceForVipCustomer(double price, int quantity) {
        if (price < 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid price or quantity");
        }
        return calculateTotalWithTax(price, quantity) - 10; // VIP discount
    }
    
    public double calculateTotalWithTax(double price, int quantity){
        if (price < 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid price or quantity");
        }
        double total = price * quantity;
        return total + total * VAT;
    }
    
    public static void main(String[] args) {
        DuplicationBad shop = new DuplicationBad();
        System.out.println(shop.priceForRegularCustomer(50, 2));
        System.out.println(shop.priceForVipCustomer(50, 2));
    }
}
