package Lab5;

public class Array {
    public static void main(String[] args) {

        String countMe = "this is a string";
        countMe.replaceAll("\\s", "");
        countMe.toCharArray();

        for (int i = 0; i < countMe.length(); i++) {

        }

        System.out.println(countMe.replaceAll("\s", ""));
    }
}
