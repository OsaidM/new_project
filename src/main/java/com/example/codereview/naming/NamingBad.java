package com.example.codereview.naming;

/**
 * BAD EXAMPLE - poor naming.
 *
 * Review checklist failures:
 *  - Names are abbreviations / single letters and carry no meaning.
 *  - The reader must reverse-engineer the intent of every line.
 */
public class NamingBad {

    public double calc(double p, int q, double d) {
        double t = p * q;
        double amt = t - (t * d);
        return amt + (amt * 0.15);
    }

    public static void main(String[] args) {
        NamingBad x = new NamingBad();
        System.out.println(x.calc(9.99, 3, 0.10));
    }
}
