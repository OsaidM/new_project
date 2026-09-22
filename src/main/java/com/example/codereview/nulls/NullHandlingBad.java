package com.example.codereview.nulls;

/**
 * BAD EXAMPLE - fragile null handling.
 *
 * Review checklist failures:
 *  - Will throw NullPointerException when the name is null.
 *  - Empty/blank strings are not handled either.
 */
public class NullHandlingBad {

    public String buildGreeting(String firstName) {
        return "Hello, " + firstName.toUpperCase() + "!";
    }

    public static void main(String[] args) {
        NullHandlingBad greeter = new NullHandlingBad();
        System.out.println(greeter.buildGreeting("layla"));
        // Uncomment to see the crash students should predict in review:
        // System.out.println(greeter.buildGreeting(null));
    }
}
