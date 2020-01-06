package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.lambda.Employee;

public class StreamPactive1 {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee(1, "Anudeep Kumar", "donthu", "Bangalore"),
				new Employee(2, "Uma", "Akurathi", "Bangalore"), new Employee(3, "Dileep", "Kodali", "Hyderabad"),
				new Employee(4, "Dinesh", "Kodali", "Bangalore"));

		List<Employee> filteredList = employeeList.parallelStream().filter(e -> e.getEmployeeId() == 2)
				.collect(Collectors.toList());
		System.out.println(filteredList);
		List<Integer> data =  Arrays.asList(1,2,3,4,5,6);
		List<Integer> mappedData=data.stream()
			.map(e->e*2).collect(Collectors.toList());
		System.out.println(mappedData);
		
		
		List<Integer> changedEmployeeData=employeeList.stream()
				.map(e->e.getEmployeeId()+1000).collect(Collectors.toList());
			System.out.println(mappedData);
		System.out.println(changedEmployeeData);
	}

}
