package providers;

import DBConnection.DBUtils;
import java.sql.ResultSet;
import java.util.*;
import models.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SONY
 */
public class FormProvider {

    public static List<FormGroupModel> getAllRequests(int userID) {
        List<FormGroupModel> forms = new ArrayList<>();
        try {
            ResultSet rs = DBUtils.getPreparedStatement("SELECT * FROM form_group WHERE form_group.created_by = " + userID).executeQuery();
            while (rs.next()) {
                List<FormModel> requests = new ArrayList<>();
                int id = rs.getInt(1);
                Date c_date = rs.getDate(2);
                int c_by = rs.getInt(3);
                Date u_date = rs.getDate(4);
                int u_by = rs.getInt(5);
                ResultSet result = DBUtils.getPreparedStatement("SELECT * FROM form WHERE form.form_group_id = " + id).executeQuery();
                while (result.next()) {
                    FormModel _form = new FormModel();
                    int form_id = result.getInt(1);
                    int form_group_id = result.getInt(2);
                    int form_type_id = result.getInt(3);
                    String event_name = result.getString(4);
                    String activity = result.getString(5);
                    String department = result.getString(6);
                    String campus = result.getString(7);
                    String faculty = result.getString(8);
                    Date preparing_date = result.getDate(9);
                    Date starting_date = result.getDate(10);
                    String coordinator_name = result.getString(11);
                    String coordinator_phone_number = result.getString(12);
                    String description = result.getString(13);
                    Date created_date = result.getDate(14);
                    int created_by = result.getInt(15);
                    Date updated_date = result.getDate(16);
                    int updated_by = result.getInt(17);
                    Date approved_date = result.getDate(18);
                    int approved_by = result.getInt(19);
                    short is_approved = result.getShort(20);
                    _form = new FormModel(form_id, form_group_id, form_type_id, 
                            event_name, activity, department, campus, faculty, 
                            preparing_date, starting_date, coordinator_name, 
                            coordinator_phone_number, description, created_date, 
                            created_by, updated_date, updated_by, approved_date, 
                            approved_by, is_approved);
                    requests.add(_form);
                }
                FormGroupModel form_group = new FormGroupModel(id, requests, c_date, c_by, u_date, u_by);
                forms.add(form_group);
            }

        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
        return forms;
    }
    
    public static List<FormTypeModel> getAllFormTypeModel(){
        List<FormTypeModel> form_types = new ArrayList<>();
        try{
            ResultSet rs = DBUtils.getPreparedStatement("SELECT * FROM form_type").executeQuery();
            while(rs.next()){
                int form_type_id = rs.getInt(1);
                String name = rs.getString(2);
                FormTypeModel form_type = new FormTypeModel();
                form_type.setForm_type_id(form_type_id);
                form_type.setName(name);
                form_types.add(form_type);
            }
        }catch(Exception e){
            System.err.print(e.getMessage());
        }
        return form_types;
    }
}
