package Practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("enter a number");

        int number = console.nextInt();

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                System.out.println("not prime");
                break;

            } else {
                System.out.println("prime");
            }
        }
    }
}
