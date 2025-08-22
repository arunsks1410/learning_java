class ContinueStatements {
    public static void main(String[] args) {
        // Class Work
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
        // Home Work
        String[] students = { "Arun", "kumar", "karan", "karthi", "Muthalif" };
        int[] grades = { 70, 99, 22, 31, 51 };

        for (int i = 0; i < students.length; i++) {
            if (grades[i] < 50) {
                continue;
            }
            System.out.println("name : " + students[i] + "grade : " + grades[i]);
        }
    }
}
