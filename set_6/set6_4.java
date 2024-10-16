package set_6;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class set6_4 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Set6_4 <sourceFile> <destinationFile>");
            return;
        }

        String sourceFileName = args[0];
        String destinationFileName = args[1];

        copyFile(sourceFileName, destinationFileName);
    }

    private static void copyFile(String sourceFileName, String destinationFileName) {
        try (FileReader fileReader = new FileReader(sourceFileName);
             FileWriter fileWriter = new FileWriter(destinationFileName)) {

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("File copied successfully from " + sourceFileName + " to " + destinationFileName + ".");
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}
