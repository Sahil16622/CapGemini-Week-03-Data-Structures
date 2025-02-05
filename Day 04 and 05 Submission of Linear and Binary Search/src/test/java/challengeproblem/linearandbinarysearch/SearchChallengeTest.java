package challengeproblem.linearandbinarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchChallengeTest {
    @Test
    void testFindFirstMissingPositive(){
        int[] array = {3, 4, -1, 1, 9, 2};
        int output = 5;
        Assertions.assertEquals(output, SearchChallenge.findFirstMissingPositive(array));
    }

    @Test
    void testBinarySearch(){
        int[] array = {3, 4, -1, 1, 9, 2};
        int target = 9;
        int outputIndex = 4;
        Assertions.assertEquals(outputIndex, SearchChallenge.binarySearch(array, target));
    }
}
