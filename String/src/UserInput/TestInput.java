package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

 public class TestInput {
	
	
	public void inputScannerClass() {
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the employee id");
		employee.setEmployeeId(scanner.nextInt());
		System.out.println("Enter the employee name");
		employee.setEmployeeName(scanner.next());
		System.out.println("Enter the employee salary");
		employee.setEmployeeSalary(scanner.nextInt());
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeSalary());
	}
	
	public void inputJOptionPane() {
		Employee employee = new Employee();
		String employeeId = JOptionPane.showInputDialog("Enter the employee id");
		employee.setEmployeeId(Integer.parseInt(employeeId));
		String employeeName = JOptionPane.showInputDialog("Enter the employee name");
		String employeeSalary = JOptionPane.showInputDialog("Enter the employee salary");
		employee.setEmployeeSalary(Integer.parseInt(employeeSalary));
	}

	public void inputCommandPrompt(String args[]) {
		Employee employee = new Employee();
		System.out.println("-----cmd output-------");
		employee.setEmployeeId(Integer.parseInt(args[0]));
		System.out.println("Enter the employee id"+employee.getEmployeeId());
		employee.setEmployeeName(args[1]);
		System.out.println("Enter the employee name"+employee.getEmployeeName());
		employee.setEmployeeSalary(Integer.parseInt(args[2]));
		System.out.println("Enter the employee salary"+employee.getEmployeeSalary());
	}
	
	public void inputBufferedReader() throws IOException {
		Employee employee = new Employee();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the employee id" +employee.getEmployeeId());
		employee.setEmployeeId(Integer.parseInt(reader.readLine()));
		System.out.println("Enter the employee name"  +employee.getEmployeeName());
		employee.setEmployeeName(reader.readLine());
		System.out.println("Enter the employee salary"+employee.getEmployeeSalary());
		employee.setEmployeeSalary(Integer.parseInt(reader.readLine()));
		
	}
 }


