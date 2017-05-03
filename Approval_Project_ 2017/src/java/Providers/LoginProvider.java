/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Providers;

import DBConnection.DBUtils;
import Functions.UserProfileFunctions;
import Models.mResponse;
import Models.mResult;
import Models.mUser;
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
    
    public mResult Authorization(String email, String password) {
        mResult result = new mResult();
        
        String queryStatement = "select * from user";
        String query_password = "";
        try{
            PreparedStatement ps = DBUtils.getPreparedStatement(queryStatement);
            //ps.setString(1, email);
            //ps.setString(2, password);
            
            ResultSet queryResult = ps.executeQuery();

            while(queryResult.next()){    
               String query_email = queryResult.getString("email");
               if (query_email.trim().equals(email.trim())){
                   query_password = queryResult.getString("password");
                   String name = queryResult.getString("name");
                   String username = queryResult.getString("username");
                   String phone_number = queryResult.getString("phone_number");
                   int responsible_form_type_id = queryResult.getInt("responsible_form_type_id");
                   int userID = queryResult.getInt("responsible_form_type_id");
                   
                   mUser user = new mUser();
                   user.setEmail(email);
                   user.setName(name);
                   user.setPassword(password);
                   user.setPhone_number(phone_number);
                   user.setResponsible_form_type_id(responsible_form_type_id);
                   user.setUser_id(userID);
                   user.setResponsible_form_type_name(responsible_form_type_id);
                   result.setUserProfile(user);
                   
                   break;
               }
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    
        if (query_password.equals("")){
            result.setIsSuccess(false);
            result.setMessage("Username is wrong");
        }
        else if (query_password.equals(password)){
            result.setIsSuccess(true);
            result.setMessage("Logic successfully");  
            
            
        }
        else {
            result.setIsSuccess(false);
            result.setMessage("Password is wrong");
        }  
        
        return result;
    }
    
}
