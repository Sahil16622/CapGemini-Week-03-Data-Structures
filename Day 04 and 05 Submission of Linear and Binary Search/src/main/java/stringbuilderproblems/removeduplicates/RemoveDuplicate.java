package stringbuilderproblems.removeduplicates;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // Declaring a string
        String str = "HelloWorld";

        // Call the method to remove duplicates and store the result
        String result = removeDuplicates(str);

        // Print the result
        System.out.println(result);
    }

    // Method to remove duplicate characters from a given string while maintaining original order
    public static String removeDuplicates(String str){
        // Initialize an empty StringBuilder to store the result
        StringBuilder sb = new StringBuilder();

        // Initialize a HashSet to keep track of unique characters
        HashSet<Character> hs = new HashSet<>();

        // Iterate over each character in the input string
        for(char c : str.toCharArray()){
            // If the character is not in the HashSet, add it to the StringBuilder and HashSet
            if(!hs.contains(c)){
                sb.append(c);
                hs.add(c);
            }
        }

        // Return the StringBuilder as a string without duplicates
        return sb.toString();
    }
}
