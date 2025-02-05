package stringbufferproblem.concatenatestrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConcatenateStringsTest {
    @Test
    void testConcatenateString(){
        String[] input = {"Hello", " ", "World", "!", " ", "How", " ", "are", " ", "you?"};
        String output = "Hello World! How are you?";
        Assertions.assertEquals(output, ConcatenateStrings.concatenateString(input));
    }
}
