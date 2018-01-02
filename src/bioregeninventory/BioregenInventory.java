
package bioregeninventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author heartko20
 */
public class BioregenInventory {
    
public Connection DBConnection;
    /**
     * @param args the command line arguments
     */
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success");
        }
        catch (ClassNotFoundException cnfe){
            System.out.println("Connection Fail" +cnfe);
        }
        //Rojom: change localhoost to ipaddress of computer na magiging server nyo na may xampp server
        // example: String url = "jdbc:mysql://192.168.10.12:3306/Bioregendb";
        String url = "jdbc:mysql://localhost:3306/Bioregendb";
        try {
            DBConnection = (Connection) DriverManager.getConnection(url, "root", "");
            System.out.println("Database Connected");
                
        }
        catch(SQLException se) {
            System.out.println("No Database" +se);
        }
        return DBConnection;
    
      
    }
     public static void main(String[] args) {
        // TODO code application logic here
         splash sp = new splash();
        sp.setVisible(true);
        
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(30);
               // sp.progress.setValue(i);
                sp.count.setText(Integer.toString(i)+"%");
                
                if(i==100){
                    sp.setVisible(false);
                    new Login().setVisible(true);
                }
            }
        }catch(Exception e){
        
        }
        //new Login().setVisible(true);
    }
}
    
   
    
