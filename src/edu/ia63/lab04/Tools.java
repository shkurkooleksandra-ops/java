package edu.ia63.lab04;

import java.util.Random;

public class Tools {
    static String arrayToString(byte[] arr) {
        if (arr == null) {
            return "null";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int x : arr) {
            result += String.format("%6d", x);
        }
        result = result.substring(0, result.length()) + "]";
        return result;
    }

    static byte[] generateRandomArray(int size, int min, int max) {
        Random rand = new Random();
        byte[] arr = new byte[size];
        rand.nextBytes(arr);
        return arr;
    }
}
