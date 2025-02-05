package stringbuilderproblems.reversestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
 @Test
    void testReverseString(){
     String input = "Hello, World!";
     String output = "!dlroW ,olleH";
     Assertions.assertEquals(output, ReverseString.reverseString(input));
 }

}
