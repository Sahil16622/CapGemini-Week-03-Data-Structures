package challengeproblem.compare;

public class Main {
    public static void main(String[] args) {
        // List of strings to be concatenated
        String str = "hello";
        int iterations = 1000000;

        // Create instances of StringBuilderExample and StringBufferExample
        StringBuilderExample stringBuilderExample = new StringBuilderExample();
        StringBufferExample stringBufferExample = new StringBufferExample();

        // Measure time for StringBuilder
        long stringBuilderTime = stringBuilderExample.concatenateStrings(iterations, str);
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " nanoseconds");

        // Measure time for StringBuffer
        long stringBufferTime = stringBufferExample.concatenateStrings(iterations, str);
        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " nanoseconds");

        // Path to the large file
        String filePath = "LargeFile.test";

        // Create instances of FileReaderExample and InputStreamReaderExample
        FileReaderExample fileReaderExample = new FileReaderExample();
        InputStreamReaderExample inputStreamReaderExample = new InputStreamReaderExample();

        // Measure time and count words using FileReader
        long startTime = System.nanoTime();
        int fileReaderWordCount = fileReaderExample.countWordsUsingFileReader(filePath);
        long endTime = System.nanoTime();
        long fileReaderTime = endTime - startTime;
        System.out.println("Words counted by FileReader: " + fileReaderWordCount);
        System.out.println("Time taken by FileReader: " + fileReaderTime + " nanoseconds");

        // Measure time and count words using InputStreamReader
        startTime = System.nanoTime();
        int inputStreamReaderWordCount = inputStreamReaderExample.countWordsUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        long inputStreamReaderTime = endTime - startTime;
        System.out.println("Words counted by InputStreamReader: " + inputStreamReaderWordCount);
        System.out.println("Time taken by InputStreamReader: " + inputStreamReaderTime + " nanoseconds");
    }
}
