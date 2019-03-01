package com.yash.java;

public class Document {

	private String title;
	private String filepath;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	public String showDocumentInformation() {
		return "{title:core java basics,filepath:c:/document/corejava/basics/introduction.pdf}";
	}
	
	}
