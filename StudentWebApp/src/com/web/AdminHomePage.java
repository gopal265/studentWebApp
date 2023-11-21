package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminHomePage")
public class AdminHomePage extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String emailId = request.getParameter("emailId");
		
		out.print("<body bgcolor=lightyellow text=blue>");
		out.print("<h3>Welcome " + emailId + "!</h3>");
		out.print("<center>");
		
		out.print("<h1>Welcome to Admin HomePage </h1>");
		
		out.print("</center></body>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
