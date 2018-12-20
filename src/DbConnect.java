import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DbConnect {
    Connection conn;
    public static Connection DbConn(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:agency.sqlite");
            //JOptionPane.showMessageDialog(null,"Database Connected Successfully.");
            
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        } 
    }
   
}
