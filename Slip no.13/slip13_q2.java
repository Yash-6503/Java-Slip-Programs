import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class slip13_q2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file name as a command line argument.");
            return;
        }

        String fileName = args[0];
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("Number of words in the file: " + wordCount);
        System.out.println("Number of lines in the file: " + lineCount);
    }
}