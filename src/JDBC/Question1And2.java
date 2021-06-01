

/*1. Create database called bank that have a table called account with below columns
account_no integer (primary e=key
first_name String
last_name String
balance decimal

2. Write a java program to Insert 5 records into the account table using prepared statement. 

*/

package JDBC;

import java.sql.*;
import java.util.Properties;
 
public class Question1And2 {
    public static void main(String[] args) {
        Properties myProp = new Properties();
        myProp.put("user", "root");
        myProp.put("password", "Myroot21");
		
	 //Set streamingBatchInsert to True to enable streaming mode for batch inserts.
	 //myProp.put("streamingBatchInsert", "True");
        
	 Connection conn;
        try {
            conn = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/bank",
                            myProp);
            // establish connection and make a table for the data.
            Statement stmt = conn.createStatement();
            
            
            // Set AutoCommit to false to allow reuse the same
            // COPY statement
            conn.setAutoCommit(false);
            
            
            // Drop table and recreate.
            stmt.execute("DROP TABLE IF EXISTS Account CASCADE");
            stmt.execute("CREATE TABLE Account (Account_No int, Last_Name"
                            + " char(45), First_Name char(45),"
                            + "Balance decimal(20))");
            //  insert data. 
            String[] firstNames = new String[] { "Hailu", "Teklu", "Hanna",
                    "Aster", "Gebru" };
            String[] lastNames = new String[] { "Belay", "Kahsay", "Tesfay",
                    "Hailay", "Teklay" };

		
            String[] Balances = new String[] { "10000",
                            "20000", "30000",
                            "40000", "50000" };
            // Create the prepared statement
            PreparedStatement pstmt = conn.prepareStatement(
                            "INSERT INTO account (Account_No, Last_Name, " + 
                            "First_Name, Balance)" +
                            " VALUES(?,?,?,?)");
            
            // Add rows to a batch in a loop. Each iteration adds a
            // new row.
            for (int i = 0; i < firstNames.length; i++) {
                // Add each parameter to the row.
                pstmt.setInt(1, i + 1);
                pstmt.setString(2, lastNames[i]);
                pstmt.setString(3, firstNames[i]);
                pstmt.setString(4, Balances[i]);
                
                // Add row to the batch.
                pstmt.addBatch();
            }
	     
            try {
                // Batch is ready, execute it to insert the data
                pstmt.executeBatch();
            } catch (SQLException e) {
                System.out.println("Error message: " + e.getMessage());
                return; // Exit if there was an error
            }
            
            // Commit the transaction to close the COPY command
            conn.commit();
            
            
            // Print the resulting table.
            ResultSet rs = null;
            rs = stmt.executeQuery("SELECT account_No, First_Name, "
                            + "Last_Name FROM account ORDER BY Account_No");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - "
                                + rs.getString(2).trim() + " "
                                + rs.getString(3).trim());
            }
            // Cleanup
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}