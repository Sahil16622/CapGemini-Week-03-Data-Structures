package datastructures.hashmaphashfunctions.pairwithgivensum;

import java.util.HashSet;

public class PairWithGivenSum {
    // Function to check if a pair with given sum exists
    public static boolean hasPairWithSum(int[] arr, int target) {
        // HashSet to store elements we've seen so far
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            // Check if complement exists in the set
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }

            // Add the current number to the set
            seen.add(num);
        }

        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 3, 5, 7, 1 };
        int target = 10;

        if (!hasPairWithSum(arr, target)) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
