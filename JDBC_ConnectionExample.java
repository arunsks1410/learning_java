import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class MyFirstJDBCApplication {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "12345";

        String query = "INSERT INTO students(id, name, address) VALUES (103,'Academy','India')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, userName, password);
            Statement st = c.createStatement();
            int count = st.executeUpdate(query);
            System.out.println("Number of rows got affected : " + count);
            st.close();
            c.close();
            System.out.println("connection closed");

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found : " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error : " + e.getMessage());
        }

    }
}