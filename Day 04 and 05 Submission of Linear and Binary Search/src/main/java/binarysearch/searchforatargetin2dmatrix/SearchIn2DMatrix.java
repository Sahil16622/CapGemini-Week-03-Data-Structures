package binarysearch.searchforatargetin2dmatrix;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        // Define the 2D sorted matrix
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        // Define the target value to search for
        int target = 16;

        // Call the searchMatrix method and store the result in the result variable
        boolean result = searchMatrix(matrix, target);

        // Print the result
        if (result) {
            System.out.println("Target value " + target + " is found in the matrix.");
        } else {
            System.out.println("Target value " + target + " is not found in the matrix.");
        }
    }

    // Method to perform binary search in a 2D sorted matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Check if the matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int left = 0, right = numRows * numCols - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Convert mid index to row and column indices
            int midValue = matrix[mid / numCols][mid % numCols];

            // Compare the middle element with the target
            if (midValue == target) {
                return true; // Target value is found
            } else if (midValue < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        // Return false if the target value is not found
        return false;
    }
}
