/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Providers;

import DBConnection.DBUtils;
import Functions.TimeConverter;
import Models.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

/**
 *
 * @author supanattechasothon
 */
public class CreateProvider {
    public TimeConverter tc = new TimeConverter();
    public static final int COORDINATOR = 1, SUPERVISOR = 2, ADMIN = 3, PROPERTIES = 4, TECHNICAL = 5, SOUNDANDLIGHT = 6, ARTSANDCULTURE = 7, SECURITY = 8, IT = 9;
    //PASS
    public mResult submitRequest(mForm form) {
        mResult result = new mResult();
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into form "
                    + "(event_name,"
                    + "activity,"
                    + "department,"
                    + "campus,"
                    + "facility,"
                    + "preparing_date,"
                    + "starting_date,"
                    + "coordinator_name,"
                    + "coordinator_phone_number,"
                    + "description,"
                    + "created_date,"
                    + "created_by,"
                    + "updated_date,"
                    + "updated_by,"
                    + "approved_date_supervisor,"
                    + "approved_by_supervisor,"
                    + "is_approved_supervisor,"
                    + "approved_date_admin,"
                    + "approved_by_admin,"
                    + "is_approved_admin,"
                    + "is_delete) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, form.getEvent_name());
            ps.setString(2, form.getActivity());
            ps.setString(3, form.getDepartment());
            ps.setString(4, form.getCampus());
            ps.setString(5, form.getFacility());
            ps.setTimestamp(6, tc.dateStringtoDate(form.getPreparing_date()));
            ps.setTimestamp(7, tc.dateStringtoDate(form.getStarting_date()));
            ps.setString(8, form.getCoordinator_name());
            ps.setString(9, form.getCoordinator_phone_number());
            ps.setString(10, form.getDescription());
            ps.setTimestamp(11, tc.dateStringtoDate(form.getCreated_date()));
            ps.setInt(12, form.getCreated_by());
            ps.setTimestamp(13, tc.dateStringtoDate(form.getUpdated_date()));
            ps.setInt(14, form.getUpdated_by());
            ps.setTimestamp(15, tc.dateStringtoDate(form.getApproved_date_supervisor()));
            ps.setInt(16, form.getApproved_by_supervisor());
            ps.setBoolean(17, form.isIs_approved_supervisor());
            ps.setTimestamp(18, tc.dateStringtoDate(form.getApproved_date_admin()));
            ps.setInt(19, form.getApproved_by_admin());
            ps.setBoolean(20, form.isIs_approved_admin());
            ps.setBoolean(21, form.isIs_delete());
            ps.execute();
            result.setIsSuccess(true);
            result.setMessage("Submit Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            result.setIsSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }
    
    public mResult updateForm(mForm new_form){
        mResult result = new mResult();
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("update form set "
                    + "event_name = ?,"
                    + "activity = ?,"
                    + "department = ?,"
                    + "campus = ?,"
                    + "facility = ?,"
                    + "preparing_date = ?,"
                    + "starting_date = ?,"
                    + "coordinator_name = ?,"
                    + "coordinator_phone_number = ?,"
                    + "description = ?,"
                    + "created_date = ?,"
                    + "created_by = ?,"
                    + "updated_date = ?,"
                    + "updated_by = ?,"
                    + "approved_date_supervisor = ?,"
                    + "approved_by_supervisor = ?,"
                    + "is_approved_supervisor = ?,"
                    + "approved_date_admin = ?,"
                    + "approved_by_admin = ?,"
                    + "is_approved_admin = ?,"
                    + "is_delete = ? where form_id = ?");
            ps.setString(1, new_form.getEvent_name());
            ps.setString(2, new_form.getActivity());
            ps.setString(3, new_form.getDepartment());
            ps.setString(4, new_form.getCampus());
            ps.setString(5, new_form.getFacility());
            ps.setTimestamp(6, tc.dateStringtoDate(new_form.getPreparing_date()));
            ps.setTimestamp(7, tc.dateStringtoDate(new_form.getStarting_date()));
            ps.setString(8, new_form.getCoordinator_name());
            ps.setString(9, new_form.getCoordinator_phone_number());
            ps.setString(10, new_form.getDescription());
            ps.setTimestamp(11, tc.dateStringtoDate(new_form.getCreated_date()));
            ps.setInt(12, new_form.getCreated_by());
            ps.setTimestamp(13, tc.dateStringtoDate(new_form.getUpdated_date()));
            ps.setInt(14, new_form.getUpdated_by());
            ps.setTimestamp(15, tc.dateStringtoDate(new_form.getApproved_date_supervisor()));
            ps.setInt(16, new_form.getApproved_by_supervisor());
            ps.setBoolean(17, new_form.isIs_approved_supervisor());
            ps.setTimestamp(18, tc.dateStringtoDate(new_form.getApproved_date_admin()));
            ps.setInt(19, new_form.getApproved_by_admin());
            ps.setBoolean(20, new_form.isIs_approved_admin());
            ps.setBoolean(21, new_form.isIs_delete());
            ps.setInt(22, new_form.getForm_id());
            ps.execute();
            result.setIsSuccess(true);
            result.setMessage("Update Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            result.setIsSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}
