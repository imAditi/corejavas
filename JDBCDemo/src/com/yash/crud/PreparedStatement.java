package com.yash.crud;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;


public class PreparedStatement {
	
public static Logger logger = Logger.getLogger(PreparedStatement.class);

public static void main(String[] args) throws Exception {
	
	String driverClassName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/mydb";
	String user = "root";
	String pwd = "root";
	
	Class c = Class.forName(driverClassName);
	c.newInstance();
	
	logger.info("class : -"+c);
	
	Connection con = DriverManager.getConnection(url,user,pwd);
	logger.info("con : -"+c);
	
	//Statement stmt = con.createStatement();
	String sql = "insert into contact(name,phone) values(?,?)";
	java.sql.PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, "Rod's");
	pstmt.setString(2, "7689067899");
	pstmt.execute();
	//stmt.executeUpdate(sql);
	
	//logger.info(stmt);
	logger.info("record has been inserted successfully...check DB");
	
	pstmt.close();
	con.close();
	}
}
