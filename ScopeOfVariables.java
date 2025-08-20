// class work

class Employee {
    String name = "Arunkumar";
    int id = 1234567;
    double salary = 55324.56;

    void updateDetails(String newName, double newSalary) {
        name = newName;
        salary = newSalary;
    }

    public static void main(String[] args) {

        Employee emp = new Employee();

        System.out.println(emp.name);
        System.out.println(emp.salary);

        emp.updateDetails("karthikeyan", 0);

        System.out.println(emp.name);
        System.out.println(emp.salary);
    }
}

class Calculator {
    int addTwoNumbers() {
        int num1 = 1;
        int num2 = 5;
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.addTwoNumbers();
        System.out.println("result : " + result);
    }
}

// Assignments
class Car {
    String name = "BMW";
    String color = "Black";
    String modelNumber = "X7";
    double totalPrice = 5000000;

    double calculateFinalPrice() {
        double discountPercentage = 10;
        System.out.println("total price : " + totalPrice);
        double discountPrice = totalPrice - (totalPrice / discountPercentage);
        System.out.println(discountPrice);
        return discountPrice;
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        double price = bmw.calculateFinalPrice();
        System.out.println("price after discount : " + price);
    }

}