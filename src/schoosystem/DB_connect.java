
package schoosystem;

import java.sql.*;
import java.sql.DriverManager;


/**
 *
 * @author Hp
 */
public class DB_connect {
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    
    public Connection getConnection(){
     
        try{
            String url ="jdbc:mysql://localhost/school";
            String user ="root";
            String pass ="";
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established");
              
        }
        catch(SQLException ex){
            System.out.println("Error "+ex.getMessage());
        }
        catch(ClassNotFoundException ex){
           System.out.println("Error "+ex.getMessage()); 
        }
        finally{
            return conn;
        }
    }
    
    public ResultSet searchQuery(String sql){
        try{
            getConnection();
            st=conn.createStatement();
            rs=st.executeQuery(sql);
        }
        catch(SQLException ex){
            System.out.println("Error "+ex.getMessage());
        }
        return rs;
    }
    
}
