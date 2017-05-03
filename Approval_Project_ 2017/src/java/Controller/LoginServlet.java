/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;


import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import Functions.*;
import Models.*;
import Providers.*;
import java.util.ArrayList;
import java.util.List;



@WebServlet(name = "LoginServlet", 
        loadOnStartup = 1,
        urlPatterns = {""})
public class LoginServlet extends HttpServlet {

    LoginProvider loginProvider = new LoginProvider();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "index.jsp";
        
        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");

//        try {
//            String idToken = request.getParameter("id_token");
//            GoogleIdToken.Payload payLoad = IdTokenVerifierAndParser.getPayload(idToken);
//            String name = (String) payLoad.get("name");
//            String email = payLoad.getEmail();
//            System.out.println("User name: " + name);
//            System.out.println("User email: " + email);
//
//            HttpSession session = request.getSession(true);
//            session.setAttribute("userName", name);
//            request.getServletContext()
//               .getRequestDispatcher("/welcome-page.jsp").forward(request, response);
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        
//        String url = "index.jsp";
//        
//        try {
//            request.getRequestDispatcher(url).forward(request, response);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
