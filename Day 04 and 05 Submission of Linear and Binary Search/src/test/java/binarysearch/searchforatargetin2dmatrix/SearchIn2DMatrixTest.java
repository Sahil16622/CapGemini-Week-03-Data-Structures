package binarysearch.searchforatargetin2dmatrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchIn2DMatrixTest {
    @Test
    void testSearchMatrix(){
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;
        boolean result = true;
        Assertions.assertEquals(result, SearchIn2DMatrix.searchMatrix(matrix, target));
    }
}
