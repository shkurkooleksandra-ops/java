package edu.ia63.lab01;

import static java.lang.Math.*;


public class Lab01 {
    static void main(String[] args) {
        task05();
        task14();
        task23();
    }

    private static void task05() {
        double a = 2.54;
        double b = 1.23;
        double c = -2.14;
        double d = -0.23;
        double y = 2 * cos(pow(a, b)) + abs(acos(-sqrt(d / c)));
        System.out.println("Task 5: " + y);
    }

    private static void task14() {
        double a = 1.54;
        double b = 0.49;
        double c = 24.1;
        double d = 0.87;
        double y = 2 * sqrt(sin(a) / abs(tan(b - a)) + log(c) / d);
        System.out.println("Task 14: " + y);
    }

    private static void task23() {
        double a = -3.45;
        double b = -2.34;
        double c = 1.45;
        double d = 0.83;
        double y = 5 * c / cos(a) + sqrt(sinh(abs(b) * c) / tan(d));
        System.out.println("Task 23: " + y);
    }

}
(Math.pow(34))

