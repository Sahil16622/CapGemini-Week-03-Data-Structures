package challengeproblem.linearandbinarysearch;

import java.util.Arrays;
import java.util.HashSet;

public class SearchChallenge {
    public static void main(String[] args) {
        // Define the array of integers
        int[] array = {3, 4, -1, 1, 9, 2};
        int target = 9;

        // Find the first missing positive integer using linear search
        int missingPositive = findFirstMissingPositive(array);
        System.out.println("First missing positive integer: " + missingPositive);

        // Sort the array for binary search
        Arrays.sort(array);

        // Perform binary search to find the index of the target number
        int targetIndex = binarySearch(array, target);
        if (targetIndex != -1) {
            System.out.println("Target value " + target + " is found at index: " + targetIndex);
        } else {
            System.out.println("Target value " + target + " is not found in the array.");
        }
    }

    // Method to find the first missing positive integer using linear search
    public static int findFirstMissingPositive(int[] array) {
        // Create a HashSet to mark visited positive integers
        HashSet<Integer> visited = new HashSet<>();

        // Add all positive integers in the array to the HashSet
        for (int num : array) {
            if (num > 0) {
                visited.add(num);
            }
        }

        // Traverse the array again to find the first positive integer that is not in the HashSet
        int i = 1;
        while (true) {
            if (!visited.contains(i)) {
                return i;
            }
            i++;
        }
    }

    // Method to perform binary search to find the index of the target number
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target is not found in the array
    }
}

