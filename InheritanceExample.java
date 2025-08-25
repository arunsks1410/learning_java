// Class Work

class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void userDetails() {
        System.out.println("name : " + this.name + " email : " + this.email);
    }
}

class AdminUser extends User {
    String id;
    int phNo;
    String role;

    AdminUser(String name, String email, String id, int phNo, String role) {
        super(name, email);
        this.id = id;
        this.phNo = phNo;
        this.role = role;
    }

    void adminDetails() {
        System.out.println("id : " + this.id + " phNo : " + this.phNo + " role : " + this.role);
    }

}

class CustomerUser extends User {
    String id;
    String location;
    int age;

    CustomerUser(String name, String email, String id, String location, int age) {
        super(name, email);
        this.id = id;
        this.location = location;
        this.age = age;
    }

    void customerDetails() {
        System.out.println("customer user details ");

        System.out.println("id : " + this.id + " location : " + this.location + " age : " + this.age);
    }

    public static void main(String[] args) {
        CustomerUser cu = new CustomerUser("Arunkumar", "dev@dev.com", "1", "Bangalore", 25);
        cu.userDetails();
        cu.customerDetails();

    }

}

class PremiumUser {
    String name;
    String location;
    int age;

    PremiumUser(String name, String location,
            int age) {

        this.name = name;
        this.location = location;
        this.age = age;
    }

    void premiumUserDetails() {
        System.out.println("premium user details ");
        System.out.println("name : " + this.name + " location : " + this.location + " age : " + this.age);
    }

    void showDetails() {
        System.out.println("Inside premium user !!! ");
    }

}

class NormalUser extends PremiumUser {
    String name;
    String location;
    int age;

    NormalUser(String name, String location, int age, String nuName, String nuLocation, int nuAge) {
        super(name, location, age);
        this.name = nuName;
        this.location = nuLocation;
        this.age = nuAge;
    }

    void normalUserDetails() {
        System.out.println("normal user details ");
        System.out.println("name : " + this.name + " location : " + this.location + " age : " + this.age);
    }

    void showDetails() {
        System.out.println("Inside normal user !!! ");
    }

    public static void main(String[] args) {
        PremiumUser nu = new NormalUser("Arunkumar", "Bangalore", 0,
                "karthi", "chennai", 20);

        nu.showDetails();

        // nu.normalUserDetails();
        // nu.premiumUserDetails();
        // nu.name = "kiran";
        // nu.normalUserDetails();
        // nu.premiumUserDetails();

        // nu.normalUserDetails();
        // nu.customerDetails();
    }

}

// Home Work => overriding methods
class Product {
    String name;
    double price;

    Product() {
        this("lpatop", 6000);
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double discount) {
        double finalPrice = price - (price * discount);
        System.out.println("final price : " + finalPrice);
    }
}

class ElectronicProduct extends Product {

    @Override // overriding by default
    void applyDiscount(double discount) {
        double finalPrice = price - (price * discount);
        System.out.println("final price : " + finalPrice);
    }
}

class ClothingProduct extends ElectronicProduct {

    @Override // overriding by default
    void applyDiscount(double discount) {
        double finalPrice = price - (price * discount);
        System.out.println("final price : " + finalPrice);
    }

}

class Main {
    public static void main(String[] args) {
        Product p = new ClothingProduct();
        p.applyDiscount(0.10);
        Product p1 = new ElectronicProduct();
        p1.applyDiscount(0.30);
        Product prod1 = new Product();
        prod1.applyDiscount(0.25);

    }
}

// Multi level inheritance

class Employee {

}

class SoftwareEngineer extends Employee {

}

class SeniorSoftwareEngineer extends SoftwareEngineer {

}

// Hierarchical Inheritanca

class Vehicle {
    String vehicleName;
}

class Car extends Vehicle {
    String fuel_type = "diesel";
}

class Bike extends Vehicle {
    String fuel_type = "petrol";
}
