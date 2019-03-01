package com.yash.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.yash.java.StringDemo;
	public class StringDemoTest {
		@Test
		public void getTheRequiredData() {
			String result = "Java is a language";
			StringDemo stringdemo = new StringDemo();
			
			assertEquals("Java is a language", stringdemo.getRequiredData(result));
		}

	}
