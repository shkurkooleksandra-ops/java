package edu.ia63.lab04;

public class SortingStrategy implements Sorting {

    private final Sorting selectionSort = new SelectionSort();
    private final Sorting insertionSort = new InsertionSort();
    private final Sorting noopSort = new NoopSort();

    @Override
    public void sort(byte[] arr) {
        Sorting sorting;
        if (arr == null || arr.length < 2) {
            sorting = noopSort;
        } else if (arr.length < 10) {
            sorting = selectionSort;
        } else {
            sorting = insertionSort;
        }
        System.out.println(sorting.sortingAlgorithm() + " selected");
        sorting.sort(arr);
    }

}
