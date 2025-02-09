package recursivevsiterativefibonaccicomputation;

public class FibonacciComputation {

    // Recursive method to calculate Fibonacci number
    public static int fibonacciRecursive(int n) {
        // Check if n is 0 or 1 (base case)
        if (n <= 1)
            return n;
        // Return sum of the two preceding numbers (recursive case)
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method to calculate Fibonacci number
    public static int fibonacciIterative(int n) {
        // Initialize first two Fibonacci numbers
        int a = 0, b = 1, sum;
        // Loop to calculate next Fibonacci number
        for (int i = 2; i <= n; i++) {
            // Calculate next Fibonacci number
            sum = a + b;
            // Update a to the current b
            a = b;
            // Update b to the new Fibonacci number (sum)
            b = sum;
        }
        // Return the nth Fibonacci number
        return b;
    }

    public static void main(String[] args) {
        // Test values for Fibonacci computation
        int[] nums = {10, 30, 50};

        // Loop through each test value
        for(int num : nums) {
            System.out.println("\n===== For Number " + num + " =====");

            // Measure time taken by the recursive method
            long startTime1 = System.nanoTime();
            int recursiveFib = fibonacciRecursive(num);
            long endTime1 = System.nanoTime();
            long totalTime1 = (endTime1 - startTime1);
            System.out.println("Total time taken by Fibonacci Recursive: " + totalTime1 / 1000000.0 + "ms");

            // Measure time taken by the iterative method
            long startTime2 = System.nanoTime();
            int iterativeFib = fibonacciIterative(num);
            long endTime2 = System.nanoTime();
            long totalTime2 = (endTime2 - startTime2);
            System.out.println("Total time taken by Fibonacci Iterative: " + totalTime2 / 1000000.0 + "ms");
        }
    }
}
