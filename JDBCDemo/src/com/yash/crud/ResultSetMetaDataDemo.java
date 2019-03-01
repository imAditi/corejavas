package com.yash.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

import java.sql.ResultSetMetaData;


public class ResultSetMetaDataDemo {
	
public static Logger logger = Logger.getLogger(ResultSetMetaDataDemo.class);

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
	ResultSetMetaData rsmd = rs.getMetaData();
	System.out.println("column count : "+rsmd.getColumnCount());
	System.out.println("first column name : "+rsmd.getColumnName(1));
	System.out.println("first column type : "+rsmd.getColumnType(1));
	System.out.println("table name : "+rsmd.getTableName(1));
	
	
	}
}
