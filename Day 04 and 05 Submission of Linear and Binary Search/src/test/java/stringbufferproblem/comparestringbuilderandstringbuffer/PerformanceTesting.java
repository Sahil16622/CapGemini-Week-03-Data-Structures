package stringbufferproblem.comparestringbuilderandstringbuffer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerformanceTesting {

    @Test
    void testStringBuilderPerformance() {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 1000000; i++) {
            sb.append(" Performance Test");
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("StringBuilder Time: " + duration + " ns");

        // Assert that the duration is within an acceptable range, for example less than 500 ms
        Assertions.assertTrue(duration < 500000000, "StringBuilder performance is below expected threshold");
    }

    @Test
    void testStringBufferPerformance() {
        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 1000000; i++) {
            sbf.append(" Performance Test");
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("StringBuffer Time: " + duration + " ns");

        // Assert that the duration is within an acceptable range, for example less than 600 ms
        Assertions.assertTrue(duration < 600000000, "StringBuffer performance is below expected threshold");
    }
}
