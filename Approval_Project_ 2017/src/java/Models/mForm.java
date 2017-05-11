/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Functions.TimeConverter;
import java.text.*;
import java.util.*;

/**
 *
 * @author SONY
 */
public class mForm {
    
    private int form_id;
    private String event_name;
    private String activity;
    private String department;
    private String campus;
    private String facility;
    private String preparing_date;
    private String pre_date_show;
    private String pre_time_show;
    private String starting_date;
    private String start_date_show;
    private String start_time_show;
    private String coordinator_name;
    private String coordinator_phone_number;
    private String description;
    private String created_date;
    private int created_by;
    private String updated_date;
    private int updated_by;
    private String approved_date_supervisor;
    private int approved_by_supervisor;
    private boolean is_approved_supervisor;
    private String approved_date_admin;
    private int approved_by_admin;
    private boolean is_approved_admin;
    private boolean is_delete;
    
    public mForm(){
        Date now = new Date();
        TimeConverter tc = new TimeConverter();
        this.created_date = tc.dateToString(now);
        this.updated_date = tc.dateToString(now);
        this.approved_date_supervisor = tc.dateToString(now);
        this.approved_by_supervisor = 0;
        this.is_approved_supervisor = false;
        this.approved_date_admin = tc.dateToString(now);
        this.approved_by_admin = 0;
        this.is_approved_admin = false;
        this.is_delete = false;
    }    

    public String getPre_date_show() {
        return pre_date_show;
    }

    public void setPre_date_show(String pre_date_show) {
        this.pre_date_show = pre_date_show;
    }

    public String getPre_time_show() {
        return pre_time_show;
    }

    public void setPre_time_show(String pre_time_show) {
        this.pre_time_show = pre_time_show;
    }

    public String getStart_date_show() {
        return start_date_show;
    }

    public void setStart_date_show(String start_date_show) {
        this.start_date_show = start_date_show;
    }

    public String getStart_time_show() {
        return start_time_show;
    }

    public void setStart_time_show(String start_time_show) {
        this.start_time_show = start_time_show;
    }

    
    public int getForm_id() {
        return form_id;
    }

    public void setForm_id(int form_id) {
        this.form_id = form_id;
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

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getPreparing_date() {
        return preparing_date;
    }

    public void setPreparing_date(String preparing_date) {
        this.preparing_date = preparing_date;
    }

    public String getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(String starting_date) {
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

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public int getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(int updated_by) {
        this.updated_by = updated_by;
    }

    public String getApproved_date_supervisor() {
        return approved_date_supervisor;
    }

    public void setApproved_date_supervisor(String approved_date_supervisor) {
        this.approved_date_supervisor = approved_date_supervisor;
    }

    public int getApproved_by_supervisor() {
        return approved_by_supervisor;
    }

    public void setApproved_by_supervisor(int approved_by_supervisor) {
        this.approved_by_supervisor = approved_by_supervisor;
    }

    public boolean isIs_approved_supervisor() {
        return is_approved_supervisor;
    }

    public void setIs_approved_supervisor(boolean is_approved_supervisor) {
        this.is_approved_supervisor = is_approved_supervisor;
    }

    public String getApproved_date_admin() {
        return approved_date_admin;
    }

    public void setApproved_date_admin(String approved_date_admin) {
        this.approved_date_admin = approved_date_admin;
    }

    public int getApproved_by_admin() {
        return approved_by_admin;
    }

    public void setApproved_by_admin(int approved_by_admin) {
        this.approved_by_admin = approved_by_admin;
    }

    public boolean isIs_approved_admin() {
        return is_approved_admin;
    }

    public void setIs_approved_admin(boolean is_approved_admin) {
        this.is_approved_admin = is_approved_admin;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }
    
    
}
