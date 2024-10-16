package set_6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class set6_5 {

    public static void main(String[] args) {
        String fileName = "output.txt";

        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
            
            System.out.println(" Enter text to write to the file (type 'exit' to finish) :");

            String inputLine;
            while (!(inputLine = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(inputLine);
                fileWriter.newLine(); 
            }
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        readFileUsingByteStream(fileName);
    }

    private static void readFileUsingByteStream(String fileName) {
        File file = new File(fileName);

        try (FileReader fileReader = new FileReader(file)) {
            int character;
            System.out.println("\nReading from the file using byte stream:");
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
