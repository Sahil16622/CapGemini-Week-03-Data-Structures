package stringbuilderproblems.removeduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilderproblems.removeduplicates.RemoveDuplicate;

public class RemoveDuplicateTest {
 @Test
    void testRemoveDuplicate(){
     String input = "HelloWorld";
     String output = "HeloWrd";
     Assertions.assertEquals(output, RemoveDuplicate.removeDuplicates(input));
 }

}

