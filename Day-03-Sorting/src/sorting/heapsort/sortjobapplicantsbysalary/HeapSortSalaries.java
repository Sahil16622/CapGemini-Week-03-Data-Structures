package sorting.heapsort.sortjobapplicantsbysalary;

import java.util.Arrays;

public class HeapSortSalaries {
    // Function to perform Heap Sort
    public static void heapSort(double[] salaries) {
        int n = salaries.length;

        // Step 1: Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move the largest element (root) to the end
            swap(salaries, 0, i);

            // Reheapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Function to heapify a subtree rooted at index 'i'
    private static void heapify(double[] salaries, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1; // Left child index
        int right = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            swap(salaries, i, largest);
            heapify(salaries, n, largest);
        }
    }

    // Function to swap two elements in an array
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main function to test Heap Sort
    public static void main(String[] args) {
        double[] salaryDemands = {50000, 70000, 60000, 40000, 90000, 55000};

        System.out.println("Original Salaries: " + Arrays.toString(salaryDemands));

        heapSort(salaryDemands);

        System.out.println("Sorted Salaries: " + Arrays.toString(salaryDemands));
    }
}

