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
public class ResponseMessageModel {
    private int response_message_id;
    private int form_id;
    private String message;
    private Date created_date;
    private int created_by;
    private Date updated_date;
    private int updated_by;
    
    public ResponseMessageModel(){
        this.response_message_id = 0;
        this.form_id = 0;
        this.message = "";
        this.created_date = new Date();
        this.created_by = 0;
        this.updated_date = new Date();
        this.updated_by = 0;
    }

    public ResponseMessageModel(int response_message_id, int form_id, String message, Date created_date, int created_by, Date updated_date, int updated_by) {
        this.response_message_id = response_message_id;
        this.form_id = form_id;
        this.message = message;
        this.created_date = created_date;
        this.created_by = created_by;
        this.updated_date = updated_date;
        this.updated_by = updated_by;
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
    
    
}
