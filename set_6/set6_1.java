import java.io.FileReader;
import java.io.IOException;

public class set6_1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify at least one file.");
            return;
        }

        for (String fileName : args) {
            countLinesInFile(fileName);
        }
    }

    private static void countLinesInFile(String fileName) {
        int lineCount = 0;

        try (FileReader fileReader = new FileReader(fileName)) {
            int character;
            while ((character = fileReader.read()) != -1) 
            {if (character == '\n') {lineCount++;}}
            
            if (lineCount > 0 || character == -1) {
                lineCount++;
            }
            System.out.println(fileName + ": " + lineCount + " lines");
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName + ": " + e.getMessage());
        }
    }
}
