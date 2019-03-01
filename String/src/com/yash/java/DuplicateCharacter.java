package com.yash.java;

public class DuplicateCharacter {
	private String word;
	
	public String getword() {
		return word;
	}
	public void setword(String word) {
		this.word = word;
	}
	
	public String findDuplicateCharacter(){
	    String string = "abcabdabc";
	    int distinct = 0 ;

	    for (int i = 0; i < string.length(); i++) {

	        for (int j = 0; j < string.length(); j++) {

	            if(string.charAt(i)==string.charAt(j))
	            {
	                distinct++;
	              //  System.out.println(string.charAt(i));

	            }
	        }   
	        System.out.println(string.charAt(i)+"--"+distinct);
	        String d=String.valueOf(string.charAt(i)).trim();
	        string = string.replaceAll(d,"");
	        distinct = 0;

	    }
		return string;

	}
}
