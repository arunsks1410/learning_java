interface BankAccount {
    public static final double MIN_BALANCE = 1000;
    int number = 12345;

    public abstract void deposit(double amount);

    public abstract void withDraw(double amount);

    public abstract double checkBalance();
}

class SavingsAccount implements BankAccount {
    double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully !!!");
    }

    public void withDraw(double WithDrawAmount) {
        if ((balance - WithDrawAmount) >= MIN_BALANCE) {
            balance -= WithDrawAmount;
            System.out.println("Amount with drawed successfully !!!");
        } else {
            System.out.println("Insufficient balance !!! ");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class CurrentAccount implements BankAccount {
    double balance;

    CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully !!!");
    }

    public void withDraw(double WithDrawAmount) {
        if ((balance - WithDrawAmount) >= MIN_BALANCE) {
            balance -= WithDrawAmount;
            System.out.println("Amount with drawed successfully !!!");
        } else {
            System.out.println("Insufficient balance !!! ");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new SavingsAccount(3000);
        ba.deposit(2000);
        ba.withDraw(1500);
        System.out.println(ba.checkBalance());
        ba.withDraw(7000);

        BankAccount ca = new CurrentAccount(5000);
        ca.deposit(2300);
        ca.withDraw(6000);
        System.out.println(ca.checkBalance());
    }
}

// Multiple inheritance

interface BankService {
    void deposit(double amount);
}

interface LoanService {
    void applyLoan(double amount);
}

class Customer implements BankService, LoanService {
    public void deposit(double amount) {
        System.out.println("Amount got deposited successfully !!! ");
    }

    public void applyLoan(double amount) {
        System.out.println("loan applied successfully !!! ");
    }
}

class CustomerMain {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.applyLoan(500);
        c.deposit(300);

    }
}

// Interfaces java 8

interface PaymentGateway {

    private static void log(String message) {
        System.out.println("logging the messages !!!");
    }

    default void validateTransaction() {
        System.out.println("validating the transaction !!! ");
    }

    static void checkServiceStatus() {
        System.out.println("checking service status ");
    }

    void processPayment();

}

class CreditCardPayment implements PaymentGateway {
    public void processPayment() {
        System.out.println("payment processing through credit card !!!");
    }
}

class UPIPayment implements PaymentGateway {
    public void processPayment() {
        System.out.println("Payment processing through UPI payment !!!");
    }
}

class PaymentApp {
    public static void main(String[] args) {
        PaymentGateway.checkServiceStatus();

        PaymentGateway cc = new CreditCardPayment();
        cc.validateTransaction();
        cc.processPayment();

        PaymentGateway upi = new UPIPayment();
        upi.validateTransaction();
        upi.processPayment();

        // PaymentGateway pg;
        // pg = new CreditCardPayment();
        // pg = new UPIPayment();

    }
}