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
public class mResponseMessage {
    
    private int response_message_id;
    private int form_id;
    private int form_department_id;
    private String form_department_name;
    private String message;
    private Date created_date;
    private int created_by;
    private Date updated_date;
    private int updated_by;

    public String getForm_department_name() {
        return form_department_name;
    }

    public void setForm_department_name(String form_department_name) {
        this.form_department_name = form_department_name;
    }
    
    public int getResponse_message_id() {
        return response_message_id;
    }

    public void setResponse_message_id(int response_message_id) {
        this.response_message_id = response_message_id;
    }

    public int getForm_id() {
        return form_id;
    }

    public void setForm_id(int form_id) {
        this.form_id = form_id;
    }

    public int getForm_department_id() {
        return form_department_id;
    }

    public void setForm_department_id(int form_department_id) {
        this.form_department_id = form_department_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }

    public int getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(int updated_by) {
        this.updated_by = updated_by;
    }

    public mResponseMessage() {
    }
}
