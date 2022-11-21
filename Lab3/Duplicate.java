package Lab3;

public class Duplicate {
    public static void main(String[] args) {
        String x = Dup("aabbccccccccc");
        System.out.println(x);
    }

    public static String Dup(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        return result;
    }
}
