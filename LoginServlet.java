package com.parking.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("admin".equals(username) && "admin".equals(password)) {

            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            response.sendRedirect("dashboard.jsp");

        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
