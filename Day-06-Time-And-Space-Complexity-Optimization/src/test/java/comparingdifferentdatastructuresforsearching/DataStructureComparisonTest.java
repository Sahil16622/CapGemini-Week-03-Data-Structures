package comparingdifferentdatastructuresforsearching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;

public class DataStructureComparisonTest {

    @Test
    void testSearchTimes() {
        // Define dataset sizes
        int[] sizes = {1000, 100000, 1000000};

        // Loop through each dataset size
        for (int size : sizes) {
            System.out.println("\n===== Dataset Size: " + size + " =====");

            // Number of iterations for averaging
            int iterations = 100;
            long totalArrayTime = 0;
            long totalHashSetTime = 0;
            long totalTreeSetTime = 0;

            // Generate random data
            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                int num = random.nextInt();
                array[i] = num;
                hashSet.add(num);
                treeSet.add(num);
            }

            // Measure search times over multiple iterations
            for (int i = 0; i < iterations; i++) {
                // Generate a random number to search for
                int searchValue = array[random.nextInt(size)];

                // Measure array search time
                long startTimeArray = System.nanoTime();
                for (int num : array) {
                    if (num == searchValue) {
                        break;
                    }
                }
                long endTimeArray = System.nanoTime();
                totalArrayTime += (endTimeArray - startTimeArray);

                // Measure HashSet search time
                long startTimeHash = System.nanoTime();
                hashSet.contains(searchValue);
                long endTimeHash = System.nanoTime();
                totalHashSetTime += (endTimeHash - startTimeHash);

                // Measure TreeSet search time
                long startTimeTree = System.nanoTime();
                treeSet.contains(searchValue);
                long endTimeTree = System.nanoTime();
                totalTreeSetTime += (endTimeTree - startTimeTree);
            }

            long avgArrayTime = totalArrayTime / iterations;
            long avgHashSetTime = totalHashSetTime / iterations;
            long avgTreeSetTime = totalTreeSetTime / iterations;

            System.out.println("Average Array search time: " + avgArrayTime / 1000000.0 + "ms");
            System.out.println("Average HashSet search time: " + avgHashSetTime / 1000000.0 + "ms");
            System.out.println("Average TreeSet search time: " + avgTreeSetTime / 1000000.0 + "ms");

            // Assertions to verify the performance
            assertTrue(avgHashSetTime < avgArrayTime, "HashSet search should be faster than array search");
            assertTrue(avgTreeSetTime < avgArrayTime, "TreeSet search should be faster than array search");
            assertTrue(avgHashSetTime <= avgTreeSetTime, "HashSet search should be faster or equal to TreeSet search");
        }
    }
}
