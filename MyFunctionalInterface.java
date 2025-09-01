// Before java 8 functional interface

interface MyFunctionalInterface {
    void sayHello();
}

// After java 8 functional interface
interface MyFunctionalInterface1 {
    double square(double x);
}

class Main {
    public static void main(String[] args) {
        MyFunctionalInterface hello = new MyFunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from functional interface .... ");
            }
        };

        hello.sayHello();

        MyFunctionalInterface1 s = (double x) -> x * x;
        double squareOfNumber = s.square(25);
        System.out.println("squareOfNumber : " + squareOfNumber);
    }
}
