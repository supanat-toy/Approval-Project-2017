/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import Models.FormGroupModel;
import Models.FormModel;
import Providers.FormProvider;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * Video:  https://www.youtube.com/watch?v=DN3VAZdhLik
 */
public class DBUtils {
    public static PreparedStatement getPreparedStatement(String sql){
        PreparedStatement ps = null;
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://ap-cdbr-azure-southeast-b.cloudapp.net:3306/approval_enterprise";
            //String url = "jdbc:mysql://ap-cdbr-azure-southeast-b.cloudapp.net;databaseName=approval_enterprise";
            String user = "b6f663e592256f";
            String pass = "e8d63265";
        
            con = DriverManager.getConnection(url, user, pass);
            ps = con.prepareStatement(sql);
        }catch(Exception e){
            
        }
        return ps;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        List<FormGroupModel> results = FormProvider.getAllRequests(8);
        //List<FormModel> results = FormProvider.getForms(1);
        System.out.print(results.size());
        //System.out.print(results.get(0).getForm_group_id() + ":");
        //System.out.print(results.get(0).getBasic_form().getCoordinator_name());
    }
}
