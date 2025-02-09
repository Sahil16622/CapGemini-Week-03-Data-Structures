package sortinglargedataefficiently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingDataTest {

    @Test
    void bubbleSortTest() {
        // Sample dataset for bubble sort test
        int[] bubbleSortDataset = {5, 3, 7, 9, 2, 1, 8, 6};

        // Measure time taken by Bubble Sort
        long startTime1 = System.nanoTime();
        SortingData.bubbleSort(bubbleSortDataset);
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Time taken by Bubble Sort is: " + totalTime1 / 1000000.0 + " ms");

        // Assert that the array is sorted
        Assertions.assertTrue(isSorted(bubbleSortDataset), "BubbleSort did not sort the array correctly");
    }

    @Test
    void mergeSortTest() {
        // Sample dataset for merge sort test
        int[] mergeSortDataset = {5, 3, 7, 9, 2, 1, 8, 6};

        // Measure time taken by Merge Sort
        long startTime2 = System.nanoTime();
        SortingData.mergeSort(mergeSortDataset, 0, mergeSortDataset.length - 1);
        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;
        System.out.println("Time taken by Merge Sort is: " + totalTime2 / 1000000.0 + " ms");

        // Assert that the array is sorted
        Assertions.assertTrue(isSorted(mergeSortDataset), "MergeSort did not sort the array correctly");
    }

    @Test
    void quickSortTest() {
        // Sample dataset for quick sort test
        int[] quickSortDataset = {5, 3, 7, 9, 2, 1, 8, 6};

        // Measure time taken by Quick Sort
        long startTime3 = System.nanoTime();
        SortingData.quickSort(quickSortDataset, 0, quickSortDataset.length - 1);
        long endTime3 = System.nanoTime();
        long totalTime3 = endTime3 - startTime3;
        System.out.println("Time taken by Quick Sort is: " + totalTime3 / 1000000.0 + " ms");

        // Assert that the array is sorted
        Assertions.assertTrue(isSorted(quickSortDataset), "QuickSort did not sort the array correctly");
    }

    // Helper method to check if an array is sorted
    private boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // Check if the previous element is greater than the current element
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
