package comparingdifferentdatastructuresforsearching;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;

public class DataStructureComparison {
    public static void main(String[] args) {
        // Define dataset sizes
        int[] sizes = {1000, 100000, 1000000};

        // Loop through each dataset size
        for (int size : sizes) {
            System.out.println("\n===== Dataset Size: " + size + " =====");

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
            long totalTimeArray = endTimeArray - startTimeArray;
            System.out.println("Array search time: " + totalTimeArray / 1000000.0 + "ms");

            // Measure HashSet search time
            long startTimeHash = System.nanoTime();
            hashSet.contains(searchValue);
            long endTimeHash = System.nanoTime();
            long totalTimeHash = endTimeHash - startTimeHash;
            System.out.println("HashSet search time: " + totalTimeHash / 1000000.0 + "ms");

            // Measure TreeSet search time
            long startTimeTree = System.nanoTime();
            treeSet.contains(searchValue);
            long endTimeTree = System.nanoTime();
            long totalTimeTree = endTimeTree - startTimeTree;
            System.out.println("TreeSet search time: " + totalTimeTree / 1000000.0 + "ms");
        }
    }
}
