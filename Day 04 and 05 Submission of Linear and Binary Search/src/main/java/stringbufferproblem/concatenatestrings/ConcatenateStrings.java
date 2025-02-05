package stringbufferproblem.concatenatestrings;

public class ConcatenateStrings {
    public static void main(String[] args) {
        // Array of words to be concatenated
        String[] words = {"Hello", " ", "World", "!", " ", "How", " ", "are", " ", "you?"};

        // Call the method to concatenate strings and store the result
        String result = concatenateString(words);

        // Print the concatenated string
        System.out.println(result);
    }

    // Method to concatenate an array of strings using StringBuffer
    public static String concatenateString(String[] words) {
        // Initialize a new StringBuffer object
        StringBuffer sbf = new StringBuffer();

        // Iterate through each string in the array and append it to the StringBuffer
        for (String word : words) {
            sbf.append(word);
        }

        // Return the concatenated string after the loop finishes
        return sbf.toString();
    }
}
