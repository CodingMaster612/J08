package Lab5;

public class Dup {
    public static void main(String[] args) {
        String countMe = "this is a loop";
        countMe.toCharArray();

        for (int i = 0; i < countMe.length(); i++) {
            for (int j = i + i; j < countMe.length(); j++) {
                if (countMe.charAt(i) == countMe.charAt(j)) {
                    System.out.println(countMe.charAt(i));
                    break;
                }
            }
        }
    }
}
