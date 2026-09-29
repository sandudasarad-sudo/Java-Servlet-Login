package org.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        if (username.equals("admin") && password.equals("1234")) {

            out.println("<html>");
            out.println("<body>");
            out.println("<h2>Login Successful</h2>");
            out.println("<p>Welcome " + username + "</p>");
            out.println("</body>");
            out.println("</html>");

        } else {

            out.println("<html>");
            out.println("<body>");
            out.println("<h2>Login Failed</h2>");
            out.println("<p>Invalid username or password</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}