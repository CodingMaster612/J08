package DataStructures.AbstractLab;

abstract class Person {
    public abstract double taxes(double amount);

    public double Telephone(double amount) {
        return this.taxes(amount) + amount;
    }

    protected String firstName;
    protected String lastName;

}

class Student extends Person {

    @Override
    public double taxes(double amount) {
        return amount * .02;
    }

}

class Employee extends Person {

    @Override
    public double taxes(double amount) {

        return amount * .20;
    }

    class Application {
        public static void main(String[] args) {
            Student s1 = new Student();
            Employee e1 = new Employee();
            Person p1 = new Student();
            Person p2 = new Employee();

            double TelephoneX = s1.Telephone(120.5);
            System.out.println(TelephoneX);

            double Telephone = e1.Telephone(120.5);
            System.out.println(Telephone);

            double per = p2.Telephone(120.5);
            System.out.println(per);

            s1.toString();
            p2.toString();

        }

        @Override
        public String toString() {
            return "Application []";
        }

    }

}
