import java.util.Scanner;

class BreakStatement {
    public static void main(String[] args) {
        // Class Work
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // Home Work
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search in array ");
        int enteredNumber = sc.nextInt();
        boolean isNumberFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == enteredNumber) {
                isNumberFound = true;
                break;
            }
        }

        if (isNumberFound) {
            System.out.println("Number Found !!!");
        } else {
            System.out.println("Number not found !!!");
        }
        sc.close();
    }
}
