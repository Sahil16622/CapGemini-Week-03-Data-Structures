package largefilereadingefficiency;

import java.io.*;

public class LargeFileReadingEfficiency {

    // Method to read file using FileReader and measure time taken
    public static long fileReader(File filePath) {
        // Start time in nanoseconds
        long startTime = System.nanoTime();

        try (FileReader fileRead = new FileReader(filePath)) {
            int ch;
            while ((ch = fileRead.read()) != -1) {
                // Reading character by character
            }
        } catch (IOException e) {
            // Handle IOException
            e.printStackTrace();
        }

        // End time in nanoseconds
        long endTime = System.nanoTime();

        // Return time taken to read the file
        return endTime - startTime;
    }

    // Method to read file using InputStreamReader and measure time taken
    public static long inputStreamReader(File filePath) {
        // Start time in nanoseconds
        long startTime = System.nanoTime();

        try (InputStreamReader inputStreamRead = new InputStreamReader(new FileInputStream(filePath))) {
            int ch;
            while ((ch = inputStreamRead.read()) != -1) {
                // Reading character by character
            }
        } catch (IOException e) {
            // Handle IOException
            e.printStackTrace();
        }

        // End time in nanoseconds
        long endTime = System.nanoTime();

        // Return time taken to read the file
        return endTime - startTime;
    }

    public static void main(String[] args) {
        // Declare an array of 3 File objects representing different file sizes
        File[] files = new File[3];
        files[0] = new File("SmallFile.test");
        files[1] = new File("MediumFile.test");
        files[2] = new File("LargeFile.test");

        // Loop through each file and measure the time taken by both methods
        for (File file : files) {
            System.out.println("\n===== " + file + " =====");

            // Time taken by FileReader
            long timeFileReader = fileReader(file);

            // Time taken by InputStreamReader
            long timeInputStreamReader = inputStreamReader(file);

            // Print the results in milliseconds
            System.out.println("Time taken by FileReader: " + timeFileReader / 1000000.0 + " ms");
            System.out.println("Time taken by InputStreamReader: " + timeInputStreamReader / 1000000.0 + " ms");
        }
    }
}
