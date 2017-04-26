/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Functions.*;
import Models.*;
import Providers.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author supanattechasothon
 */

@WebServlet(name="Department", 
            loadOnStartup = 1,
            urlPatterns = { "/Department", 
                            "/Department/Details"
})
public class DepartmentServlet extends HttpServlet {

    UserProfileFunctions userProfileFunctions = new UserProfileFunctions();
    DetailsProvider detailsProvider = new DetailsProvider();
    ListProvider listProvider = new ListProvider();
    CreateProvider createProvider = new CreateProvider();
    UserProvider userProvider = new UserProvider();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userPath = request.getServletPath();
        mUser userProfile = userProfileFunctions.GetUserProfile(request);
        request.setAttribute("userProfile", userProfile);
       
        if (userPath.equals("/Department")) {
            userPath = "/List";
            List<mFormDisplay> formDisplayList = listProvider.getForms(userProfile.getUser_id());
            request.setAttribute("formDisplayList", formDisplayList);
            
        } else if (userPath.equals("/Department/Details")) {
            int id = Integer.parseInt(request.getParameter("id"));
            int department_id = Integer.parseInt(request.getParameter("department_id"));
            
            mForm formDetails = detailsProvider.getFormDetails(id);
            request.setAttribute("formDetails", formDetails);
            
            if (department_id == 1){
                mFormDepartment formDepartment_properties = detailsProvider.GetFormDetails_Properties(id);
                request.setAttribute("formDepartment_properties", formDepartment_properties);
                
                ArrayList<mResponseMessage> responseMessageList = detailsProvider.GetResponseMessageList(id, department_id);
                request.setAttribute("responseMessageList_1", responseMessageList);
            }
            else if (department_id == 2){
                mFormDepartment formDepartment_technical = detailsProvider.GetFormDetails_Technical(id);
                request.setAttribute("formDepartment_technical", formDepartment_technical);
                
                ArrayList<mResponseMessage> responseMessageList = detailsProvider.GetResponseMessageList(id, department_id);
                request.setAttribute("responseMessageList_2", responseMessageList);
            }
            else if (department_id == 3){
                mFormDepartment formDepartment_soundAndLight = detailsProvider.GetFormDetails_SoundAndLight(id);
                request.setAttribute("formDepartment_soundAndLight", formDepartment_soundAndLight);
                    
                ArrayList<mResponseMessage> responseMessageList = detailsProvider.GetResponseMessageList(id, department_id);
                request.setAttribute("responseMessageList_3", responseMessageList);
            }
            else if (department_id == 4){
                mFormDepartment formDepartment_artAndCulture = detailsProvider.GetFormDetails_ArtAndCulture(id);
                request.setAttribute("formDepartment_artAndCulture", formDepartment_artAndCulture);
                
                ArrayList<mResponseMessage> responseMessageList = detailsProvider.GetResponseMessageList(id, department_id);
                request.setAttribute("responseMessageList_4", responseMessageList);
            }
            else if (department_id == 5){
                mFormDepartment formDepartment_secuity = detailsProvider.GetFormDetails_Security(id);
                request.setAttribute("formDepartment_secuity", formDepartment_secuity);
                
                ArrayList<mResponseMessage> responseMessageList = detailsProvider.GetResponseMessageList(id, department_id);
                request.setAttribute("responseMessageList_5", responseMessageList);
            }
            else if (department_id == 6){
                mFormDepartment formDepartment_IT = detailsProvider.GetFormDetails_IT(id);
                request.setAttribute("formDepartment_IT", formDepartment_IT);
                
                ArrayList<mResponseMessage> responseMessageList = detailsProvider.GetResponseMessageList(id, department_id);
                request.setAttribute("responseMessageList_6", responseMessageList);
            }  
            userPath = "/Details";
            
            
        }


        String url = "/WEB-INF/View/Web" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String userPath = request.getServletPath();
        mUser userProfile = userProfileFunctions.GetUserProfile(request);
       
        if (userPath.equals("/Department")) {
            userPath += "/List";
            
            
        }  else if (userPath.equals("/Department/Details")) {
            
        }


        String url = "/WEB-INF/View/Web" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
