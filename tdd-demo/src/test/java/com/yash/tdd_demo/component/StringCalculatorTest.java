package com.yash.tdd_demo.component;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private static final String STRING_VALUE_INPUT_AS_STRING = "23";
	private static final int RESULT = 23;
	private StringCalculator stringcalculator;
	
	@Before
	public void setUp() {
		stringcalculator = new StringCalculator();
	}

	@Test
	public void testAdd_GivenEmptyString_ReturnsOutputAsZero() throws Exception {
	int result = stringcalculator.add("");
	assertEquals(0,result);
	}

	@Test
	public void testAdd_GivenNumbersSeparatedByComma_ReturnsSumOfNumbersAsDigit() throws Exception{
	int result = stringcalculator.add("10,20,30,40");
	assertEquals(100,result);
}

}
