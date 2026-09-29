package edu.ia63.lab02;

import static java.lang.Math.sqrt;
public class Task9 {
    static void main() {
        int t = Input.readInt("Введіть t: ", 1, Integer.MAX_VALUE);
        int l = Input.readInt("Введіть l: ", 1, Integer.MAX_VALUE);
        if (isEven(l)) {
            System.out.println(calculateEven(l, t) * t);
        } else {
            System.out.println(calculateOdd(t, l) * t);
        }
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    private static double calculateOdd(int t, int l) {
        double sum = 0;
        for (int i = 1; i <= t; i++) {
            sum += sqrt(t * l);
        }
        return sum;
    }

    private static double calculateEven(int l, int t) {
        double sum = 0;
        for (int i = 1; i <= t; i++) {
            sum += l / sqrt(t);
        }
        return sum;
    }
}