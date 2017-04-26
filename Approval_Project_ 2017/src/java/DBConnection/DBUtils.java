/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 *
 * Video:  https://www.youtube.com/watch?v=DN3VAZdhLik
 */
public class DBUtils {
    
    private static Connection connection = null;
    
    public static Connection getConnection(){
        if(connection != null){
            return connection;
        }else{
            try {
                String driver = "com.mysql.jdbc.Driver";
                //String url = "jdbc:mysql://localhost:3306/approval_enterprise";
                String url = "jdbc:mysql://163.44.196.136:3306/approval_enterprise?zeroDateTimeBehavior=convertToNull";
                //String user = "root";
                //String password = "root";
                String user = "approval2017";
                String password = "Approval2017";
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }
    
    public static PreparedStatement getPreparedStatement(String sql){
        PreparedStatement ps = null;
        Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
        return ps;
    }
}
