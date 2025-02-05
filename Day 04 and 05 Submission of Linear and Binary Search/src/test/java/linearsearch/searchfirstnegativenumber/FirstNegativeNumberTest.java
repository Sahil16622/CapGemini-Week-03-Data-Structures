package linearsearch.searchfirstnegativenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstNegativeNumberTest {
    @Test
    void testFirstNegativeNumber(){
        int[] array = {13, -5, 7, -15, 25, 0, 42, -8, 19, 5, 33, 8, -2, 2};
        int index = 1;
        Assertions.assertEquals(index, FirstNegativeNumber.firstNegativeNumber(array));
    }
}
