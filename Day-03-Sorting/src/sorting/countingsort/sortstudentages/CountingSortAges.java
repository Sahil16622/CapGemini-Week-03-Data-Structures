package sorting.countingsort.sortstudentages;

import java.util.Arrays;

public class CountingSortAges {
    // Function to perform Counting Sort
    public static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1; // Age range (10 to 18)
        int[] count = new int[range]; // Count array
        int[] output = new int[ages.length]; // Sorted output array

        // Step 1: Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in correct positions
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted array back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    // Main function to test Counting Sort
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 17, 13, 12, 14, 11, 16};

        System.out.println("Original Ages: " + Arrays.toString(studentAges));

        countingSort(studentAges, 10, 18);

        System.out.println("Sorted Ages: " + Arrays.toString(studentAges));
    }
}

