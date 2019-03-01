package com.yash.tdd_demo.component;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void testAnswerFor_Given1AsANumber_Returns1AsAString() throws Exception {
		String result = FizzBuzz.getAnswerFor(1);
		assertThat(result, is("1"));
	}
	
	@Test
	public void testAnswerFor_Given2AsANumber_Returns2AsAString() throws Exception {
		String result = FizzBuzz.getAnswerFor(2);
		assertThat(result, is("2"));
	}
	
	@Test
	public void testAnswerFor_Given3AsANumber_ReturnsFizz() throws Exception {
		String result = FizzBuzz.getAnswerFor(3);
		assertThat(result, is("Fizz"));
	}
	
	@Test
	public void testAnswerFor_Given4AsANumber_Returns4AsANumber() throws Exception {
		String result = FizzBuzz.getAnswerFor(4);
		assertThat(result, is("4"));
	}
	
	@Test
	public void testAnswerFor_Given5AsANumber_ReturnsBuzz() throws Exception {
		String result = FizzBuzz.getAnswerFor(5);
		assertThat(result, is("Buzz"));
	}
	
	@Test
	public void testAnswerFor_Given6AsANumber_ReturnsFizz() throws Exception {
		String result = FizzBuzz.getAnswerFor(6);
		assertThat(result, is("Fizz"));
	}
	
	@Test
	public void testAnswerFor_Given7AsANumber_Returns7AsAString() throws Exception {
		String result = FizzBuzz.getAnswerFor(7);
		assertThat(result, is("7"));
	}
	
	@Test
	public void testAnswerFor_Given8AsANumber_Returns8AsAString() throws Exception {
		String result = FizzBuzz.getAnswerFor(8);
		assertThat(result, is("8"));
	}
	
	@Test
	public void testAnswerFor_Given9AsANumber_ReturnsFizz() throws Exception {
		String result = FizzBuzz.getAnswerFor(9);
		assertThat(result, is("Fizz"));
	}
	
	@Test
	public void testAnswerFor_Given10AsANumber_ReturnsBuzz() throws Exception {
		String result = FizzBuzz.getAnswerFor(10);
		assertThat(result, is("Buzz"));
	}
	
	@Test
	public void testAnswerFor_Given11AsANumber_Returns11AsAString() throws Exception {
		String result = FizzBuzz.getAnswerFor(11);
		assertThat(result, is("11"));
	}
	
	@Test
	public void testAnswerFor_Given15AsANumber_ReturnsFizzBuzz() throws Exception {
		String result = FizzBuzz.getAnswerFor(15);
		assertThat(result, is("FizzBuzz"));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAnswerFor_Given0AsANumber_ReturnsIllegalArgumentException() throws Exception {
		String result = FizzBuzz.getAnswerFor(0);
		
	}
} 

