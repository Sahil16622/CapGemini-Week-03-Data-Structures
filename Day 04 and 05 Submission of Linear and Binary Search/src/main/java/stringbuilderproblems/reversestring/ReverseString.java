package stringbuilderproblems.reversestring;

public class ReverseString {
    public static void main(String[] args) {
        // Original String
        String str = "Hello, World!";
        // Call the reverseString method and store the result in reverseStr variable
        String reverseStr = reverseString(str);

        // Print the reversed string to the console
        System.out.println("The original String: " + str);
        System.out.println("The reverse String: " + reverseStr);
    }

    public static String reverseString(String str){
        // Create a new StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append string to stringbuilder
        sb.append(str);

        // Reverse the string using the reverse() method of StringBuilder
        sb.reverse();

        return sb.toString();
    }
}
