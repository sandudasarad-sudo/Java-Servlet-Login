package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("dasarad".equals(username) && "maha".equals(password)) {

            HttpSession session = request.getSession();

            session.setAttribute("username", username);

            response.sendRedirect("home");

        } else {

            response.setContentType("text/html");

            response.getWriter().println(
                    "<h2>Invalid Username or Password</h2>"
            );
        }
    }
}