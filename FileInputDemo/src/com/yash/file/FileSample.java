package com.yash.file;

 import java.io.*;
  public class FileSample {
  public static void main(String[] args) {
 
	  new InputStream() {
		
		@Override
		public int read() throws IOException {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	  
	  Console c = System.console();
  String u = c.readLine("%s", "username: ");
  System.out.println("hello " + u);
  char[] pw;
 if(c != null && (pw = c.readPassword("%s", "password: ")) != null) {
 
 }
 }
  }
