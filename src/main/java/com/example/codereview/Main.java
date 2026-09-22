package com.example.codereview;

import com.example.codereview.dry.DuplicationGood;
import com.example.codereview.magic.MagicNumbersGood;
import com.example.codereview.methods.LongMethodGood;
import com.example.codereview.naming.NamingGood;
import com.example.codereview.nulls.NullHandlingGood;
import com.example.codereview.strings.StringComparisonGood;

/**
 * Simple runner that demonstrates the "good" versions of the examples.
 * Run this class in NetBeans (Run File) or with: mvn compile exec:java
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("== Naming ==");
        System.out.println(new NamingGood().calculateTotalWithVat(9.99, 3, 0.10));

        System.out.println("\n== Small methods ==");
        new LongMethodGood().processOrder("Ahmad", "Keyboard", 12, 25.0);

        System.out.println("\n== No magic numbers ==");
        System.out.println(new MagicNumbersGood().calculateFinalPrice(120, 10, true));

        System.out.println("\n== DRY ==");
        DuplicationGood shop = new DuplicationGood();
        System.out.println(shop.priceForRegularCustomer(50, 2));
        System.out.println(shop.priceForVipCustomer(50, 2));

        System.out.println("\n== Null handling ==");
        System.out.println(new NullHandlingGood().buildGreeting(null));

        System.out.println("\n== String comparison ==");
        System.out.println(new StringComparisonGood().isAdmin("ADMIN"));
    }
}
