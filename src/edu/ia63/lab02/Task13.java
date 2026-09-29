package edu.ia63.lab02;

public class Task13 {

    static void main(String[] args) {
        double e = Input.readDouble("Введіть e: ");
        double prev, current = 0;
        double sum = 0;

        int i = 1;
        do {
            prev = current;
            current = minusOnePow(i) / factorial(i);
            i++;
            sum += current;
            System.out.println(i);
            System.out.println(sum);

        } while (Math.abs(prev - current) > e);
        System.out.println(sum);
    }

    static int minusOnePow(int n) {
        return n % 2 == 0 ? 1 : -1;
    }

    static double factorial(int n) {
        if (n == 0) return 1;
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}