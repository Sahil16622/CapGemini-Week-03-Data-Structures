package linearsearch.searchforaspecificword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchWordTest {
    @Test
    void testSearchForWord(){
        // Array of sentences
        String[] sentences = {"Java is a versatile programming language that is widely used for building robust, scalable applications.",
                "It is platform-independent, which means you can run Java programs on any device that has the Java Virtual Machine (JVM) installed.",
                "Java is object-oriented, which makes it easy to manage and scale large projects.",
                "It provides strong memory management, exception handling, and a secure runtime environment.",
                "Java supports multithreading, allowing the execution of multiple threads simultaneously.",
                "Automatic garbage collection helps manage memory efficiently by removing unused objects.",
                "Java's rich standard library provides a wide range of utilities, from data structures to networking."};

        // Word to search for
        String wordToSearch = "multithreading";

        String output = "Java supports multithreading, allowing the execution of multiple threads simultaneously.";

        Assertions.assertEquals(output, SearchWord.searchForWord(sentences, wordToSearch));
    }
}
