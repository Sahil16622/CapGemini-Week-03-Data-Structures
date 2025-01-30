package datastructures.hashmaphashfunctions.longestconsecutivesequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    // Function to find the length of the longest consecutive elements sequence
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        // HashSet to store the elements for O(1) lookup
        HashSet<Integer> numSet = new HashSet<>();

        // Add all elements to the set
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSequence = 0;

        // Iterate through each element in the set
        for (int num : numSet) {
            // Check if it's the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count the length of the consecutive sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak
                longestSequence = Math.max(longestSequence, currentStreak);
            }
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence: " + longestConsecutive(nums));
    }
}

