// Class work

class BankAccount {
    private double balance = 13200;
    private int pin = 1702;

    public void deposit(int enteredPin, double amount) {
        if (pin == enteredPin && amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited Successfully !!! " + amount);
        } else {
            System.out.println("Invalid Pin or in-correct pin");
        }
    }

    public void withDraw(int enteredPin, double amount) {
        if (enteredPin == pin && amount <= balance) {
            balance = balance - amount;
            System.out.println("Successfulyy withdrawn : " + amount + " curr balance : " + balance);
        } else {
            System.out.println("Invalid pin or amout in sufficient ");
        }
    }

}

class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.deposit(1234, 50000);
        ba.withDraw(1702, 2000);
    }
}

// Home Work

class BankAccountMain {
    private double balance = 12345;
    private int pin = 8796;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount, int enteredPin) {
        if (amount > 0 && enteredPin == pin) {
            balance = balance + amount;
            System.out.println("Amount deposited Successfully !!! " + balance);
        }
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int newPin) {
        if (pin > 1000 && pin <= 9999) {
            pin = newPin;
            System.out.println("Pin changed Successfulyy !!!!");
        } else {
            System.out.println("New pin should be four digit !");
        }
    }
}

class User {
    public static void main(String[] args) {
        BankAccountMain ba = new BankAccountMain();
        System.out.println("current balance : " + ba.getBalance());
        ba.setBalance(6000, 8796);

        System.out.println("current balance : " + ba.getBalance());

        System.out.println("current pin : " + ba.getPin());
        ba.setPin(1234);
        System.out.println("pin after got changes : " + ba.getPin());

    }
}