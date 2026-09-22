package com.example.codereview.nulls;

/**
 * GOOD EXAMPLE - explicit, defensive null handling.
 *
 * The contract is clear: null or blank input gets a safe fallback.
 * Callers never receive a surprise NullPointerException.
 */
public class NullHandlingGood {

    private static final String DEFAULT_NAME = "Guest";

    public String buildGreeting(String firstName) {
        String safeName = (firstName == null || firstName.isBlank())
                ? DEFAULT_NAME
                : firstName.trim();
        return "Hello, " + safeName.toUpperCase() + "!";
    }

    public static void main(String[] args) {
        NullHandlingGood greeter = new NullHandlingGood();
        System.out.println(greeter.buildGreeting("layla"));
        System.out.println(greeter.buildGreeting(null));   // safe now
        System.out.println(greeter.buildGreeting("   "));  // safe now
    }
}
