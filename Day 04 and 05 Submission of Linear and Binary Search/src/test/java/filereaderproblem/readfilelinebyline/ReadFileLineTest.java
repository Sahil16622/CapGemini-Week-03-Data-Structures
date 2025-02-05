package filereaderproblem.readfilelinebyline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineTest {

    @Test
    void testReadFile() {
        // Path to the Sample.txt file in your project
        String filePath = "Sample.txt";

        // Use StringBuilder to capture the output
        StringBuilder sb = new StringBuilder();

        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file and append it to the StringBuilder
            while ((line = br.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            // Handle any potential IOException
            e.printStackTrace();
            Assertions.fail("IOException occurred during the test");
        }

        // Expected output based on the contents of Sample.txt
        String output = "Hello" + System.lineSeparator() +
                "World!" + System.lineSeparator() +
                "How are you?" + System.lineSeparator();

        // Verify the output
        Assertions.assertEquals(output, sb.toString());
    }
}
