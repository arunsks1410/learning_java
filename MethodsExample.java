
// Assignment 
class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    double divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(5, 6);
        System.out.println(addResult);
        int subResult = calc.subtract(50, 6);
        System.out.println(subResult);
        int multiplyResult = calc.multiply(5, 6);
        System.out.println(multiplyResult);
        double divisionResult = calc.divide(25, 6);
        System.out.println(divisionResult);
    }

}

class BankApplication {
    double balance = 0;

    void deposit(double amt) {
        balance += amt;
        System.out.println("--- Amount deposited successfully --- ");
    }

    void checkBalace() {
        System.out.println("your current bal : " + balance);

    }

    public static void main(String[] args) {
        BankApplication bp = new BankApplication();
        bp.checkBalace();
        bp.deposit(1000);
        bp.checkBalace();
    }
}

class OrderTrackingSystem {
    int orderId = 170265;
    String currentStatus = "Delivered";

    String getCurrentStatus() {
        return currentStatus;
    }

    public static void main(String[] args) {
        OrderTrackingSystem ots = new OrderTrackingSystem();
        String status = ots.getCurrentStatus();
        System.out.println(status);
    }
}