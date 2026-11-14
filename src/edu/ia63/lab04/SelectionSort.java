package edu.ia63.lab04;

class SelectionSort implements Sorting {

    @Override
    public void sort(byte[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                byte temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }

    @Override
    public String sortingAlgorithm() {
        return "Selection Sort";
    }
}
