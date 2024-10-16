package set_8;
import java.util.*;

public class set8_3 {
    public static void main(String[] args) {
        String text = "This is a sample text. This text is for counting the occurrences of words in this text.";

        String normalizedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");

        String[] words = normalizedText.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        Set<String> sortedWords = new TreeSet<>(wordCount.keySet());

        System.out.println("Word occurrences:");
        for (String word : sortedWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
