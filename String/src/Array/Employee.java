package Array;

import java.util.Scanner;

public class Employee {
		
	private String name;
	private String employeeId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
		public static void main(String args[]) {
			 Scanner scanner = new Scanner(System.in);
	
			 Employee employee[]=new Employee[10];
			 for(int i = 0; i < 3; i++) {
				 employee[i] = new Employee();
				 System.out.println("enter employee id:");
				 employee[i].setEmployeeId(scanner.nextLine());
				 System.out.println("enter employee name:");
				 employee[i].setName(scanner.nextLine());
			 }
			 for(int i = 0; i < 3; i++) {
		        System.out.println();
		        System.out.println("employee id:"+employee[i].getEmployeeId() + " "+ "employee name:"+employee[i].getName());
		       // System.out.println(" ");
		        //System.out.println("employee name:"+employee[i].getName());
		       
		}
		}
		}


