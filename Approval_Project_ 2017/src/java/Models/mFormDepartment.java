/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import Models.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author supanattechasothon
 */
public class mFormDepartment {
    private List<mRequestedItem> requestedItemList;
    private String form_department_name;
    private int form_department_id;
    private int form_id;
    private int form_type_id;
    private String description;
    private Date approved_date;
    private int approved_by;
    private Boolean is_approved;

    public mFormDepartment() {
    }

    public List<mRequestedItem> getRequestedItemList() {
        return requestedItemList;
    }

    public void setRequestedItemList(List<mRequestedItem> requestedItemList) {
        this.requestedItemList = requestedItemList;
    }

    public String getForm_department_name() {
        return form_department_name;
    }

    public void setForm_department_name(String form_department_name) {
        this.form_department_name = form_department_name;
    }

    public int getForm_department_id() {
        return form_department_id;
    }

    public void setForm_department_id(int form_department_id) {
        this.form_department_id = form_department_id;
    }

    public int getForm_id() {
        return form_id;
    }

    public void setForm_id(int form_id) {
        this.form_id = form_id;
    }

    public int getForm_type_id() {
        return form_type_id;
    }

    public void setForm_type_id(int form_type_id) {
        this.form_type_id = form_type_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getApproved_date() {
        return approved_date;
    }

    public void setApproved_date(Date approved_date) {
        this.approved_date = approved_date;
    }

    public int getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(int approved_by) {
        this.approved_by = approved_by;
    }

    public Boolean getIs_approved() {
        return is_approved;
    }

    public void setIs_approved(Boolean is_approved) {
        this.is_approved = is_approved;
    }
    
    
}
