
package Lab3;

public class RepeatedChar {
    public static void main(String[] args) {
        Repeat();
    }

    public static void Repeat() {
        String inputStr = "morning";

        for (char i : inputStr.toCharArray()) {
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: " + i);
                break;
            }
        }

        StringBuilder sb = new StringBuilder(inputStr);
        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.toString() + "nn");

            sb = sb.deleteCharAt(3);
            break;

        }
    }
}
