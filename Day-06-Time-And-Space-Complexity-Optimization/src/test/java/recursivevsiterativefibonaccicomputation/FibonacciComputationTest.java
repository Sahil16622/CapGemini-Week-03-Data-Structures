package recursivevsiterativefibonaccicomputation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciComputationTest {
    @Test
    void testFibonacciComputation() {
        // Test values for Fibonacci computation
        int[] nums = {10, 30, 50};

        // Loop through each test value
        for (int num : nums) {
            System.out.println("\n===== For Number " + num + " =====");

            // Measure time taken by the recursive method
            long startTime1 = System.nanoTime();
            int recursiveFib = FibonacciComputation.fibonacciRecursive(num);
            long endTime1 = System.nanoTime();
            long totalTime1 = (endTime1 - startTime1);
            System.out.println("Total time taken by Fibonacci Recursive: " + totalTime1 / 1000000.0 + "ms");

            // Measure time taken by the iterative method
            long startTime2 = System.nanoTime();
            int iterativeFib = FibonacciComputation.fibonacciIterative(num);
            long endTime2 = System.nanoTime();
            long totalTime2 = (endTime2 - startTime2);
            System.out.println("Total time taken by Fibonacci Iterative: " + totalTime2 / 1000000.0 + "ms");

            // Recursive approach is infeasible for large values of N due to exponential growth
            if (num > 30) {
                Assertions.assertTrue(totalTime1 > 1000000000, "Recursive approach should take longer time for large values of N");
            }

            // Iterative approach is significantly faster and memory-efficient
            Assertions.assertTrue(totalTime2 < totalTime1, "Iterative approach should be faster than recursive approach for large values of N");
        }
    }
}
