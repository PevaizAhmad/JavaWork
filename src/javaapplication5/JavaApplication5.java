
package javaapplication5;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JavaApplication5 {


    public static void main(String[] args) {
       
        try{
            Connection con;
            String URL="jdbc:postgresql://127.0.0.1:5432/new_db";
            String userName="postgres";
            String password="ahmad1213";
            con=DriverManager.getConnection(URL,userName,password);
            
            String qry="SELECT * FROM city.\"CITIES\" ";
            Statement stmnt;
            stmnt=(Statement) con.createStatement();
            ResultSet rs = stmnt.executeQuery(qry);
            while(rs.next())
            {
            System.out.println(rs.getString("city_name"));
            }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
