/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SONY
 */
public class DBUtils {
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatement ps = null;
        Class.forName("com.mysql.jdbc.Driver");
        //String url = "jdbc:mysql://ap-cdbr-azure-southeast-b.cloudapp.net/approval_enterprise";
        String url = "jdbc:mysql://ap-cdbr-azure-southeast-b.cloudapp.net;databaseName=approval_enterprise";
        String user = "b6f663e592256f";
        String pass = "e8d63265";
        
        Connection con = DriverManager.getConnection(url, user, pass);
        ps = con.prepareStatement(sql);
        return ps;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        getPreparedStatement("SELECT * FROM form_type;");
        
    }
}
