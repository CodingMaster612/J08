package Lab;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        Employee e1 = new Employee();
        Person p1 = new Student();
        Person p2 = new Employee();

        double stuTelPhoneBill = s1.calculateTelePhoneBill(120.5);
        System.out.println(stuTelPhoneBill);

        double stuTelPhoneBill2 = e1.calculateTelePhoneBill(120.5);
        System.out.println(stuTelPhoneBill2);


        p1.calculateTelePhoneBill(stuTelPhoneBill);
        p2.calculateTelePhoneBill(stuTelPhoneBill2);


        s1.getUserName();
        e1.getUserName();
        p1.getUserName();
        p2.getUserName();

        System.out.println(s1.getUserName());
        System.out.println(e1.getUserName()); 
        System.out.println(p1.getUserName());
        System.out.println(p2.getUserName());

        p1.taxes(stuTelPhoneBill2);
        p2.taxes(stuTelPhoneBill);
    }
}
