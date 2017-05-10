/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Providers;
import DBConnection.DBUtils;
import Models.mFormDisplay;
import Models.mFormType;
import Models.mResponse;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author supanattechasothon
 */
public class ListProvider {
    public final int COORDINATOR = 1, SUPERVISOR = 2, ADMIN = 3, PROPERTIES = 4, TECHNICAL = 5, SOUNDANDLIGHT = 6, ARTSANDCULTURE = 7, SECURITY = 8, IT = 9;
    UserProvider userProvider = new UserProvider();
    //PASS
    public List<mFormDisplay> getForms(int created_by) {
        List<mFormDisplay> forms = new ArrayList<mFormDisplay>();
        try {
            ResultSet result = DBUtils.getPreparedStatement("select * from form where form.is_delete = false and form.created_by = " + created_by + " order by form.updated_date desc").executeQuery();
            while (result.next()) {
                mFormDisplay form = new mFormDisplay();
                int form_id = result.getInt("form_id");
                form.setForm_id(form_id);
                form.setEvent_name(result.getString("event_name"));
                form.setActivity(result.getString("activity"));
                form.setDepartment(result.getString("department"));
                form.setStarting_date(result.getDate("starting_date"));
                form.setCoordinator_name(result.getString("coordinator_name"));
                form.setCoordinator_phone_number(result.getString("coordinator_phone_number"));
                boolean is_approved_supervisor = result.getBoolean("is_approved_supervisor");
                boolean is_approved_admin = result.getBoolean("is_approved_admin");
                form.setAdmin_progress(is_approved_admin);
                form.setSupervisor_progress(is_approved_supervisor);
                form.setDepartment_progress(getDepartmentProgress(form_id));
                int supervisor_id = result.getInt("approved_by_supervisor");
                int admin_id = result.getInt("approved_by_admin");
                if(is_approved_admin){
                    form.setLatest_response(userProvider.getUserName(admin_id));
                }else if(is_approved_supervisor){
                    form.setLatest_response(userProvider.getUserName(supervisor_id));
                }
                forms.add(form);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return forms;
    }
    public List<mFormDisplay> getForms() {
        List<mFormDisplay> forms = new ArrayList<mFormDisplay>();
        try {
            ResultSet result = DBUtils.getPreparedStatement("select * from form where form.is_delete = false order by form.updated_date desc").executeQuery();
            while (result.next()) {
                mFormDisplay form = new mFormDisplay();
                int form_id = result.getInt("form_id");
                form.setForm_id(form_id);
                form.setEvent_name(result.getString("event_name"));
                form.setActivity(result.getString("activity"));
                form.setDepartment(result.getString("department"));
                form.setStarting_date(result.getDate("starting_date"));
                form.setCoordinator_name(result.getString("coordinator_name"));
                form.setCoordinator_phone_number(result.getString("coordinator_phone_number"));
                boolean is_approved_supervisor = result.getBoolean("is_approved_supervisor");
                boolean is_approved_admin = result.getBoolean("is_approved_admin");
                form.setAdmin_progress(is_approved_admin);
                form.setSupervisor_progress(is_approved_supervisor);
                form.setDepartment_progress(getDepartmentProgress(form_id));
                int supervisor_id = result.getInt("approved_by_supervisor");
                int admin_id = result.getInt("approved_by_admin");
                if(is_approved_admin){
                    form.setLatest_response(userProvider.getUserName(admin_id));
                }else if(is_approved_supervisor){
                    form.setLatest_response(userProvider.getUserName(supervisor_id));
                }
                forms.add(form);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return forms;
    }
    public List<mFormDisplay> getFormsAdmin() {
        List<mFormDisplay> forms = new ArrayList<mFormDisplay>();
        try {
            ResultSet result = DBUtils.getPreparedStatement("select * from form where form.is_delete = false and form.is_approved_supervisor = true order by form.updated_date desc").executeQuery();
            while (result.next()) {
                mFormDisplay form = new mFormDisplay();
                int form_id = result.getInt("form_id");
                form.setForm_id(form_id);
                form.setEvent_name(result.getString("event_name"));
                form.setActivity(result.getString("activity"));
                form.setDepartment(result.getString("department"));
                form.setStarting_date(result.getDate("starting_date"));
                form.setCoordinator_name(result.getString("coordinator_name"));
                form.setCoordinator_phone_number(result.getString("coordinator_phone_number"));
                boolean is_approved_supervisor = result.getBoolean("is_approved_supervisor");
                boolean is_approved_admin = result.getBoolean("is_approved_admin");
                form.setAdmin_progress(is_approved_admin);
                form.setSupervisor_progress(is_approved_supervisor);
                form.setDepartment_progress(getDepartmentProgress(form_id));
                int supervisor_id = result.getInt("approved_by_supervisor");
                int admin_id = result.getInt("approved_by_admin");
                if(is_approved_admin){
                    form.setLatest_response(userProvider.getUserName(admin_id));
                }else if(is_approved_supervisor){
                    form.setLatest_response(userProvider.getUserName(supervisor_id));
                }
                forms.add(form);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return forms;
    }
    public mResponse getLatestResponse(int form_id) {
        mResponse latest_response = new mResponse();
        List<mResponse> responses = new ArrayList<mResponse>();
        try {
            ResultSet result = DBUtils.getPreparedStatement("select * from form_department where form_department.form_id = " + form_id).executeQuery();
            while (result.next()) {
                mResponse response = new mResponse();
                response.setUser_id(result.getInt("approved_by"));
                response.setUpdated_date(result.getDate("approved_date"));
                responses.add(response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        latest_response = responses.get(0);
        for (int i = 1; i < responses.size(); ++i) {
            mResponse compared_response = responses.get(i);
            if(latest_response.getUpdated_date().compareTo(compared_response.getUpdated_date()) < 0){
                latest_response = compared_response;
            }
        }
        return latest_response;
    }

    public boolean getDepartmentProgress(int form_id) {
        boolean department_progress = true;
        try {
            ResultSet result = DBUtils.getPreparedStatement("select is_approved from form_department where form_department.form_id = " + form_id).executeQuery();
            while (result.next()) {
                boolean is_approved = result.getBoolean("is_approved");
                department_progress = department_progress && is_approved;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return department_progress;
    }
    //PASS
    public List<mFormType> getFormTypes(){
        List<mFormType> formTypes = null;
        try {
            ResultSet result = DBUtils.getPreparedStatement("select * from form_type").executeQuery();
            while (result.next()) {
                int form_type_id = result.getInt("form_type_id");
                String name = result.getString("name");
                mFormType formType = new mFormType(form_type_id, name);
                formTypes.add(formType);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return formTypes;
    }
}
