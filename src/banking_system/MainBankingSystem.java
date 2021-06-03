package banking_system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
public class MainBankingSystem {
     
    public static void main(String[] args) {
        String sqlQuery = "INSERT INTO `Account` (account_no, `first_name`, `last_name`, `balance`) VALUES (?,?,?,?)";
         
        List<Account> acctList = new ArrayList<>();
         
        acctList.add(new Account(2001,	"John", "Doe", 2500.00));
        acctList.add(new Account(2002,	"Tesfay", "Kiros",1250.00));
        acctList.add(new Account(2004, "Hadgu",	"Kindeya",	5000.30));
         
        try {
             
            Connection conn = DriverManager.getConnection(
                                        DbContract.HOST+DbContract.DB,
                                        DbContract.USER,
                                        DbContract.PASSWORD);
             
            PreparedStatement preparedInsert = conn.prepareStatement(sqlQuery);
             
            int insertions = 0;
            for (Account a : acctList) {
                preparedInsert.setInt(1, a.getAccount_no());
                preparedInsert.setString(2, a.getFirst_name());
                preparedInsert.setString(3, a.getLast_name());
                preparedInsert.setDouble(4, a.getBalance());

                insertions += preparedInsert.executeUpdate();
            }
             
            System.out.println(insertions+" records added");
            
            
            int depo = 0;
            for (Account a : acctList) {
            	
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
         
 
    }
 
}