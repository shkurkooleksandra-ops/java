package edu.ia63.lab03;

import java.util.Random;

public class Tools {
    static int[] generateRandomArray(int size, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        return arr;
    }

    static void printArray(int[] arr) {
        String result = "[";
        for (int x : arr) {
            result += x + ", ";
        }
        result = result.substring(0, result.length() - 2) + "]";
        System.out.println(result);
    }

    static String arrayToString(int[] arr) {
        String result = "[";
        for (int x : arr) {
            result += String.format("%6d", x);
        }
        result = result.substring(0, result.length()) + "]";
        return result;
    }

    static int[][] generateRandomMatrix(int lines, int columns, int min, int max) {
        int[][] matrix = new int[lines][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }

    static String matrixToString(int[][] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arrayToString(arr[i]) + "\n";
        }
        return result;
    }
}
