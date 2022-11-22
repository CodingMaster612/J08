package Lab5;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "hello world man to";
        str.toCharArray();
        String rev = "";

        // Breaking the sentence into words
        String s[] = str.split(" ");

        // Adding the words stored in the array to the last
        for (int i = 0; i < s.length; i++) {
            rev = s[i] + " " + rev;
        }

        // Printing the reversed sentence
        System.out.println("Reversed sentence: " + rev);
    }
}
