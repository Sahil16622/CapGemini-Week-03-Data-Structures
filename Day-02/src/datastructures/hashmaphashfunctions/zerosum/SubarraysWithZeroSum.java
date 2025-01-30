package datastructures.hashmaphashfunctions.zerosum;
import java.util.*;
class SubarraysWithZeroSum {
    // Function to find all subarrays with sum zero
    public static void findSubarraysWithZeroSum(int[] arr) {
        // HashMap to store cumulative sum and its frequency
        Map<Integer, List<Integer>> sumMap = new HashMap<>();

        int sum = 0; // Cumulative sum
        sumMap.put(0, new ArrayList<>()); // Initialize with sum 0 for subarrays from the start

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update cumulative sum

            // If sum has been seen before, there is a subarray with sum 0
            if (sumMap.containsKey(sum)) {
                // Find all previous indices where this sum occurred
                for (int startIndex : sumMap.get(sum)) {
                    // Print the subarray from startIndex+1 to i
                    System.out.println("Subarray with sum zero: [" + (startIndex + 1) + ", " + i + "]");
                }
            }

            // Add the current index to the list of indices for the current sum
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, -1, -3, 4, -2, 2, 1, -5, 4 };

        System.out.println("Subarrays with zero sum:");
        findSubarraysWithZeroSum(arr);
    }
}
