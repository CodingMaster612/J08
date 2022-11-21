package Lab3Practice;

import java.util.Scanner;

public class Qone {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("gimme String");
        String someString = console.nextLine();

        System.out.println("Gimme letter");
        char letter = console.next().charAt(0);

        String emptyString = "";

        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == letter) {
                someString = someString.replaceAll(Character.toString(letter), emptyString);
            }
        }

        System.out.println(someString);
    }
}