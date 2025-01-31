package sorting.quicksort.sortproductprices;


import java.util.Arrays;

public class QuickSortProducts {
    // Function to perform Quick Sort
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            // Find the partition index
            int partitionIndex = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, partitionIndex - 1);
            quickSort(prices, partitionIndex + 1, high);
        }
    }

    // Function to partition the array
    private static int partition(double[] prices, int low, int high) {
        double pivot = prices[high]; // Choosing the last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                swap(prices, i, j);
            }
        }

        swap(prices, i + 1, high); // Place pivot in the correct position
        return i + 1;
    }

    // Function to swap two elements in an array
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main function to test Quick Sort
    public static void main(String[] args) {
        double[] productPrices = {499.99, 299.50, 150.00, 899.99, 399.75, 199.99};

        System.out.println("Original Prices: " + Arrays.toString(productPrices));

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Prices: " + Arrays.toString(productPrices));
    }
}
