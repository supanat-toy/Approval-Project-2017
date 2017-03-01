package models;
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
    private List<FormModel> requests;
    private Date created_date;
    private int created_by;
    private Date updated_date;
    private int updated_by;

    public FormGroupModel(int form_group_id, List<FormModel> requests, Date created_date, int created_by, Date updated_date, int updated_by) {
        this.form_group_id = form_group_id;
        this.requests = requests;
        this.created_date = created_date;
        this.created_by = created_by;
        this.updated_date = updated_date;
        this.updated_by = updated_by;
    }

    public int getForm_group_id() {
        return form_group_id;
    }

    public List<FormModel> getRequests() {
        return requests;
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

    public void setForm_group_id(int form_group_id) {
        this.form_group_id = form_group_id;
    }

    public void setRequests(List<FormModel> requests) {
        this.requests = requests;
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
    
}
