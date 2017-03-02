package Models;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY
 */
public class FormGroupModel {
    private int form_group_id;
    private FormModel basic_form;
    private Date created_date;
    private int created_by;
    private Date updated_date;
    private int updated_by;
    private UserModel latest_response;

    public FormGroupModel(int form_group_id, FormModel request, Date created_date, int created_by, Date updated_date, int updated_by, UserModel latest_response) {
        this.form_group_id = form_group_id;
        this.basic_form = request;
        this.created_date = created_date;
        this.created_by = created_by;
        this.updated_date = updated_date;
        this.updated_by = updated_by;
        this.latest_response = latest_response;
    }

    public int getForm_group_id() {
        return form_group_id;
    }
    
    public FormModel getBasic_form() {
        return basic_form;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public int getCreated_by() {
        return created_by;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public int getUpdated_by() {
        return updated_by;
    }

    public UserModel getLatest_response() {
        return latest_response;
    }

    public void setForm_group_id(int form_group_id) {
        this.form_group_id = form_group_id;
    }
    
    public void setBasic_form(FormModel request) {
        this.basic_form = request;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }

    public void setUpdated_by(int updated_by) {
        this.updated_by = updated_by;
    }

    public void setLatest_response(UserModel latest_response) {
        this.latest_response = latest_response;
    }
    
}
