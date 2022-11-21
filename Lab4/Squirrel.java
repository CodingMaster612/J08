package Lab4;

public class Squirrel {
    public static void main(String[] args) {
        SquirrelPlay(70, false);
    }

    public static boolean SquirrelPlay(int tempature, boolean isSummer) {

        if (isSummer && tempature <= 100 && tempature >= 60)

            return true;

        if (!(isSummer) && tempature <= 90 && tempature >= 60)

            return true;

        else

            return false;

    }

}
