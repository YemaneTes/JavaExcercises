package banking_system;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	 
	public class Transfering {
		public static void main(String args[]) {
			Connection con = null;
			int result1=0, result2=0;
			
			try {
				con = dbConnection();
							
				//begin transaction
				con.setAutoCommit(false);
				
				PreparedStatement ps = con.prepareStatement("update user set balance=balance-? where account=?");
				ps.setInt(1, 3);
				ps.setInt(2, 2);
				result1 = ps.executeUpdate();
				
				ps = con.prepareStatement("update user set balance=balance+? where account=?");
				ps.setInt(1, 3);
				ps.setInt(2, 2);
				result2 = ps.executeUpdate();
	 
				if(result1 == 0 || result2 == 0) {
					//rollback transaction
					con.rollback();
					System.out.println("Transaction Rolled Back!");
				}
	 
				//end transaction
				con.commit();
				System.out.println("Commit Successful!");
			} catch(Exception e) {
				try {
					con.rollback();
					System.out.println("Transaction Rolled Back!");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}
		
		static Connection dbConnection() {
			String DB_URL = "jdbc:mysql://localhost:330B/BankApplication";
			String DB_USER = "root";
			String DB_PASSWORD = "Myroot21";
			
			Connection con = null;
			
			try {
			//	Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			} catch(Exception e) {
				e.printStackTrace();
			}
			 
			return con;
		}
	}