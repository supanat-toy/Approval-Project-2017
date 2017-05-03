/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import Models.*;

/**
 *
 * @author supanattechasothon
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
public class UserProfileFunctions {
    
    public String GetUserProfile_ID(HttpServletRequest request){
        
        HttpSession session = request.getSession();
        int userID = GetUserProfile(request).getUser_id();
        
        //return "1";
        return Integer.toString(userID);
    }
    
    public mUser GetUserProfile(HttpServletRequest request){
        mUser userProfile = new mUser();
        HttpSession session = request.getSession();
        
        userProfile = (mUser)session.getAttribute("userProfile");
        
        //userProfile = new mUser();
        //userProfile.setUser_id(1);
        
        return userProfile;
    }
    
    public void SetUserProfile(mUser userProfile, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("userProfile", userProfile);
    }
    
}
