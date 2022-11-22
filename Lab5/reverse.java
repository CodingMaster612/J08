package Lab5;

public class reverse {
    public static void main(String[] args) {
        String countMe = "how are you";
        countMe.toCharArray();

        // Append whitespace for the extraction of last word
        countMe += " ";

        String reversed = "";

        // repeat until no word is left
        while (countMe.indexOf(" ") != -1) {
            // Extract word
            int idx = countMe.indexOf(" ");
            String word = countMe.substring(0, idx);

            // Concatenate in reverse order
            reversed = word + " " + reversed;

            // Remove word from the sentence
            countMe = countMe.substring(idx + 1);
        }

        // Output the reverse
        System.out.print("Reverse: ");
        System.out.println(reversed);
    }

}
