package Lab4;

public class AandB {
    public static void main(String[] args) {

        int product = Sum(9, 3);
        System.out.println(product);
    }

    public static int Sum(int a, int b) {
        if (("" + (a + b)).length() == ("" + a).length()) {
            return a + b;
        } else {
            return a;
        }
    }
}
