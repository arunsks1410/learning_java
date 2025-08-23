// Class name

class Company {
    String name;
    String location;
    String sector;

    Company(String name, String location, String sector) {
        System.out.println("inside company constructor : ");
        this.name = name;
        this.location = location;
        this.sector = sector;
    }

    public void companyDetails() {
        System.out.println("Company: " + name + ", Location: " + location + ", Sector: " + sector);

    }
}

class Employee extends Company {
    String empId;
    String name;
    String location;

    Employee(String cmpSector, String cmpLocation, String cmpName, String empId, String empName, String empLocation) {
        super(cmpName, cmpLocation, cmpSector); // This should be an first argument
        System.out.println("inside employee constructor : ");
        this.empId = empId;
        this.name = empName;
        this.location = empLocation;
    }

    public void empDetails() {
        System.out.println("empId : " + this.empId + " empName : " + this.name + " empLocation : " + this.location);
        super.companyDetails();
    }

}

class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Health-Care", "Bangalore", "kodewala", "12345", "arunkumar", "bangalore");
        emp1.empDetails();
        Employee emp2 = new Employee("IT Service", "chennai", "google", "98765", "Manoj", "salem");
        emp2.empDetails();

    }
}

// Home Work

class RBIBank {
    String bankName;
    String branch;
    String location;

    RBIBank(String name, String branch, String location) {
        this.bankName = name;
        this.branch = branch;
        this.location = location;
    }

    public void bankDetails() {
        System.out.println("Bank Name : " + bankName + "branch : " + branch
                + "location : " + location);
    }
}

class Customer extends RBIBank {
    String name;
    String account_type;
    String address;
    String email;

    Customer() {
        this("IOB", "Koramangala", "bangalore", null, "Saving Account", null, null);
    }

    Customer(String bankName, String branch, String location, String name,
            String account_type,
            String address,
            String email) {
        super(bankName, branch, location);
        this.name = name;
        this.account_type = account_type;
        this.address = address;
        this.email = email;
    }

    public void customerDetails() {
        System.out.println("name : " + this.name + " account_type : " + this.account_type + " address : " + this.address
                + " email : " + this.email);
        super.bankDetails();

    }
}

class RBIBankMain {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Indian overseas bank", "koramangala", "bangalore", "arunkumar", "Savings Account",
                "Salem", "arunsks98@gmail.com");
        cus1.customerDetails();
        Customer cus2 = new Customer();
        cus2.customerDetails();
    }
}