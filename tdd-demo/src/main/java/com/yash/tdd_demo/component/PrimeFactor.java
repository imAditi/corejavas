package com.yash.tdd_demo.component;

import java.util.List;

public class PrimeFactor {


	public static List<Integer> ComputeFactorFor(int number) { 
		List<Integer> factors = new java.util.ArrayList();
			for(int candidate = 2; number>1; candidate++) { 
			for(;number % candidate == 0; number  /= candidate) {  
			factors.add(candidate); 
			}
			}
			return factors;
}
}

