package binarysearch.findpeakelementinanarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPeakElementTest {
    @Test
    void testFindPeakElement(){
        int[] array = {1, 3, 20, 4, 1, 0, 8, 7, 5, 10, 9, 2};
        int index = 9;
        Assertions.assertEquals(index, FindPeakElement.findPeakElement(array));
    }
}
