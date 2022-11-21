package Lab4;

public class Repeated {
    public static void main(String[] args) {

    }

    public String stringTimes(String str, int n) {
        String temp = "";

        for (int i = 0; i < n; i++) {
            temp = temp + str;
        }
        return temp;
    }

}
