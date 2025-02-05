package binarysearch.firstlastoccurrence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstLastOccurrenceTest {
    @Test
    void testFindFirst(){
        int[] array = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;
        Assertions.assertEquals(2, FirstLastOccurrence.findFirst(array, target));
    }

    @Test
    void testFindLast(){
        int[] array = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;
        Assertions.assertEquals(4, FirstLastOccurrence.findLast(array, target));
    }
}
