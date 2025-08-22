import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        // Class work
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Home Work
        System.out.println("Enter the number greater than 10 ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number <= 10) {
            System.out.println("Enter the number greater than 10 ");
            number = sc.nextInt();
        }
        System.out.println("Entered number : " + number);
        sc.close();
    }
}
