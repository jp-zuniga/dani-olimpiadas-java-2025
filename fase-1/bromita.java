public class Main {
    public static void main(String[] args) {
        String start = "Olimpiadas de Java 2025";
        String end   = reverse(start);

        System.out.println(start);
        System.out.println(end);
    }

    public static String reverse(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
