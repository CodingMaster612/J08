package Lab3;

public class RemoveChar {
    public static void main(String[] args) {
        remove();
    }

    public static void remove() {

        String a = "Average";

        char remove = 'A';
        char remove1 = 'a';

        char temp[] = new char[a.length()];

        for (int i = 0; i < a.length(); i++)

        {

            if (a.charAt(i) == remove || a.charAt(i) == remove1)

            {

                continue;

            }

            else

            {

                temp[i] = a.charAt(i);

            }

        }

        a = new String(temp);

        System.out.println("After remove a character from string " + a);
    }

}
