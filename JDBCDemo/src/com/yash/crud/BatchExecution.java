package com.yash.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.log4j.Logger;


public class BatchExecution {
	
public static Logger logger = Logger.getLogger(BatchExecution.class);

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
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, "Rod's");
	pstmt.setString(2, "7689067899");
	pstmt.addBatch();
	
	pstmt.setString(1, "Raj");
	pstmt.setString(2, "7879889778");
	pstmt.addBatch();
	pstmt.executeBatch();
	//stmt.executeUpdate(sql);
	
	//logger.info(stmt);
	logger.info("record has been inserted successfully...check DB");
	
	pstmt.close();
	con.close();
	}
}