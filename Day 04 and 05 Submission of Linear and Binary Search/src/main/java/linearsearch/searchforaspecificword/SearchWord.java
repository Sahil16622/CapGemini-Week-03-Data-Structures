package linearsearch.searchforaspecificword;

public class SearchWord {
    public static void main(String[] args) {
        // Array of sentences
        String[] sentences = {"Java is a versatile programming language that is widely used for building robust, scalable applications.",
                "It is platform-independent, which means you can run Java programs on any device that has the Java Virtual Machine (JVM) installed.",
                "Java is object-oriented, which makes it easy to manage and scale large projects.",
                "It provides strong memory management, exception handling, and a secure runtime environment.",
                "Java supports multithreading, allowing the execution of multiple threads simultaneously.",
                "Automatic garbage collection helps manage memory efficiently by removing unused objects.",
                "Java's rich standard library provides a wide range of utilities, from data structures to networking."};

        // Word to search for
        String wordToSearch = "multithreading";

        // Call the searchForWord method and store the result in the result variable
        String result = searchForWord(sentences, wordToSearch);

        // Print the result
        System.out.println(result);
    }

    // Method to find the first sentence containing the specific word
    public static String searchForWord(String[] sentences, String word) {
        // Iterate through the list of sentences
        for (String sentence : sentences) {
            // Check if the current sentence contains the specific word
            if (sentence.contains(word)) {
                // Return the current sentence if the word is found
                return sentence;
            }
        }
        // If no sentence contains the word, return "Not Found"
        return "Not Found";
    }
}
