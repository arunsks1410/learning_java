import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparatorExample {
    public static void main(String[] args) {
        System.out.println("Inside Comparable and Comparator Main !!! ");
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.id - other.id;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(102, "Bharath"));
        employees.add(new Employee(105, "tharun"));
        employees.add(new Employee(101, "Arunkumar"));

        System.out.println("Employees : " + employees.toString());

        System.out.println("Before sort emp details >>>> ");
        for (Employee emp : employees) {
            System.out.println("emp : " + "id : " + emp.id + "name : " + emp.name);
        }

        // Collections.sort(employees);
        System.out.println("After sort emp details >>>> ");
        for (Employee emp : employees) {
            System.out.println("emp : " + "id : " + emp.id + "name : " + emp.name);
        }

        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        for (Employee emp : employees) {
            // System.out.println("emp : " + "id : " + emp.id + "name : " + emp.name);
        }

    }

}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + ":" + name;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1000, "Arun"));
        students.add(new Student(1002, "kumar"));
        students.add(new Student(100, "zetha"));

        // students.sort((s1 , s2) -> s1.id.compareTo(s2.id));
        students.sort((s1, s2) -> s1.id - s2.id);
        System.out.println(students);

    }
}