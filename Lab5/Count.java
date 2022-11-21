package Lab5;

public class Count {
    public static void main(String[] args) {
        String countMe = "this is a string";
        countMe.toCharArray();

        int count = 0;

        for (int i = 0; i < countMe.length(); i++) {
            if (countMe.charAt(i) == 'a') {
                count++;
            }

        }
        System.out.println(count);

    }

}
