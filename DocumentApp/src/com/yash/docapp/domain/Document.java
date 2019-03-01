package com.yash.docapp.domain;

public class Document {
private int id;
private String title; 
private String description;
public Document(int id, String title, String description) {
	this.id = id;
	this.title = title;
	this.description = description;
}
public Document() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Document [id=" + id + ", title=" + title + ", description=" + description + "]";
}

}
