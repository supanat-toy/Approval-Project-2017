/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.Date;
/**
 *
 * @author USER
 */
public class UserModel {
    private int user_id;
    private String name;
    private String phone_number;
    private String email;
    private String password;
    private int responsible_form_type;
    private Date created_date;
    private Date updated_date;

    public UserModel(){
        this.user_id = 0;
        this.name = "";
        this.phone_number = "";
        this.email = "";
        this.password = "";
        this.responsible_form_type = 0;
        this.created_date = new Date();
        this.updated_date = new Date();
    }
    
    public UserModel(int user_id, String name, String phone_number, String email, String password, int responsible_form_type, Date created_date, Date updated_date) {
        this.user_id = user_id;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.responsible_form_type = responsible_form_type;
        this.created_date = created_date;
        this.updated_date = updated_date;
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

    public int getResponsible_form_type() {
        return responsible_form_type;
    }

    public void setResponsible_form_type(int responsible_form_type) {
        this.responsible_form_type = responsible_form_type;
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
