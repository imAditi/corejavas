package com.yash.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;


public class ReadRecordDemo {
	
public static Logger logger = Logger.getLogger(ReadRecordDemo.class);

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
	String sql = "select *from contact";
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()) {
		String name = rs.getString("name");
		String phone = rs.getString("phone");
		System.out.println(name+"--"+phone);
	}
	
	}
}
