/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.Date;
/**
 *
 * @author USER
 */
public class FormModel {
    private int form_id;
    private int form_group_id;
    private int form_type_id;
    private String event_name;
    private String activity;
    private String department;
    private String campus;
    private String faculty;
    private Date preparing_date;
    private Date starting_date;
    private String coordinator_name;
    private String coordinator_phone_number;
    private String description;
    private Date created_date;
    private int created_by;
    private Date updated_date;
    private int updated_by;
    private Date approved_date;
    private int approved_by;
    private short is_approved;

    public FormModel(){
        this.form_id = 0;
        this.form_group_id = 0;
        this.form_type_id = 0;
        this.event_name = "";
        this.activity = "";
        this.department = "";
        this.campus = "";
        this.faculty = "";
        this.preparing_date = new Date();
        this.starting_date = new Date();
        this.coordinator_name = "";
        this.coordinator_phone_number = "";
        this.description = "";
        this.created_date = new Date();
        this.created_by = 0;
        this.updated_date = new Date();
        this.updated_by = 0;
        this.approved_date = new Date();
        this.approved_by = 0;
        this.is_approved = 0;
    }
    
    public FormModel(int form_id, int form_group_id, int form_type_id, String event_name, String activity, String department, String campus, String faculty, Date preparing_date, Date starting_date, String coordinator_name, String coordinator_phone_number, String description, Date created_date, int created_by, Date updated_date, int updated_by, Date approved_date, int approved_by, short is_approved) {
        this.form_id = form_id;
        this.form_group_id = form_group_id;
        this.form_type_id = form_type_id;
        this.event_name = event_name;
        this.activity = activity;
        this.department = department;
        this.campus = campus;
        this.faculty = faculty;
        this.preparing_date = preparing_date;
        this.starting_date = starting_date;
        this.coordinator_name = coordinator_name;
        this.coordinator_phone_number = coordinator_phone_number;
        this.description = description;
        this.created_date = created_date;
        this.created_by = created_by;
        this.updated_date = updated_date;
        this.updated_by = updated_by;
        this.approved_date = approved_date;
        this.approved_by = approved_by;
        this.is_approved = is_approved;
    }

    public int getForm_id() {
        return form_id;
    }

    public void setForm_id(int form_id) {
        this.form_id = form_id;
    }

    public int getForm_group_id() {
        return form_group_id;
    }

    public void setForm_group_id(int form_group_id) {
        this.form_group_id = form_group_id;
    }

    public int getForm_type_id() {
        return form_type_id;
    }

    public void setForm_type_id(int form_type_id) {
        this.form_type_id = form_type_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Date getPreparing_date() {
        return preparing_date;
    }

    public void setPreparing_date(Date preparing_date) {
        this.preparing_date = preparing_date;
    }

    public Date getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(Date starting_date) {
        this.starting_date = starting_date;
    }

    public String getCoordinator_name() {
        return coordinator_name;
    }

    public void setCoordinator_name(String coordinator_name) {
        this.coordinator_name = coordinator_name;
    }

    public String getCoordinator_phone_number() {
        return coordinator_phone_number;
    }

    public void setCoordinator_phone_number(String coordinator_phone_number) {
        this.coordinator_phone_number = coordinator_phone_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public short getIs_approved() {
        return is_approved;
    }

    public void setIs_approved(short is_approved) {
        this.is_approved = is_approved;
    }
    
    
}
