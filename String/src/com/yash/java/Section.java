package com.yash.java;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Section {
	
    int id;
	String name;
    Date createdDate;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	
	public String name() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getcreatedDate() {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpledateformat = new SimpleDateFormat(pattern);
		String date = simpledateformat.format(this.createdDate);
		return date;
	}
	public void setcreatedDate(int year, int month, int date) {
		this.createdDate = new Date(year - 1900, month - 1, date);
		this.createdDate = createdDate;
	}
	
	public String showSectionDetail() {
		return "{id :"+ this.getid()+", name : "+ this.getname()+", createdDate: "+ this.getcreatedDate()+"}";
	}
	
	public String getname() {
		
		return name;
	}
	 
}

