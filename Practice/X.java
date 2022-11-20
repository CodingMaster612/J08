package Practice;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("enter a number");
        int n = console.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = n * (n - 1);
            System.out.println(sum);
        }

    }

}
