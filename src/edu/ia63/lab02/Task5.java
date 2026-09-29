package edu.ia63.lab02;

import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Task5 {

    static void main(String[] args) {
        int k = Input.readInt("Введіть k: ", 1, 34);
        double s = Input.readDouble("Введіть s: ");
        double sum=0;
        for (int i = 1; i <=k; i++) {
            sum += calculate(s,i);
        }
        System.out.println("Сума ряду: "+ sum);
    }

    private static double calculate(double s, int i) {
        return log10(sqrt(s / pow(i, 2)));
    }
}