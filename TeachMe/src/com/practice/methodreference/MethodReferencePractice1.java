package com.practice.methodreference;

public class MethodReferencePractice1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(MethodReferencePractice1::printMessage);
		Thread t2 = new Thread(MethodReferencePractice1::printMessage);
		Thread t3 = new Thread(MethodReferencePractice1::printMessage);
		t1.start();
		t2.start();
		t3.start();

	}

	public static void printMessage() {
		System.out.println("I am from");
	}

}
