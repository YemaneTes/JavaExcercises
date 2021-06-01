
//Write a java program that Calculates the total sum of the balances for all accounts and print it out.

package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question5 {
  public static void main(String[] args) throws Exception {
	  
    int sum = 0;
    
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
        "root", "Myroot21");
    Statement st = con.createStatement();
    ResultSet res = st.executeQuery("SELECT SUM(Balance) FROM Account");
    
    while (res.next()) {
      int c = res.getInt(1);
      sum = sum + c;
    }
    System.out.println("Total Balance = " + sum);
  }
}


   
    