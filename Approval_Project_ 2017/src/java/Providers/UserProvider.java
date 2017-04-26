/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Providers;

import DBConnection.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author supanattechasothon
 */
public class UserProvider {
    public final int COORDINATOR = 1, SUPERVISOR = 2, ADMIN = 3, PROPERTIES = 4, TECHNICAL = 5, SOUNDANDLIGHT = 6, ARTSANDCULTURE = 7, SECURITY = 8, IT = 9;
    
    

    public String getUserName(int user_id){
        String name = "";
        try{
            ResultSet result = DBUtils.getPreparedStatement("select name from user where user.user_id = " + user_id).executeQuery();
            while (result.next()) {
                name = result.getString("name");
                break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return name;
    }
    
    public int getResponsibleFormID(int user_id){
        int id = 0;
        try {
            ResultSet result = DBUtils.getPreparedStatement("select responsible_form_type_id from user where user.user_id = " + user_id).executeQuery();
            while(result.next()){
                id = result.getInt("responsible_form_type_id");
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
}
