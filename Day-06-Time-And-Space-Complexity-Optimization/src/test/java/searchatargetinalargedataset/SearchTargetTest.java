package searchatargetinalargedataset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTargetTest {

    // Sample dataset and target value for testing
    int[] dataset = {5, 3, 7, 9, 2, 1, 8, 6};
    int target = 9;

    // Test for linear search
    @Test
    void linearSearchTest() {
        // Expected index of the target value in the dataset
        int expected = 3;
        // Measure time taken by Linear Search
        long startTime = System.nanoTime();
        // Actual index returned by the linear search
        int actual = SearchTarget.linearSearch(target, dataset);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time taken by Linear Search is: " + totalTime / 1_000_000.0 + " ms");
        // Assert that the expected index matches the actual index
        Assertions.assertEquals(expected, actual);
    }

    // Test for binary search
    @Test
    void binarySearchTest() {
        // Sort the array
        SearchTarget.mergeSort(dataset, 0, dataset.length - 1);
        // Expected index of the target value in the dataset
        int expected = 7;
        // Measure time taken by Binary Search
        long startTime = System.nanoTime();
        // Actual index returned by the binary search
        int actual = SearchTarget.binarySearch(target, dataset);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time taken by Binary Search is: " + totalTime / 1_000_000.0 + " ms");
        // Assert that the expected index matches the actual index
        Assertions.assertEquals(expected, actual);
    }

    // Test for random number generator
    @Test
    void randomNumberGeneratorTest() {
        // Create an array of size 10 for testing
        int[] testArray = new int[10];
        // Generate random numbers in the test array
        SearchTarget.randomNumberGenerator(testArray);
        // Print the generated random numbers
        System.out.print("TestArray: ");
        for (int num : testArray) {
            System.out.print(num + "  ");
        }
        System.out.println();
    }

    // Test for merge sort
    @Test
    void mergeSortTest() {
        // Sample dataset for merge sort test
        int[] mergeSortDataset = {5, 3, 7, 9, 2, 1, 8, 6};
        // Measure time taken by Merge Sort
        long startTime = System.nanoTime();
        // Sort the sample dataset
        SearchTarget.mergeSort(mergeSortDataset, 0, mergeSortDataset.length - 1);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time taken by Merge Sort is: " + totalTime / 1_000_000.0 + " ms");
        // Assert that the array is sorted
        Assertions.assertTrue(isSorted(mergeSortDataset), "MergeSort did not sort the array correctly");
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
