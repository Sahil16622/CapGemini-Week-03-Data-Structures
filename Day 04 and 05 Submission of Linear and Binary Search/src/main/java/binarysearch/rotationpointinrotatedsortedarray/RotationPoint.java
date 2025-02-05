package binarysearch.rotationpointinrotatedsortedarray;

public class RotationPoint {
    public static void main(String[] args) {
        int[] rotatedArray = {15, 18, 2, 3, 6, 12};

        // Call the findRotationIndex method and store the result in the rotationIndex variable
        int rotationIndex = findRotationIndex(rotatedArray);

        // Print the rotation point (smallest element) in the array
        if (rotationIndex != -1) {
            System.out.println("Rotation point in a rotated array is: " + rotatedArray[rotationIndex]);
        } else {
            System.out.println("Array is not rotated");
        }
    }

    // Method to find the index of the rotation point in the rotated sorted array
    public static int findRotationIndex(int[] array){
        int low = 0, high = array.length - 1;

        // Handle edge cases
        if (array.length == 0) return -1; // Empty array
        if (array.length == 1 || array[low] < array[high]) return low; // Array is not rotated

        while (low < high) {
            int mid = (high + low) / 2;

            // Check if mid+1 is the smallest element
            if (mid < high && array[mid] > array[mid + 1]) {
                return mid + 1;
            }

            // Check if mid is the smallest element
            if (mid > low && array[mid] < array[mid - 1]) {
                return mid;
            }

            // Decide whether to go to the left half or right half
            if (array[mid] >= array[low]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low; // This will be the index of the smallest element
    }
}
