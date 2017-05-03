/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author supanattechasothon
 */
public class mResult {
    private Boolean isSuccess;
    private String message;
//    private int userID;
//    private String nameProfile;
    private mUser userProfile;

    public mResult() {
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public mUser getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(mUser user) {
        this.userProfile = user;
    }
    
//    public int getUserID(){
//        return this.userID;
//    }
//    
//    public void setUserID(int userID){
//        this.userID = userID;
//    }
//    
//    public String getNameProfile(){
//        return this.nameProfile;
//    }
//    
//    public void setNameProfile(String nameProfile){
//        this.nameProfile = nameProfile;
//    }
    
    
}
