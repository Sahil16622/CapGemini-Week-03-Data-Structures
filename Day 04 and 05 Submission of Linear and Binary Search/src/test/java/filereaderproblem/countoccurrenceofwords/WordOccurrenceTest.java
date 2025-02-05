package filereaderproblem.countoccurrenceofwords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordOccurrenceTest {

    @Test
    void testReadWordsFromFile() {
        // Path to the Sample.txt file in your project
        String filePath = "Sample.txt";

        // Expected output based on the contents of Sample.txt
        String[] output = {"hello", "world", "how", "are", "you"};

        // Verify the output
        Assertions.assertArrayEquals(output, WordOccurrence.readWordsFromFile(filePath));
    }

    @Test
    void testCountOccurrence() {
        // Path to the Sample.txt file in your project
        String filePath = "Sample.txt";

        // Read words from the file using the readWordsFromFile method
        String[] words = WordOccurrence.readWordsFromFile(filePath);

        // Word to be counted
        String targetWord = "world";

        // Expected count
        int expectedCount = 1;

        // Count the occurrence of the target word using the countOccurrence method
        int actualCount = WordOccurrence.countOccurrence(words, targetWord);

        // Verify that the actual count matches the expected count
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
