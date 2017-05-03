/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author supanattechasothon
 */
public class mUser {
    private int user_id;
    private String name;
    private String phone_number;
    private String email;
    private String password;
    private int responsible_form_type_id;
    private String responsible_form_type_name;
    private Date created_date;
    private Date updated_date;

    public mUser() {
    }

    public void setResponsible_form_type_name(int responsible_form_type_id){
        String[] formTypeList = {"","Coordinator", "Supervisor","AdminDirector","Department"};
        if (responsible_form_type_id <= 4){
            this.responsible_form_type_name = formTypeList[responsible_form_type_id];
        }
        else {
            this.responsible_form_type_name = "Others";
        }
    }
    
    public String getResponsible_form_type_name(){
        return responsible_form_type_name;
    }
    
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getResponsible_form_type_id() {
        return responsible_form_type_id;
    }

    public void setResponsible_form_type_id(int responsible_form_type_id) {
        this.responsible_form_type_id = responsible_form_type_id;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
    
    
}
