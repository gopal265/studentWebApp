package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.model.Student;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out  =  response.getWriter();
		String  emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		
		System.out.println(emailId + " "+ password);
		
		out.print("<html>");
		if(emailId.equalsIgnoreCase("Admin") && password.equals("ADMIN")){
			
			RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage");
			rd.forward(request, response);
		}
		else{
			StudentDAO  stdDAO  =  new StudentDAO();
			Student student =  stdDAO.studentLogin(emailId, password);
			
			if(student != null){
				
				RequestDispatcher rd = request.getRequestDispatcher("StudentHomePage");
				rd.forward(request, response);
			}
			
			else{
				out.print("<body bgcolor=violet text = red>");
				out.print("<center>");
				out.print("<h1>Invalid Credentials </h1>");
				out.print("</center>");
				out.print("</body>");
				out.print("</html>");
				
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
			
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
