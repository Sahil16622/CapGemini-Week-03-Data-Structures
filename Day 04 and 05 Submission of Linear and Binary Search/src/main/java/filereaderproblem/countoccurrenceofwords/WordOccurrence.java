package filereaderproblem.countoccurrenceofwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordOccurrence {
    public static void main(String[] args) {
        // Path to the file to be read
        String filePath = "Sample.txt";

        // Read words from the file and store them in an array
        String[] words = readWordsFromFile(filePath);

        // Word to be counted
        String targetWord = "hello";

        // Count the occurrence of the target word
        int count = countOccurrence(words, targetWord);

        // Print the count
        System.out.println(count);
    }

    // Method to read words from a file and return them as an array
    public static String[] readWordsFromFile(String filePath){
        try(BufferedReader bfr = new BufferedReader(new FileReader(filePath))){
            StringBuilder sb = new StringBuilder();
            String line;
            // Read each line from the file
            while ((line = bfr.readLine()) != null){
                // Convert the line to lowercase, remove non-alphabet characters, and append it to StringBuilder
                sb.append(line.toLowerCase().replaceAll("[^a-zA-Z ]", "")).append(" ");
            }
            // Split the accumulated string into words and return the array
            return sb.toString().split("\\s+");
        } catch (IOException e) {
            // Handle any potential IOException
            e.printStackTrace();
            return null;
        }
    }

    // Method to count the occurrence of a specific word in an array of words
    public static int countOccurrence(String[] words, String target){
        int count = 0;
        // Iterate through each word in the array
        for (String word : words) {
            // Increment the count if the word matches the target
            if (word.equals(target)) {
                count += 1;
            }
        }
        return count;
    }
}
