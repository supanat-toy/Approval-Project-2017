/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.*;

/**
 *
 * @author SONY
 */
public class mFormDisplay {
    private int form_id;
    private String event_name;
    private String activity;
    private String department;
    private Date starting_date;
    private String coordinator_name;
    private String coordinator_phone_number;
    private boolean supervisor_progress;
    private boolean admin_progress;
    private boolean department_progress;
    private String latest_response;

    public mFormDisplay(){
        this.form_id = 0;
        this.event_name = "N/A";
        this.activity = "N/A";
        this.department = "N/A";
        this.starting_date = new Date();
        this.coordinator_name = "N/A";
        this.coordinator_phone_number = "N/A";
        this.supervisor_progress = false;
        this.admin_progress = false;
        this.department_progress = false;
        this.latest_response = "N/A";
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

    public boolean isSupervisor_progress() {
        return supervisor_progress;
    }

    public void setSupervisor_progress(boolean supervisor_progress) {
        this.supervisor_progress = supervisor_progress;
    }

    public boolean isAdmin_progress() {
        return admin_progress;
    }

    public void setAdmin_progress(boolean admin_progress) {
        this.admin_progress = admin_progress;
    }

    public boolean isDepartment_progress() {
        return department_progress;
    }

    public void setDepartment_progress(boolean department_progress) {
        this.department_progress = department_progress;
    }

    public String getLatest_response() {
        return latest_response;
    }

    public void setLatest_response(String latest_response) {
        this.latest_response = latest_response;
    }
    
    
}
