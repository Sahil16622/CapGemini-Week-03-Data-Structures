package sorting.selectionsort.sortexamscores;

import java.util.Arrays;

public class SelectionSortScores {
    // Function to perform Selection Sort
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first unsorted element is the minimum

            // Find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            swap(scores, i, minIndex);
        }
    }

    // Function to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main function to test Selection Sort
    public static void main(String[] args) {
        int[] examScores = {85, 72, 90, 60, 78, 88};

        System.out.println("Original Scores: " + Arrays.toString(examScores));

        selectionSort(examScores);

        System.out.println("Sorted Scores: " + Arrays.toString(examScores));
    }
}

