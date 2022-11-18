package Lab3;

public class VowelsConst {
    public static void main(String[] args) {
        VC();
    }

    public static void VC() {
        String str = "Java";

        int count = 0;
        int total = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {

                count++;

            }

        }

        System.out.println("Number of vowels in the given sentence is " + count);
        System.out.println("Number of constants in the given sentence is " + (total - count));

    }
}