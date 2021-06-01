//Write a java program to Print the account details(first_name, last_name and balance) of the accounts with highest balance and lowest balance.


package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question6 {

	public static void main(String[] args) throws Exception {
	  
		Connection con = null;
		Statement st = null;
		ResultSet res = null;
		
		
		String dbUrl = "jdbc:mysql://localhost:3306/bank";
		String user = "root";		
		String pass = "Myroot21";
		
		try {
	    con = DriverManager.getConnection(dbUrl, user, pass);
	    st = con.createStatement();
	    
	    String maxAndMin = ("select  * from account where Balance=(select max(Balance) from account)\n"
	    		+ "   or Balance=(select min(Balance) from account);");
	    
	   res = st.executeQuery(maxAndMin);
	   
	    while (res.next()) {
	    	 
			System.out.println(res.getString("First_Name") + ", " + res.getString("last_Name") + ", " + res.getString("Balance"));
	    	
	    } 
	    
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (res != null) {
				res.close();
			}
			
			if (st != null) {
				st.close();
			}
			
			if (con != null) {
				con.close();
			}
		}
	}

}

