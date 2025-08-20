class LocalVariable {
    public static void main(String[] args) {
        int num = 10; // local variables
        // int a; compiler throws error if we don't initialise
        System.out.println(num);
    }
}

class InstanceVariable {
    int balance; // we can decalre without intialising

    public static void main(String[] args) {
        InstanceVariable iv = new InstanceVariable();
        System.out.println(iv.balance);
    }
}

class StaticVariables {
    static int count = 0; // value will be same for every object creation

    public static void main(String[] args) {
        System.out.println(count); // accessing without classname => works only in this class

        System.out.println(StaticVariables.count); // accessing with classname
    }
}

class Demo {
    int instanceVar = 10; // insitialising Instance variable
    static int staticVar = 20; // initialising Static variable

    static void staticMethod() {
        // System.out.println(instanceVar); ERROR: Cannot access directly

        // Access static variable directly because it's an static method
        System.out.println("Static Variable: " + staticVar);

        // To access instance variable,we create an object
        Demo obj = new Demo();
        System.out.println("Instance Variable: " + obj.instanceVar);
    }

    void instanceMethod() {
        // Instance methods can access both
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}

class Main {
    public static void main(String[] args) {
        Demo.staticMethod(); // Calling static method
        Demo d = new Demo();
        d.instanceMethod(); // Calling instance method
    }
}

// Interview experience task
class BankAccount {

    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    static int interestRate = 10;

    static void increaseInterestRate() {
        interestRate++;
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100);
        BankAccount ba2 = new BankAccount(200);
        ba1.balance = 100;
        ba2.balance = 200;

        System.out.println(ba1.balance);
        System.out.println(ba2.balance);

        System.out.println(interestRate);

    }

}

// count total number of objects created for a class

class Employee {
    static int count = 0;

    // static int num = 100;
    // int num = 200; not allowed same name in same class

    public Employee() {
        increaseCount();
    }

    static void increaseCount() {
        count = count + 1;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(count);
        Employee emp2 = new Employee();
        System.out.println(count);
    }

}

// class work

class EmployeeDetails {
    int empid = 1;
    String name = "arunkumar";
    byte age = 100;
    String department = "IT";

    static String companyCode = "Infosys";

    void displayDetails() {
        System.out.println("empId : " + empid + "name : " + name + "age : " + age + "department : " + department
                + "companyCode : " + companyCode);
    }

    public static void main(String[] args) {
        EmployeeDetails obj = new EmployeeDetails();
        obj.displayDetails();
    }
}

// Assignments

class Students {
    String name = "Arunkumar";
    int rollNumber = 123456;
    int marks = 40;

    static String schoolName = "vasavi school";

    void displayDetails() {
        System.out.println("student detals : " + " name : " + name + " rollNumber : " + rollNumber + " Marks : " + marks
                + " schoolName : " + schoolName);
    }

    public static void main(String[] args) {
        Students stu = new Students();
        stu.displayDetails();
    }

}
