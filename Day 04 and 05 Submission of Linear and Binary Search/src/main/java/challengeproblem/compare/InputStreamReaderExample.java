package challengeproblem.compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class InputStreamReaderExample {
    // Method to count words in a file using InputStreamReader
    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String line;
            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Split the line into words and update the word count
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}
