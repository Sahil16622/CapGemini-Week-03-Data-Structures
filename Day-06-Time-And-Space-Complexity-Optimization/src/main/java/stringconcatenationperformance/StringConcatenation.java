package stringconcatenationperformance;

public class StringConcatenation {

    // Perform String concatenation
    public static long stringConcatenation(int count) {
        String result = "";
        // Record start time
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            // Concatenate using String
            result += 'a';
        }
        // Record end time
        long endTime = System.nanoTime();
        // Return time taken
        return endTime - startTime;
    }

    // Perform StringBuilder concatenation
    public static long stringBuilder(int count) {
        StringBuilder sb = new StringBuilder();
        // Record start time
        long startTime = System.nanoTime();
        // Append using StringBuilder
        sb.append("a".repeat(Math.max(0, count)));
        // Record end time
        long endTime = System.nanoTime();
        // Return time taken
        return endTime - startTime;
    }

    // Perform StringBuffer concatenation
    public static long stringBuffer(int count) {
        StringBuffer sbr = new StringBuffer();
        // Record start time
        long startTime = System.nanoTime();
        // Append using StringBuffer
        sbr.append("a".repeat(Math.max(0, count)));
        // Record end time
        long endTime = System.nanoTime();
        // Return time taken
        return endTime - startTime;
    }

    public static void main(String[] args) {

        int[] operationCount = {1000, 10000, 1000000};

        for (int count : operationCount) {
            System.out.println("\n===== For operation count: " + count + " =====");

            // Measure time for String concatenation
            long timeString = stringConcatenation(count);
            System.out.println("Time taken by String: " + timeString / 100000.0 + "ms");

            // Measure time for StringBuilder concatenation
            long timeStringBuilder = stringBuilder(count);
            System.out.println("Time taken by StringBuilder: " + timeStringBuilder / 100000.0 + "ms");

            // Measure time for StringBuffer concatenation
            long timeStringBuffer = stringBuffer(count);
            System.out.println("Time taken by StringBuffer: " + timeStringBuffer / 100000.0 + "ms");
        }
    }
}
