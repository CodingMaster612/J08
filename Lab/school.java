package Lab;

import java.util.ArrayList;
import java.util.List;

public class school {

    List<Employee> employees = new ArrayList<Employee>();

    List<Student> students = new ArrayList<Student>();

    public school() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "school [employees=" + employees + ", students=" + students + "]";
    }

}
