package binarysearch.findpeakelementinanarray;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 20, 4, 1, 0, 8, 7, 5, 10, 9, 2};

        // Call the findPeakElement method and store the result in the index variable
        int index = findPeakElement(array);

        // Print the peak element in the array
        if (index != -1) {
            System.out.println("Peak element in the array is: " + array[index]);
        } else {
            System.out.println("No peak element found.");
        }
    }

    // Method to find the index of a peak element in the array
    public static int findPeakElement(int[] array){
        int low = 0, high = array.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // Check if mid is a peak element
            if (mid > 0 && mid < array.length - 1 && array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
                return mid;
            }

            // Check boundary conditions for mid
            if (mid == 0 && array[mid] > array[mid + 1]) {
                return mid;
            }

            if (mid == array.length - 1 && array[mid] > array[mid - 1]) {
                return mid;
            }

            // Decide whether to go to the left half or right half
            if (array[mid] < array[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If low and high converge, check if it's a peak element
        return low;
    }
}
