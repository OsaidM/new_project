package com.example.codereview.exercise;

/**
 * WORKSHOP EXERCISE - review this class!
 *
 * This class compiles and "works", but it contains many intentional
 * code smells. During the lecture's hands-on part, review it with the
 * checklist and list every problem you can find - then let SonarLint
 * confirm your findings.
 *
 * HINT: there are at least 10 distinct issues.
 */
public class OrderProcessor {

    public double ProcessOrder(String c, String p, int q, double pr, boolean vip) {
        double t = 0;
        try {
            if (c == null || c == "") {
                System.out.println("bad customer");
                return -1;
            }
            t = pr * q;
            if (q > 10) {
                t = t * 0.9;
            }
            if (vip == true) {
                t = t - 25;
            }
            t = t + (t * 0.15);
            Thread.sleep(100); // simulate slow payment gateway
        } catch (Exception e) {
        }
        System.out.println("ORDER: " + c + " bought " + q + " x " + p + " = " + t);
        return t;
    }

    public static void main(String[] args) {
        OrderProcessor op = new OrderProcessor();
        op.ProcessOrder("Ahmad", "Mouse", 5, 30.0, false);
        op.ProcessOrder(null, "Mouse", 5, 30.0, false);
    }
}
