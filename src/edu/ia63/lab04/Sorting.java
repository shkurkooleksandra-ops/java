package edu.ia63.lab04;

public interface Sorting {
    void sort(byte[] arr);

    default String sortingAlgorithm() {
        return "noop";
    }
}

