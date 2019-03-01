package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeRegistrationServlet")
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	try {
		String employeeName = request.getParameter("name");
		String employeeContact = request.getParameter("contact");
		String employeeEmail = request.getParameter("email");
		String employeeSalary = request.getParameter("salary");
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Employee servlet output</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Thank you for registration</h1>");
		out.println("<h2>Name: "+employeeName+"</h2>");
		out.println("<h2>Contact: "+employeeContact+"</h2>");
		out.println("<h2>Email: "+employeeEmail+"</h2>");
		out.println("<h2>Salary: "+employeeSalary+"</h2>");
		out.println("</body>");
		out.println("</html>");
	}catch(Exception ex) {
		ex.printStackTrace();
	}finally {
		out.close();
	}
	}


	

}
