package com.practice.generics;

class GenericClass {

	public static <X,Y> void performOperation(X o1,Y o2) {
		System.out.println(o1 + " || " + o2);
	}
}

public class GenericTest {

	public static void main(String[] args) {
		GenericClass.performOperation(1,2);
		
		GenericClass.performOperation("anudeep","kumar");
		
		GenericClass.performOperation(1.1f,1.2f);
	}

}
