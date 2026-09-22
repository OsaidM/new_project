package com.example.codereview.strings;

/**
 * GOOD EXAMPLE - comparing strings with equals(), null-safe order.
 *
 * Putting the constant first ("ADMIN".equals(role)) also protects
 * against a NullPointerException when role is null.
 */
public class StringComparisonGood {

    private static final String ADMIN_ROLE = "ADMIN";

    public boolean isAdmin(String role) {
        return ADMIN_ROLE.equals(role);
    }

    public static void main(String[] args) {
        StringComparisonGood check = new StringComparisonGood();
        System.out.println(check.isAdmin(new String("ADMIN"))); // true
        System.out.println(check.isAdmin(null));                // false, no crash
    }
}
