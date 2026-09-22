package com.example.codereview.strings;

/**
 * BAD EXAMPLE - comparing strings with ==.
 *
 * Review checklist failures:
 *  - == compares object references, not text content.
 *  - Works "by accident" for interned literals, then breaks in production.
 */
public class StringComparisonBad {

    public boolean isAdmin(String role) {
        return role == "ADMIN"; // BUG: reference comparison
    }

    public static void main(String[] args) {
        StringComparisonBad check = new StringComparisonBad();
        String role = new String("ADMIN"); // forces a distinct object
        System.out.println(check.isAdmin(role)); // false - surprise!
    }
}
