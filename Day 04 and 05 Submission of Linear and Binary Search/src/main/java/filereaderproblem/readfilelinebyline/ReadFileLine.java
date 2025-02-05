package filereaderproblem.readfilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLine {
    public static void main(String[] args) {
        // Path to the file to be read
        String filePath = "Sample.txt";

        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file and print it to the console
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any potential IOException
            e.printStackTrace();
        }
    }
}
