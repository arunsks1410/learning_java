// class Work

class PaymentSystem {

    void processPayment(double ccNumber) {
        System.out.println("paid via credit card number!!!");
    }

    void processPayment(String UPI, int mobileNumber) {
        System.out.println("paid via UPI Number and mobile number!!!");

    }

    void processPayment(int wallet) {
        System.out.println("Paid via wallet !!!");
    }

    void processPayment(long wallet) {
        System.out.println("paid via wallet !!! ");
    }

}

class PolymorphismMain {
    public static void main(String[] args) {
        PaymentSystem ps = new PaymentSystem();
        ps.processPayment(10);
        ps.processPayment("arunsksUPI", 12345);
        ps.processPayment(1234.45);
        ps.processPayment(11);
    }

}

// Payment class

class PaymentClass {
    void processPayment(double amount) {
        System.out.println("processing amount of rupess : " + amount);
    }
}

class UPIPayment extends PaymentClass {
    @Override
    void processPayment(double amount) {
        System.out.println("processing the payment via UPI : " + amount);
    }
}

class CCPay extends PaymentClass {
    // @Override // By default it will override
    void processPayment(double amount) {
        System.out.println("Processing the payment via credit card of amount : " + amount);
    }
}

class PaymentClassMain {
    public static void main(String[] args) {
        PaymentClass pc = new UPIPayment();
        PaymentClass cc = new CCPay();

        pc.processPayment(1000);
        cc.processPayment(230);
    }
}

// Home Work
// overloading
class BookingSystem {
    void bookTickets(String name) {
        System.out.println("ticket got booked for name : " + name);
    }

    void bookTickets(String name, String email) {
        System.out.println("ticket got booked for name  and email is : " + name + email);

    }

    void bookTickets(String name, int phoNo) {
        System.out.println("ticket got booked for name  and phNo is : " + name + phoNo);

    }
}

class BookingSystemExample {
    public static void main(String[] args) {
        BookingSystem bs = new BookingSystem();
        bs.bookTickets("sundhar");
        bs.bookTickets("karan", 87786);
        bs.bookTickets("karthi", "karthi123@gmail.com");
    }
}

// over-riding

class Notification {
    void send() {
        System.out.println("Notification sent !!!!");
    }
}

class EmailNotification extends Notification {

    @Override
    void send() {
        System.out.println("Notification sent via email ");
    }
}

class SMSNotification extends Notification {
    @Override
    void send() {
        System.out.println("Notification sent via SMS");

    }
}

class NotificationMain {
    public static void main(String[] args) {
        Notification ne = new EmailNotification();
        ne.send();
        Notification ns = new SMSNotification();
        ns.send();
        Notification n = new Notification();
        n.send();
    }
}

class Test {
    void test(int a, long b) {
        System.out.println(a + b);
    }

    void test(long a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Test t = new Test();
        // t.test(11, 0); Throws ambiguity Error
    }
}