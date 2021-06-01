
//Write a java program to double the balances of each record (hint update each record)


package JDBC;

import java.sql.*;


public class Question3 {

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
	    
	    String BalanceDoubled = ("  select Account_No, First_Name, Last_Name, Balance*2 as Balance\n"
	    		+ "   from Account;");
	    
	   res = st.executeQuery(BalanceDoubled);
	   
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

