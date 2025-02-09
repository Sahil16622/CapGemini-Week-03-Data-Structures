package searchatargetinalargedataset;

import java.util.Random;

public class SearchTarget {

    // Linear Search: Scan each element until the target is found
    public static int linearSearch(int target, int[] dataset) {
        int size = dataset.length;
        for (int i = 0; i < size; i++) {
            // Check if current element is the target
            if (dataset[i] == target) {
                // Target found, return index
                return i;
            }
        }
        // Target not found, return -1
        return -1;
    }

    // Binary Search: Search for the target in a sorted dataset
    public static int binarySearch(int target, int[] dataset) {
        int left = 0, right = dataset.length - 1;
        while (left <= right) { // Corrected condition to include equal to
            // Calculate mid index
            int mid = (left + right) / 2;
            // Check if the mid element is the target
            if (dataset[mid] == target) {
                // Target found, return index
                return mid;
            } else if (dataset[mid] > target) {
                // Target is in the left half, adjust right index
                right = mid - 1;
            } else {
                // Target is in the right half, adjust left index
                left = mid + 1;
            }
        }
        // Target not found, return -1
        return -1;
    }

    // Merge function to merge two halves in merge sort
    public static void merge(int[] dataset, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        // Copy data to temporary arrays arr1[] and arr2[]
        System.arraycopy(dataset, left, arr1, 0, n1);
        System.arraycopy(dataset, mid + 1, arr2, 0, n2);

        int i = 0, j = 0, k = left;

        // Merge the temporary arrays back into dataset[]
        while (i < n1 && j < n2) {
            // Compare elements from arr1 and arr2
            if (arr1[i] <= arr2[j]) {
                // Copy the smaller element to dataset[]
                dataset[k++] = arr1[i++];
            } else {
                // Copy the smaller element to dataset[]
                dataset[k++] = arr2[j++];
            }
        }

        // Copy the remaining elements of arr1[], if any
        while (i < n1) {
            dataset[k++] = arr1[i++];
        }
        // Copy the remaining elements of arr2[], if any
        while (j < n2) {
            dataset[k++] = arr2[j++];
        }
    }

    // Sort function to perform merge sort
    public static void mergeSort(int[] dataset, int left, int right) {
        if (left < right) {
            // Calculate mid index
            int mid = (left + right) / 2;

            // Sort first half
            mergeSort(dataset, left, mid);
            // Sort second half
            mergeSort(dataset, mid + 1, right);
            // Merge the sorted halves
            merge(dataset, left, mid, right);
        }
    }

    // Generate random numbers to fill the dataset
    public static void randomNumberGenerator(int[] dataset) {
        int size = dataset.length;

        Random random = new Random();

        // Fill dataset with random numbers
        for (int i = 0; i < size; i++) {
            // Assign random value
            dataset[i] = random.nextInt(size);
        }
    }

    public static void main(String[] args) {

        int[] datasetSize = {1000, 10000, 1000000};

        for (int size : datasetSize) {
            Random rand = new Random();

            System.out.println("\n===== For dataset size: " + size + " =====");

            int[] dataset = new int[size];
            // Generate random dataset
            randomNumberGenerator(dataset);
            // Random target value
            int target = rand.nextInt(size);

            // Perform linear search and measure time
            long startTime1 = System.nanoTime();
            int index1 = linearSearch(target, dataset);
            long endTime1 = System.nanoTime();
            long totalTime1 = endTime1 - startTime1;
            System.out.println((index1 != -1) ? ("\nTarget \"" + target + "\" found at index: " + index1) : ("Target not present"));
            System.out.println("Time taken by LinearSearch is: " + totalTime1 / 1000000.0 + " ms");

            // Sort the dataset for binary search
            mergeSort(dataset, 0, size - 1);

            // Perform binary search and measure time
            long startTime2 = System.nanoTime();
            int index2 = binarySearch(target, dataset);
            long endTime2 = System.nanoTime();
            long totalTime2 = endTime2 - startTime2;
            System.out.println((index2 != -1) ? ("Target \"" + target + "\" found at index: " + index2) : ("Target not present"));
            System.out.println("Time taken by BinarySearch is: " + totalTime2 / 1000000.0 + " ms");

            // Compare performances and print result
            System.out.println(((totalTime1>totalTime2) ? "Binary" : "Linear") + " Search performs much better for dataset size: " + size);
        }
    }
}
