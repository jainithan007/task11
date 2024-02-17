package com.examplehrtes;

   import com.example.hr.Employee;

	public class EmployeeTest {
		
		
	    public static void main(String[] args) {
	        Employee employee = new Employee("John Doe", 123456, 50000.0);
	        employee.printName();
	        employee.printSalary();
	    }
	}

