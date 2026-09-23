package edu.ia63;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Lab01 {

    static void main() {
        task10();
        task19();
        task28();
    }

    private static void task10() {
        double a = 1.27d;
        double b = 10.99d;
        double c = 2.73d;
        double d = 25.32d;
        double result = pow(a, b) / sinh(abs(b)) + 4 * log(c) / pow(d, 0.25d);
        System.out.println("Task10: " + result);
    }

    private static void task19() {
        double a = 1.234d;
        double b = -3.12d;
        double c = 5.45d;
        double d = 2.0d;
        double result = pow(tan(a), 1d / c) / (1 + sinh(b) / log(abs(d + c)));
        System.out.println("Task19: " + result);
    }

    private static void task28() {
        double a = 1.478d;
        double b = 9.26d;
        double c = 0.68d;
        double d = 2.24d;
        double result = 2 * (log(abs(b / a)) + sqrt(sinh(c) + pow(E, d)));
        System.out.println("Task28: " + result);
    }

}

