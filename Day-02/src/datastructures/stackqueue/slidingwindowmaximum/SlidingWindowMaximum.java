package datastructures.stackqueue.slidingwindowmaximum;

import java.util.*;

class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1]; // Output array
        Deque<Integer> deque = new LinkedList<>(); // Stores indices of useful elements

        for (int i = 0; i < n; i++) {
            // Remove elements out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add current index to deque
            deque.addLast(i);

            // Store max for the current window (first valid index is i >= k-1)
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
