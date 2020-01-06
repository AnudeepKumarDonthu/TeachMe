package com.practice.lambda;

import java.util.function.BiConsumer;

public class LamdaExceptionHanding {

	public static void main(String[] args) {
		int[] intArray = { 2, 3, 4, 6, 7 };
		int divBy = 2;
		performOperation(intArray, divBy, lamdaWrapper((k, v) -> System.out.println(k / v)));
	}

	public static void performOperation(int[] intArray, int divBy, BiConsumer<Integer, Integer> biConsumner) {
		for (int i : intArray) {
			biConsumner.accept(i, divBy);
		}
	}

	private static BiConsumer<Integer, Integer> lamdaWrapper(BiConsumer<Integer, Integer> biConsumner) {
		return (v, k) -> {
			try {
				biConsumner.accept(v, k);
			} catch (Exception e) {
				System.out.println("exception in wrapper");
			}
		};
	}

}
