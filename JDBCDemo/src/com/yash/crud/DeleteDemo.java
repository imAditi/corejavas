package com.yash.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;


public class DeleteDemo {
	
public static Logger logger = Logger.getLogger(DeleteDemo.class);

public static void main(String[] args) throws Exception {
	
	String driverClassName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/mydb";
	String user = "root";
	String pwd = "root";
	
	Class c = Class.forName(driverClassName);
	c.newInstance();
	
	logger.info("class : -"+c);
	
	Connection con = DriverManager.getConnection(url,user,pwd);
	
	Statement stmt = con.createStatement();
	String sql = "Delete from contact where id = '2'";
	stmt.executeUpdate(sql);
	
	logger.info(stmt);
	logger.info("record has been inserted successfully...check DB");
	
	stmt.close();
	con.close();
	}
}