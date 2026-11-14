package edu.ia63.lab04;

import static edu.ia63.lab04.Tools.arrayToString;
import static edu.ia63.lab04.Tools.generateRandomArray;

public class Task26 {
    static void main(String args[]) {
        Sorting s = new SortingStrategy();
        sort(s, null);
        sort(s, new byte[0]);
        sort(s, new byte[]{10});
        byte[] x = generateRandomArray(5, Byte.MIN_VALUE, Byte.MAX_VALUE);
        sort(s, x);
        byte[] y = generateRandomArray(11, Byte.MIN_VALUE, Byte.MAX_VALUE);
        sort(s, y);
    }

    private static void sort(Sorting sorting, byte[] arr) {
        System.out.println("Початковий масив:\t\t" + arrayToString(arr));
        sorting.sort(arr);
        System.out.println("Впорядкований масив:\t" + arrayToString(arr));
        System.out.println();
    }

}

