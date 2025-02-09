package largefilereadingefficiency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;

public class LargeFileReadingEfficiencyTest {
    @Test
    void testLargeFileReadingEfficiency(){
        // Declare an array of 3 File objects representing different file sizes
        File[] files = new File[3];
        files[0] = new File("SmallFile.test");
        files[1] = new File("MediumFile.test");
        files[2] = new File("LargeFile.test");

        // Loop through each file and measure the time taken by both methods
        for (File file : files) {
            System.out.println("\n===== " + file + " =====");

            // Time taken by FileReader
            long timeFileReader = LargeFileReadingEfficiency.fileReader(file);

            // Time taken by InputStreamReader
            long timeInputStreamReader = LargeFileReadingEfficiency.inputStreamReader(file);

            // Print the results in milliseconds
            System.out.println("Time taken by FileReader: " + timeFileReader / 1000000.0 + " ms");
            System.out.println("Time taken by InputStreamReader: " + timeInputStreamReader / 1000000.0 + " ms");

            // Verify that InputStreamBuilder is more efficient for large files
            Assertions.assertTrue(timeFileReader>timeInputStreamReader, "InputStreamReader is more efficient for large files.");
        }
    }
}
