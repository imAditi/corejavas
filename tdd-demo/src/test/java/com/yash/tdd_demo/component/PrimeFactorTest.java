package com.yash.tdd_demo.component;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class PrimeFactorTest {
	
	@Test
	public void testComputeFactorFor_Given1AsNumber_ShouldReturnEmptyList() throws Exception {
		List<Integer> list = PrimeFactor.ComputeFactorFor(1);
		assertEquals(Collections.emptyList(), list);
	}
	
	@Test
	public void testComputeFactorFor_Given2AsNumber_ShouldReturn2AsPrimeNumber() throws Exception {
		List<Integer> list = PrimeFactor.ComputeFactorFor(2);
		assertEquals(Arrays.asList(2), list);
	}
	
	@Test
	public void testComputeFactorFor_Given3AsNumber_ShouldReturn3AsPrimeNumber() throws Exception {
		List<Integer> list = PrimeFactor.ComputeFactorFor(3);
		assertEquals(Arrays.asList(3), list);
	}
	
	@Test
	public void testComputeFactorFor_Given4AsNumber_ShouldReturn2Times2AsPrimeNumber() throws Exception {
		List<Integer> list = PrimeFactor.ComputeFactorFor(4);
		assertEquals(Arrays.asList(2,2), list);
	}
	
	@Test
	public void testComputeFactorFor_Given5AsNumber_ShouldReturn5AsPrimeNumber() throws Exception {
		List<Integer> list = PrimeFactor.ComputeFactorFor(5);
		assertEquals(Arrays.asList(5), list);
	}
	
	@Test
	public void testComputeFactorFor_Given6AsNumber_ShouldReturn2And3AsPrimeNumber() throws Exception {
		List<Integer> list = PrimeFactor.ComputeFactorFor(6);
		assertEquals(Arrays.asList(2,3), list);
	}
	
	@Test
	public void testComputeFactorFor_Given7AsNumber_ShouldReturn7AsPrimeNumber() throws Exception {
		List<Integer> list = PrimeFactor.ComputeFactorFor(7);
		assertEquals(Arrays.asList(7), list);
	}
	
	@Test
	public void testComputeFactorFor_Given8AsNumber_ShouldReturn3Times2AsPrimeNumber() throws Exception {
		List<Integer> list = PrimeFactor.ComputeFactorFor(8);
		assertEquals(Arrays.asList(2, 2, 2), list);
	}
	
	@Test
	public void testComputeFactorFor_Given9AsNumber_ShouldReturn2Times3AsPrimeNumber() throws Exception {
		List<Integer> list = PrimeFactor.ComputeFactorFor(9);
		assertEquals(Arrays.asList(3,3), list);
	}
}
