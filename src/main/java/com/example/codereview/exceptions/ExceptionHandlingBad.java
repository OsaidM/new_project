package com.example.codereview.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * BAD EXAMPLE - poor exception handling.
 *
 * Review checklist failures:
 *  - Empty catch block swallows the error (debugging nightmare).
 *  - Catching generic Exception hides what actually failed.
 *  - Resource is never closed (leak).
 */
public class ExceptionHandlingBad {

    public String readFirstLine(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            return reader.readLine();
        } catch (Exception e) {
            // TODO: handle later
        }
        return null;
    }

    public static void main(String[] args) {
        String line = new ExceptionHandlingBad().readFirstLine("missing-file.txt");
        System.out.println("Result: " + line); // null, and nobody knows why
    }
}
