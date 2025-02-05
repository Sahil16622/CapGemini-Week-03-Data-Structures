package challengeproblem.compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComparisonTest {

    @Test
    void testConcatenateStringsWithStringBuilder() {
        String str = "hello";
        int iterations = 1000000;
        StringBuilderExample stringBuilderExample = new StringBuilderExample();
        long timeTaken = stringBuilderExample.concatenateStrings(iterations, str);
        Assertions.assertTrue(timeTaken > 0);
    }

    @Test
    void testConcatenateStringsWithStringBuffer() {
        String str = "hello";
        int iterations = 1000000;
        StringBufferExample stringBufferExample = new StringBufferExample();
        long timeTaken = stringBufferExample.concatenateStrings(iterations, str);
        Assertions.assertTrue(timeTaken > 0);
    }

    @Test
    void testCountWordsUsingFileReader() {
        String filePath = "LargeFile.test";
        FileReaderExample fileReaderExample = new FileReaderExample();
        int wordCount = fileReaderExample.countWordsUsingFileReader(filePath);
        Assertions.assertEquals(4194305, wordCount);
    }

    @Test
    void testCountWordsUsingInputStreamReader() {
        String filePath = "LargeFile.test";
        InputStreamReaderExample inputStreamReaderExample = new InputStreamReaderExample();
        int wordCount = inputStreamReaderExample.countWordsUsingInputStreamReader(filePath);
        Assertions.assertEquals(4194305, wordCount);
    }
}
