package bankaccountmanagement;
import java.sql.*;
import javax.swing.JOptionPane;
public class Javaconnect {
    Connection conn=null;
    
    public static Connection ConnecrDb(){
        try{
         Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\Semester-4\\JAVA (C)\\Final Project\\BankAccountManagement\\bank.sqlite");
                 return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
