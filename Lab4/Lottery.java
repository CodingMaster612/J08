package Lab4;

public class Lottery {
    public static void main(String[] args) {
        greeTicket(1, 2, 3);
    }

    public static int greeTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }
}