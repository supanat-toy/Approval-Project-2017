/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Controller;
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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author supanattechasothon
 */
@WebServlet(name="AdminDirector", 
            loadOnStartup = 1,
            urlPatterns = { "/AdminDirector", 
                            "/AdminDirector/Details",
                            "/AdminDirector/Status"
})
public class AdminDirectorServlet extends HttpServlet {

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
       
        if (userPath.equals("/AdminDirector")) {
            userPath = "/List";
            List<mFormDisplay> formDisplayList = listProvider.getFormsAdmin();
            request.setAttribute("formDisplayList", formDisplayList);
            
        } else if (userPath.equals("/AdminDirector/Details")) {
            int id = Integer.parseInt(request.getParameter("id"));
            
            mForm formDetails = detailsProvider.getFormDetails(id);
            mFormDepartment formDepartment_artAndCulture = detailsProvider.GetFormDetails_ArtAndCulture(id);
            mFormDepartment formDepartment_IT = detailsProvider.GetFormDetails_IT(id);
            mFormDepartment formDepartment_properties = detailsProvider.GetFormDetails_Properties(id);
            mFormDepartment formDepartment_secuity = detailsProvider.GetFormDetails_Security(id);
            mFormDepartment formDepartment_soundAndLight = detailsProvider.GetFormDetails_SoundAndLight(id);
            mFormDepartment formDepartment_technical = detailsProvider.GetFormDetails_Technical(id);
            
            request.setAttribute("formDetails", formDetails);
            request.setAttribute("formDepartment_artAndCulture", formDepartment_artAndCulture);
            request.setAttribute("formDepartment_IT", formDepartment_IT);
            request.setAttribute("formDepartment_properties", formDepartment_properties);
            request.setAttribute("formDepartment_secuity", formDepartment_secuity);
            request.setAttribute("formDepartment_soundAndLight", formDepartment_soundAndLight);
            request.setAttribute("formDepartment_technical", formDepartment_technical);
            
            
            ArrayList<mResponseMessage> responseMessageList = detailsProvider.GetResponseMessageList(id, 1);
            request.setAttribute("responseMessageList_1", responseMessageList);
            responseMessageList = detailsProvider.GetResponseMessageList(id, 2);
            request.setAttribute("responseMessageList_2", responseMessageList);
            responseMessageList = detailsProvider.GetResponseMessageList(id, 3);
            request.setAttribute("responseMessageList_3", responseMessageList);
            responseMessageList = detailsProvider.GetResponseMessageList(id, 4);
            request.setAttribute("responseMessageList_4", responseMessageList);
            responseMessageList = detailsProvider.GetResponseMessageList(id, 5);
            request.setAttribute("responseMessageList_5", responseMessageList);
            responseMessageList = detailsProvider.GetResponseMessageList(id, 6);
            request.setAttribute("responseMessageList_6", responseMessageList);
            
            userPath = "/Details";
        }
        else if (userPath.equals("/AdminDirector/Status")){
            int id = Integer.parseInt(request.getParameter("id"));
            Boolean isApprove = Boolean.valueOf(request.getParameter("isApprove"));
            
            DetailsProvider detailsProvider = new DetailsProvider();
            try {
                mResult result = detailsProvider.ApprovedForm(userProfile.getUser_id(), userProfile.getResponsible_form_type_id(), id, isApprove);
            } catch (SQLException ex) {
                Logger.getLogger(AdminDirectorServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            response.sendRedirect(request.getContextPath() + "/AdminDirector");
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
       
        if (userPath.equals("/AdminDirector")) {
            userPath += "/List";
            
            
        } else if (userPath.equals("/AdminDirector/Details")) {
            
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
