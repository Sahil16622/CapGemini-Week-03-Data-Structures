package sortinglargedataefficiently;

import java.util.Random;

public class SortingData {

    // Bubble Sort: Repeated swapping (inefficient for large data)
    public static void bubbleSort(int[] dataset) {
        boolean isSwapped;
        for (int i = 0; i < dataset.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < dataset.length - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (dataset[j] > dataset[j + 1]) {
                    // Swap elements
                    int temp = dataset[j];
                    dataset[j] = dataset[j + 1];
                    dataset[j + 1] = temp;
                    isSwapped = true;
                }
            }
            // If no two elements were swapped, the array is sorted
            if (!isSwapped) {
                return;
            }
        }
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

    // Merge Sort: Divide & Conquer approach (stable)
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

    // Partition function for Quick Sort
    public static int partition(int[] dataset, int low, int high) {
        // Pivot element
        int pivot = dataset[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Swap if current element is smaller than the pivot
            if (dataset[j] < pivot) {
                i++;
                swap(dataset, i, j);
            }
        }

        // Swap the pivot element with the element at i+1
        swap(dataset, i + 1, high);
        return i + 1;
    }

    // Swap function to swap two elements in the array
    public static void swap(int[] dataset, int i, int j) {
        int temp = dataset[i];
        dataset[i] = dataset[j];
        dataset[j] = temp;
    }

    // Quick Sort: Partition-based approach (fast but unstable)
    public static void quickSort(int[] dataset, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivot = partition(dataset, low, high);

            // Sort elements before partition and after partition
            quickSort(dataset, low, pivot - 1);
            quickSort(dataset, pivot + 1, high);
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
            System.out.println("\n===== For dataset size: " + size + " =====");

            // Create a dataset of the given size
            int[] bubbleSortDataset = new int[size];
            // Generate random dataset
            randomNumberGenerator(bubbleSortDataset);

            // Perform Bubble Sort and measure time
            long startTime1 = System.nanoTime();
            bubbleSort(bubbleSortDataset);
            long endTime1 = System.nanoTime();
            long totalTime1 = endTime1 - startTime1;
            System.out.println("Time taken by Bubble Sort is: " + totalTime1 / 1000000.0 + " ms");

            // Create a dataset of the given size
            int[] mergeSortDataset = new int[size];
            // Generate random dataset
            randomNumberGenerator(mergeSortDataset);

            // Perform Merge Sort and measure time
            long startTime2 = System.nanoTime();
            mergeSort(mergeSortDataset, 0, size - 1);
            long endTime2 = System.nanoTime();
            long totalTime2 = endTime2 - startTime2;
            System.out.println("Time taken by Merge Sort is: " + totalTime2 / 1000000.0 + " ms");

            // Create a dataset of the given size
            int[] quickSortDataset = new int[size];
            // Generate random dataset
            randomNumberGenerator(quickSortDataset);

            // Perform Quick Sort and measure time
            long startTime3 = System.nanoTime();
            quickSort(quickSortDataset, 0, size - 1);
            long endTime3 = System.nanoTime();
            long totalTime3 = endTime3 - startTime3;
            System.out.println("Time taken by Quick Sort is: " + totalTime3 / 1000000.0 + " ms");
        }
    }
}
