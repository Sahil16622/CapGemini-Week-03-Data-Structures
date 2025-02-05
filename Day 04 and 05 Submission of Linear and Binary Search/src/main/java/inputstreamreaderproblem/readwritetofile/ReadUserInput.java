package inputstreamreaderproblem.readwritetofile;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadUserInput {
    public static void main(String[] args) {
        // Path to the file where user input will be written
        String filePath = "UserInputFile.txt";

        // Calling a Method to read Input from user console
        readUserInput(filePath);
    }

    public static void readUserInput(String filePath){
        // Use try-with-resources to ensure all streams are closed automatically
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(filePath)) {

            String userInput;

            System.out.println("Enter text (type 'exit' to stop):");

            // Read user input until "exit" is entered
            while (!(userInput = br.readLine()).equalsIgnoreCase("exit")) {
                // Write user input to the file
                fw.write(userInput + System.lineSeparator());
            }

        } catch (IOException e) {
            // Handle any potential IOException
            e.printStackTrace();
        }
    }
}
