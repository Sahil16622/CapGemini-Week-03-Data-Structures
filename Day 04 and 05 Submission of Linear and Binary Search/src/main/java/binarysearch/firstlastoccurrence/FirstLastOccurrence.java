package binarysearch.firstlastoccurrence;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        // Define the sorted array and the target element
        int[] array = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;

        // Call the findFirst and findLast methods to find the first and last occurrence of the target
        int firstOccurrence = findFirst(array, target);
        int lastOccurrence = findLast(array, target);

        // Print the indices of the first and last occurrence
        if (firstOccurrence != -1 && lastOccurrence != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
            System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Method to find the first occurrence of the target element
    public static int findFirst(int[] array, int target) {
        int left = 0, right = array.length - 1;
        int result = -1;

        // Perform binary search to find the first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Method to find the last occurrence of the target element
    public static int findLast(int[] array, int target) {
        int left = 0, right = array.length - 1;
        int result = -1;

        // Perform binary search to find the last occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
