package com.example.codereview.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * GOOD EXAMPLE - proper exception handling.
 *
 *  - try-with-resources closes the reader automatically.
 *  - Catches the specific exception (IOException), not generic Exception.
 *  - Failure is reported with context instead of being swallowed.
 */
public class ExceptionHandlingGood {

    public String readFirstLine(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("Could not read file '" + path + "': " + e.getMessage());
            return "";
        }
    }

    public static void main(String[] args) {
        String line = new ExceptionHandlingGood().readFirstLine("missing-file.txt");
        System.out.println("Result: '" + line + "'");
    }
}
