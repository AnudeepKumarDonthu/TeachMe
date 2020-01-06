package com.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LamdaOpration {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee(1, "Anudeep Kumar", "donthu", "Bangalore"),
				new Employee(2, "Uma", "Akurathi", "Bangalore"), new Employee(3, "Dileep", "Kodali", "Hyderabad"),
				new Employee(4, "Dinesh", "Kodali", "Bangalore"));

		performOperation(employeeList, p -> true, p -> System.out.println(p));
		System.out.println("---------------------");
		performOperation(employeeList, p -> p.getFirstName().startsWith("U"), p -> System.out.println(p));
		performOperation(employeeList, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p.getEmployeeId()));
	}

	public static void performOperation(List<Employee> employeeList, Predicate<Employee> predicate,
			Consumer<Employee> consumer) {
		for(Employee e:employeeList) {
			if(predicate.test(e)) {
				consumer.accept(e);
			}
		}
	}

}
