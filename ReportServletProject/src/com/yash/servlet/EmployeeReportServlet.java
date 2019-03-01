package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			Class c = Class.forName(driverClassName);
			c.newInstance();
		
			String url = "jdbc:mysql://localhost:3306/empdb";
			Connection con = DriverManager.getConnection(url,"root","root");
			String sql = "select * from emp";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			out.println("<html>");
			out.println("<head><title>Employee Report</title></head>");
			out.println("<body>");
			out.println("<table border = '1'>");
			out.println("<tr>");
			out.println("<td>id</td>");
			out.println("<td>name</td>");
			out.println("<td>salary</td>");
			out.println("</tr>");
			while(rs!=null && rs.next()) {
				out.println("<tr>");
				out.println("<td>"+rs.getInt("id")+"</td>");
				out.println("<td>"+rs.getString("name")+"</td>");
				out.println("<td>"+rs.getFloat("salary")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			out.close();
		}
		
	}

}
