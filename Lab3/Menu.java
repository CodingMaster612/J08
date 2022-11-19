package Lab3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int number = 1;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int Menu = scanner.nextInt();
            if (Menu == 5) {
                System.out.println("program terminated");
                break;
            }

            switch (Menu) {
                case 1:
                    Menu1();
                    break;

                case 2:
                    Menu2();
                    break;

                case 3:
                    Menu3();
                    break;

                default:
                    System.out.println("test");

            }

        }

    }

    public static void Menu1() {
        System.out.println("You have entered the first menu");
    }

    public static void Menu2() {
        System.out.println("You have entered the second menu");

    }

    public static void Menu3() {
        System.out.println("You have entered the thrird menu");

    }

}