package com.yash.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.yash.java.NumberToString;
	public class NumberToStringTest {
		@Test
		public void numberReturnTheStringOutput() {
			NumberToString numbertostring = new NumberToString();
			numbertostring.setNumber(5.4);
			System.out.println(numbertostring.numberOutputInString());
			
		}

	}
