// classwork

class LogicalOperators {
    int number = -30;

    boolean isNumberPositiveAndEven() {
        return number > 0 && number % 2 == 0;
    }

    public static void main(String[] args) {
        LogicalOperators obj = new LogicalOperators();
        boolean result = obj.isNumberPositiveAndEven();

        System.out.println("result : " + result);
    }
}

// Assignment
class Assignment {
    int number = 25;
    int age = 20;

    boolean isWithInRange() {
        return number > 10 && number < 50;
    }

    boolean isEligibleForDriving() {
        return age > 18 && age < 70;
    }

    public static void main(String[] args) {
        Assignment obj = new Assignment();
        boolean isNumInRange = obj.isWithInRange();
        boolean isUserEligible = obj.isEligibleForDriving();

        System.out.println(isNumInRange);
        System.out.println(isUserEligible);
    }
}