package Practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number;
        char choice;
        int even = 0;
        int odd = 0;

        do {
            System.out.println("enter a number");
            number = console.nextInt();

            if (number % 2 == 0) {
                even = even + number;
            } else {
                odd = odd + number;
            }

            System.out.print("continue?");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("sum of even numbers: " + even);
        System.out.println("sum of odd numbers " + odd);
    }

}
