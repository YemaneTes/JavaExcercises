
//Write a java program to retrieve all records in the ascending order of their balance and print out the first_name and balance.


package JDBC;

import java.sql.*;


public class Question4 {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/bank";
		String user = "root";		
		String pass = "Myroot21";

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			
			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("SELECT account_No, First_Name, "
                    + "Balance FROM account ORDER BY balance asc");
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("First_Name") + ", " + myRs.getString("Balance"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}

