import java.util.Scanner;

class IfCondition {

    private static double calculateShippingCost(double orderedAmount) {
        System.out.println("Ordered Amount : " + orderedAmount);
        if (orderedAmount > 5000) {
            return 0;
        } else if (orderedAmount >= 2000 && orderedAmount <= 5000) {
            return 100;
        } else {
            return 200;
        }

    }

    public static void main(String[] args) {
        // Class Work
        int num = 26;
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("odd number");
        }

        // Home Work
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter orderAmount");
        double orderAmount = sc.nextDouble();

        double shippingCost = IfCondition.calculateShippingCost(orderAmount);
        System.out.println("shipping cost : " + shippingCost);

    }

}
