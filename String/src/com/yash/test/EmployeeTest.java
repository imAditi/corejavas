package com.yash.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.yash.java.Employee;
	public class EmployeeTest {
		@Test
		public void generateThePassword() {
			Employee employee = new Employee();
			employee.setfirstName("Aditi");
			employee.setlastName("Jain");
			employee.setcompany("Yash");
			employee.setrole("Trainee");
			
			assertEquals("AdJaYaTr",employee.generatePassword());
		}

	}
