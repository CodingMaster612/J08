package Lab;

public abstract class Student extends Person implements Bills {

    @Override
    double taxes(double amount) {

        return amount * 0.2;
    }

    @Override
    public String toString() {
        return "Student []";
    }

}
