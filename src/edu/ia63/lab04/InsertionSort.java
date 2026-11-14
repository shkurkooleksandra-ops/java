package edu.ia63.lab04;

import java.util.Objects;

class InsertionSort implements Sorting {

    @Override
    public void sort(byte[] arr) {
        Objects.requireNonNull(arr);
        for (int i = 1; i < arr.length; i++) {
            byte key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    @Override
    public String sortingAlgorithm() {
        return "Insertion Sort";
    }
}
