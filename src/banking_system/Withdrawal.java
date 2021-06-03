package banking_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Withdrawal {
   static final String DB_URL = "jdbc:mysql://localhost/banking_system";
   static final String USER = "root";
   static final String PASS = "Myroot21";
   
   static final String QUERY = "SELECT Account_No, First_name, Last_name, Balance FROM Registration";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         
         String sql = "UPDATE Account" + "SET Balance = Balance - 500 WHERE Account_No = 1;";
         
         stmt.executeUpdate(sql);
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.print("Account Number: " + rs.getInt("Account_No"));
            System.out.print(", accountBalance: " + rs.getDouble("Balance"));
            System.out.print(", FirstName: " + rs.getString("First_name"));
            System.out.println(", LastName: " + rs.getString("Last_name"));
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}