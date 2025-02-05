package challengeproblem.compare;

public class StringBuilderExample {
    // Method to concatenate strings using StringBuilder and measure the time taken
    public static long concatenateStrings(int iterations, String str) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append(str);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
