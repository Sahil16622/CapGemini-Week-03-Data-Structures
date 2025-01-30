package datastructures.hashmaphashfunctions.twosumproblem;

import java.util.HashMap;

public class TwoSum {
    // Function to find two indices whose values add up to the target sum
    public static int[] twoSum(int[] nums, int target) {
        // HashMap to store the index of each element as we iterate through the array
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists in the hash map
            if (map.containsKey(complement)) {
                // If found, return the indices of the two elements
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the current element's value and its index
            map.put(nums[i], i);
        }

        // Return null if no such pair exists
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found.");
        }
    }
}
