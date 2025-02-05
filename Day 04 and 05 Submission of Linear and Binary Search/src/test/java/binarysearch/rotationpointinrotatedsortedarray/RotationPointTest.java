package binarysearch.rotationpointinrotatedsortedarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotationPointTest {
    @Test
    void testFindRotationIndex(){
        int[] rotatedArray = {15, 18, 2, 3, 6, 12};
        int rotationIndex = 2;
        Assertions.assertEquals(rotationIndex, RotationPoint.findRotationIndex(rotatedArray));
    }
}
