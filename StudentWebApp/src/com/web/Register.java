package com.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String branch = request.getParameter("branch");
		int year = Integer.parseInt(request.getParameter("year"));
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		
		System.out.println(firstName + lastName + age + gender + branch + year + emailId + password);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
