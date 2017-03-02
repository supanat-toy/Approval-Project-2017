package Providers;

import DBConnection.DBUtils;
import java.sql.ResultSet;
import java.util.*;
import Models.*;
import java.sql.SQLException;

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
        ResultSet rs = null;
        try {
            rs = DBUtils.getPreparedStatement("SELECT * FROM form_group WHERE form_group.created_by = " + userID).executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                Date c_date = rs.getDate(2);
                int c_by = rs.getInt(3);
                Date u_date = rs.getDate(4);
                int u_by = rs.getInt(5);
                List<FormModel> all_form = getForms(id);
                FormModel basic_form = all_form.get(0);
                Date date = all_form.get(0).getUpdated_date();
                UserModel user = getLastestResponse(u_by);
                FormGroupModel form_group = new FormGroupModel(id, basic_form, c_date, c_by, u_date, u_by, user);
                forms.add(form_group);
            }
            rs.close();

        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
        return forms;
    }

    public static List<FormTypeModel> getAllFormTypeModel() {
        List<FormTypeModel> form_types = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DBUtils.getPreparedStatement("SELECT * FROM form_type").executeQuery();
            while (rs.next()) {
                int form_type_id = rs.getInt(1);
                String name = rs.getString(2);
                FormTypeModel form_type = new FormTypeModel();
                form_type.setForm_type_id(form_type_id);
                form_type.setName(name);
                form_types.add(form_type);
            }
            rs.close();
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
        return form_types;
    }

    public static List<FormModel> getForms(int id) {
        List<FormModel> requests = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DBUtils.getPreparedStatement("SELECT * FROM form WHERE form.form_group_id = " + id).executeQuery();
            while (rs.next()) {
                FormModel _form = new FormModel();
                int form_id = rs.getInt(1);
                int form_group_id = rs.getInt(2);
                int form_type_id = rs.getInt(3);
                String event_name = rs.getString(4);
                String activity = rs.getString(5);
                String department = rs.getString(6);
                String campus = rs.getString(7);
                String faculty = rs.getString(8);
                Date preparing_date = rs.getDate(9);
                Date starting_date = rs.getDate(10);
                String coordinator_name = rs.getString(11);
                String coordinator_phone_number = rs.getString(12);
                String description = rs.getString(13);
                Date created_date = rs.getDate(14);
                int created_by = rs.getInt(15);
                Date updated_date = rs.getDate(16);
                int updated_by = rs.getInt(17);
                Date approved_date = rs.getDate(18);
                int approved_by = rs.getInt(19);
                short is_approved = rs.getShort(20);
                _form = new FormModel(form_id, form_group_id, form_type_id,
                        event_name, activity, department, campus, faculty,
                        preparing_date, starting_date, coordinator_name,
                        coordinator_phone_number, description, created_date,
                        created_by, updated_date, updated_by, approved_date,
                        approved_by, is_approved);
                requests.add(_form);
            }
            rs.close();
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
        return requests;
    }
    
    public static UserModel getLastestResponse(int id){
        UserModel user = new UserModel();
        ResultSet rs = null;
        try{
            rs = DBUtils.getPreparedStatement("SELECT * FROM user WHERE user.user_id = " + id).executeQuery();
            int user_id = rs.getInt(1);
            String name = rs.getString(2);
            String phone_number = rs.getString(3);
            String email = rs.getString(4);
            String password = rs.getString(5);
            int responsible_form_type = rs.getInt(6);
            Date created_date = rs.getDate(7);
            Date updated_date = rs.getDate(8);
            user = new UserModel(user_id, name, phone_number, email, password, responsible_form_type, created_date, updated_date);
            rs.close();
        }catch(Exception e){
            System.err.print(e.getMessage());
        }
        return user;
    }
}
