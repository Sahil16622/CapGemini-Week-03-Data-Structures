package challengeproblem.compare;

public class StringBufferExample {
    // Method to concatenate strings using StringBuffer and measure the time taken
    public static long concatenateStrings(int iterations, String str) {
        StringBuffer sbf = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbf.append(str);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
