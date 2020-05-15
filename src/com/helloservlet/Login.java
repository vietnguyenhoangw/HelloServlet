package com.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// Set response content type
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    
	    DBHelper dbHelper = new DBHelper();
		dbHelper.connect();
		User user = dbHelper.getUser("admin", "admin");
		System.out.println("log out: " + user);
	    
	    String path = req.getServletPath();
	    
	    switch (path) {
		case "/login":
			String firstName = req.getParameter("first_name");
			String lastName = req.getParameter("last_name");
			
			if (firstName.equals("admin") &&
					lastName.equals("admin")) {
				out.print("<h3>First Name: admin <br/>"
						+ "Last name: admin");
			} else {
				out.print("<h3>Check again");
			}
			break;
		case "/conditionCheck":
			out.print("<h3> Maths: " + req.getParameter("maths"));
			out.print("<h3> Maths: " + req.getParameter("physics"));
			break;
		default:
			return;
		}
	}
}
