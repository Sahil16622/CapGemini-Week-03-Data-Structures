package linearsearch.searchfirstnegativenumber;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        // Declaring an array with both positive and negative integers
        int[] array = {13, -5, 7, -15, 25, 0, 42, -8, 19, 5, 33, 8, -2, 2};

        // Call the firstNegativeNumber method and store the result in the index variable
        int index = firstNegativeNumber(array);

        // Print the first negative number found in the array
        if (index != -1) {
            System.out.println("First negative number in the array is: " + array[index]);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }

    // Method to find the index of the first negative number in the array
    public static int firstNegativeNumber(int[] array){
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is negative
            if (array[i] < 0) {
                // Return the index of the first negative number
                return i;
            }
        }
        // If no negative number is found, return -1
        return -1;
    }
}
