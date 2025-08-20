import java.util.Scanner;

class ScannerMethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");

        while (!sc.hasNextInt()) {
            System.out.println("inside while !!! ");
            System.out.println("Invalid input! Please enter a valid integer");
            sc.next();
        }

        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your full name : ");
        String name = sc.nextLine();

        System.out.println("Enter your favorite color : ");
        String color = sc.next();

        System.out.println("Enter you kilograms : ");
        double weight = sc.nextDouble();

        System.out.println("Collected input ------------ ");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("color : " + color);
        System.out.println("weight : " + weight);

        sc.close();
    }
}

class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        while (!name.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid please enter alphabets only");
            scanner.next();
        }

        System.out.println("Enter your age : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid ! Enter values in nuemric only");
            scanner.next();
        }
        int age = scanner.nextInt();

        System.out.println("Enter your salary : ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid! Enter the values in numerical ");
            scanner.next();

        }
        double salary = scanner.nextDouble();

        System.out.println("--------  Data --------");
        System.out.println("name : " + name + "age : " + age + "salary : " + salary);

        scanner.close();
    }
}