/**
 * Prog : Creation of String object.
 * Author : Aditi Jain
 * Date : 10-09-2018
 * Desc : Create showDocumentInformation() method that should return string values.
*/
package com.yash.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.yash.java.Document;
public class DocumentTest {
	@Test
	public void testShowDocumentInformation () {
		Document document = new Document();
		document.setTitle("core java basics");
		document.setFilepath("c:/document/corejava/basics/introduction.pdf");
		assertEquals("{title:core java basics,filepath:c:/document/corejava/basics/introduction.pdf}", document.showDocumentInformation()
				);
		
	}

}
