import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

    public static void main(String[] args) {
        System.out.println(countVowels("Olimpiadas de Java"));
    }

    public static int countVowels(String text) {
        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (vowels.contains(text.substring(i, i + 1))) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
