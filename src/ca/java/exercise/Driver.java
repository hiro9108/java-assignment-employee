package ca.java.exercise;

import java.util.ArrayList;

public class Driver {
	
	public static void printInformation(ArrayList<Employee> employees) {
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		HourlyEmployee hourlyEmployee01 = new HourlyEmployee("Smith", "Dow", "smith@amazon.com", "067 888 9999", 20.0, 2);
		HourlyEmployee hourlyEmployee02 = new HourlyEmployee("Hera", "Dor", "hera@amazon.com", "067 844 5555", 25.0, 2);
		SalesEmployee salesEmployee01 = new SalesEmployee("Row", "Doe", "row@amazon.com", "067 777 4444", 15.0, 1);
		SalesEmployee salesEmployee02 = new SalesEmployee("Line", "Doq", "line@amazon.com", "067 292 7777", 18.0, 20);
		
		employees.add(hourlyEmployee01);
		employees.add(hourlyEmployee02);
		employees.add(salesEmployee01);
		employees.add(salesEmployee02);
		
		printInformation(employees);
	}

}
