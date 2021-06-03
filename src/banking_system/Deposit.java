package banking_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Deposit {
	public static void main(String[] args) throws Exception {
		  
		Connection con = null;
		Statement st = null;
		ResultSet res = null;
		
		
		String dbUrl = "jdbc:mysql://localhost:3306/banking_system";
		String user = "root";		
		String pass = "Myroot21";
		
		try {
	    con = DriverManager.getConnection(dbUrl, user, pass);
	    st = con.createStatement();
	    
	    String Deposit = ("  select Account_No, First_Name, Last_Name, Balance + 1000 as Balance\n"
	    		+ "   from Account;");
	    
	   res = st.executeQuery(Deposit);
	   
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

