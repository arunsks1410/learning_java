class StringBuilderExample {
    public static void main(String args[]) {
        StringBuilder query = new StringBuilder("SELECT * from employees WHERE 1=1");
        boolean filteredByDepartment = true;
        if (filteredByDepartment) {
            query.append(" AND department = IT");
        }
        boolean filteredBySalaryRange = true;
        if (filteredBySalaryRange) {
            query.append(" AND salary > 5000 ");
        }
        boolean filteredByJoiningDate = true;
        if (filteredByJoiningDate) {
            query.append(" AND joining_date >= '2020-01-01' ");
        }

        System.out.println("query : " + query);
    }
}
