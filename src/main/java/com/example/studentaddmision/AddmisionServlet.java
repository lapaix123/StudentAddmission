package com.example.studentaddmision;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/AddmisionServlet")
public class AddmisionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String fullname= req.getParameter("fullname");
            String email=req.getParameter("email");
            String nid=req.getParameter("nid");
            String date=req.getParameter("date");
            String gender=req.getParameter("gender");
            String mothername=req.getParameter("mothername");
            String fathername=req.getParameter("fathername");
            String address=req.getParameter("address");
            String religion=req.getParameter("religion");
            String highschool=req.getParameter("highschool");

            req.setAttribute("fullname",fullname);
        req.setAttribute("email",email);
        req.setAttribute("nid",nid);
        req.setAttribute("date",date);
        req.setAttribute("gender",gender);
        req.setAttribute("mothername",mothername);
        req.setAttribute("fathername",fathername);
        req.setAttribute("address",address);
        req.setAttribute("religion",religion);
        req.setAttribute("highschool",highschool);



            req.getRequestDispatcher("Display.jsp").forward(req,resp);


    }
}
