package com.practice.collection;

import java.util.Arrays;
import java.util.List;

import com.practice.lambda.Employee;

public class Iteration {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee(1, "Anudeep Kumar", "donthu", "Bangalore"),
				new Employee(2, "Uma", "Akurathi", "Bangalore"), new Employee(3, "Dileep", "Kodali", "Hyderabad"),
				new Employee(4, "Dinesh", "Kodali", "Bangalore"));

		// Helps in parallel execution of the task similar to multithreading
		employeeList.forEach(p -> System.out.println(p.hashCode()));

	}

}
