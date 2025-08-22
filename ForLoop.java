class ForLoop {
    public static void main(String[] args) {

        // Class Work

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Home Work
        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                sum += numbers[i];
            else
                count += 1;
        }
        System.out.println("sum of odd Numbers in Array : " + sum);
        System.out.println("Count of even number in array : " + count);
    }
}
