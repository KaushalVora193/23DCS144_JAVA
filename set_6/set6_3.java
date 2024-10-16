package set_6;
import java.io.FileReader;
import java.io.IOException;

public class set6_3 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please specify a character to count.");
            return;
        }

        char targetChar = args[0].charAt(0);
        String fileName = "xanadu.txt"; 

        int count = countCharacterInFile(fileName, targetChar);

        Integer countWrapper = Integer.valueOf(count);
        System.out.println("The character '" + targetChar + "' appears " + countWrapper + " times in " + fileName + ".");
    }

    private static int countCharacterInFile(String fileName, char targetChar) {
        int count = 0;

        try (FileReader fileReader = new FileReader(fileName)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                if (character == targetChar) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName + ": " + e.getMessage());
        }

        return count;
    }
}
