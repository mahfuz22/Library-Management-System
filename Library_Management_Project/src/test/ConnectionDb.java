
package test;

import java.sql.*;


public class ConnectionDb {
    
    public static Connection getConnection() {
        Connection con=null;
        String url="jdbc:mysql://localhost:3306/another_test";
        String user="root";
        String pass="123";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            
            
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        finally{
            try {
                if(con==null) {
                System.out.println("connection failed");
                //con.close();
            }
            else{
                //System.out.println("connection successfull");
                //con.close();
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }

   
    
}
