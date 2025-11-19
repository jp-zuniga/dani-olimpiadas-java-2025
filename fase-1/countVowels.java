import java.util.Arrays;
import java.util.List;

public class Main {
    // Definir vocales
    public static List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

    public static void main(String[] args) {
        // Imprimir resultado de llamado de función
        System.out.println(countVowels("olimpiadas de Java"));
    }

    public static int countVowels(String text) {
        // Inicializar conteo
        int vowelCount = 0;

        // Iterar sobre caracteres de string
        for (int i = 0; i < text.length(); i++) {
            // Extraer caracter con .substring():
            // // Le pasamos el índice actual como inicio, y el próximo índice
            // // como fin para solo conseguir un solo caracter.
            // // Ese caracter se lo pasamos .contains() para verificar si esta
            // // en la lista de vocales.
            if (vowels.contains(text.substring(i, i + 1))) {
                // Incrementar conteo
                vowelCount += 1;
            }
        }

        return vowelCount;
    }
}