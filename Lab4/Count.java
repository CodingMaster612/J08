package Lab4;

public class Count {
    public static void main(String[] args) {

        int p = countXX("xxx");
        System.out.println(p);

    }

    public static int countXX(String x) {

        int count = 0;
        for (int i = 0; i < x.length() - 1; i++) {
            if (x.substring(1, i + 2).equals("xx")) {
                count++;
            }

        }
        return count;

    }
}
