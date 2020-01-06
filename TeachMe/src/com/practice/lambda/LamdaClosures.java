package com.practice.lambda;

public class LamdaClosures {

	public static void main(String[] args) {
		int a = 10+2;
		perforceProcess(a, x -> System.out.println(x));
	}

	public static void perforceProcess(int i, ClosureProcess closureProcess) {
		closureProcess.ClosureProcess(i);
	}

}

interface ClosureProcess {
	void ClosureProcess(int i);
}
