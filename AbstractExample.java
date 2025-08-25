abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest();

    void showBalance() {
        System.out.println("Current balance : " + balance);
    }

}

class SavingsAccount extends Account {
    double interestRate = 5.0;

    SavingsAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        balance = balance + interest;
        System.out.println("interest added : " + interest);
        System.out.println("current balance " + balance);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        System.out.println("There is no interest for your current account : ");
    }
}

class BankSystem {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(3000);
        savings.calculateInterest();
        savings.showBalance();

        Account current = new CurrentAccount(6000);
        current.calculateInterest();
        current.showBalance();
    }
}

abstract class Vehicle {
    static void showDetails() {
        System.out.println("inside show details ");
    }

    void displayDetails() {

    }

    public static void main(String[] args) {
        Vehicle.showDetails();

    }
}

class VehicleMain extends Vehicle {
    public static void main(String[] args) {
        Vehicle v = new VehicleMain();
        v.showDetails();
    }
}

abstract class A {
    void details() {
    }

    void showDetails() {
    }

    static void hello() {
    }

    abstract void call();

    // abstract void dance(){

    // } // not possible
}