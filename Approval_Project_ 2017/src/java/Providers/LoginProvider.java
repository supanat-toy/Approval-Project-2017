/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Providers;

import DBConnection.DBUtils;
import Models.mResponse;
import Models.mResult;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author supanattechasothon
 */
public class LoginProvider {
    
    public final int COORDINATOR = 1, SUPERVISOR = 2, ADMIN = 3, PROPERTIES = 4, TECHNICAL = 5, SOUNDANDLIGHT = 6, ARTSANDCULTURE = 7, SECURITY = 8, IT = 9;
    
    public mResult Authorization(String username, String password) {
        mResult result = new mResult();
        
        String queryStatement = "select password user where user.username=?";
        String query_password = "";
        try{
            PreparedStatement ps = DBUtils.getPreparedStatement(queryStatement);
            ps.setString(1, username);
            //ps.setString(2, password);
            
            ResultSet queryResult = ps.executeQuery();

            while(queryResult.next()){            
               query_password = queryResult.getString("password");
               
               break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    
        if (query_password == ""){
            result.setIsSuccess(false);
            result.setMessage("Username is wrong");
        }
        else if (query_password != password){
            result.setIsSuccess(false);
            result.setMessage("Password is wrong");
        }
        else {
            result.setIsSuccess(true);
            result.setMessage("Logic successfully");
        }  
        
        return result;
    }
    
}
