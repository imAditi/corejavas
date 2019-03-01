package com.yash.crud;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

import java.sql.ResultSetMetaData;


public class DatabaseMetaDataDemo {
	
public static Logger logger = Logger.getLogger(DatabaseMetaDataDemo.class);
public static void main(String[] args) throws Exception {
	
	String driverClassName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/mydb";
	String user = "root";
	String pwd = "root";
	
	Class c = Class.forName(driverClassName);
	c.newInstance();
	
	logger.info("class : -"+c);
	
	Connection con = DriverManager.getConnection(url,user,pwd);
	
	DatabaseMetaData dbmd = con.getMetaData();
	System.out.println("Vendor name " +dbmd.getDatabaseProductName());
	System.out.println("Version " +dbmd.getDatabaseMajorVersion());
	System.out.println("Driver " +dbmd.getDriverName());
	System.out.println("URL " +dbmd.getURL());
	logger.info("record has been inserted successfully...check DB");
	//dbmd.close();
	con.close();
}
}