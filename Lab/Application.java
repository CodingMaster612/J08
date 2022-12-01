package Lab;

public class Application {

    
    public static void main(String[] args) {

        school aSchool = new school();
        school aCompany = new school();


        Employee p1 = new Employee("Tim", "Liner", "Timothy612");
        Employee p2 = new Employee("John", "doe", "JohnDoe612");
        Employee p3 = new Employee("Justin", "Liner", "JustinLiner612");
        double per1TelPhoneBill = p1.calculateTelePhoneBill(120.5);
        double per2TelPhoneBill = p2.calculateTelePhoneBill(120.5);
        double per3TelPhoneBill = p3.calculateTelePhoneBill(120.5);

        System.out.println(per1TelPhoneBill);
        System.out.println(per2TelPhoneBill);
        System.out.println(per3TelPhoneBill);

        System.out.println(p1.getUserName());
        System.out.println(p2.getUserName());
        System.out.println(p3.getUserName());

        aCompany.getEmployees().add(p1);
        aCompany.getEmployees().add(p2);
        aCompany.getEmployees().add(p3);

        
        
        Student s1 = new Student("John", "Smith", "JohnSmith");
        Student s2 = new Student("John", "Liner", "JohnLiner");
        Student s3 = new Student("Billy", "joe", "BillyJoe");
        double stu1TelPhoneBill = s1.calculateTelePhoneBill(120.5);
        double stu2TelPhoneBill = s2.calculateTelePhoneBill(120.5);
        double stu3TelPhoneBill = s3.calculateTelePhoneBill(120.5);

        System.out.println(stu1TelPhoneBill);
        System.out.println(stu2TelPhoneBill);
        System.out.println(stu3TelPhoneBill);

        System.out.println(s1.getUserName());
        System.out.println(s2.getUserName());
        System.out.println(s3.getUserName());

        aSchool.getStudents().add(s1);
        aSchool.getStudents().add(s2);
        aSchool.getStudents().add(s3);


        

    }
    
}
