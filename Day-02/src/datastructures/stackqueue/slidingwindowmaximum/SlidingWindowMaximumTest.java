package datastructures.stackqueue.slidingwindowmaximum;

// Main class to test the implementation
public class SlidingWindowMaximumTest {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        SlidingWindowMaximum solver = new SlidingWindowMaximum();
        int[] maxValues = solver.maxSlidingWindow(nums, k);

        System.out.print("Sliding Window Maximum: ");
        for (int val : maxValues) {
            System.out.print(val + " ");
        }
    }
}
