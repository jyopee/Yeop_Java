package com.yedam.java.c0604;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	int sum2(int... values) { // 값만 주면 자동 배열 생성
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;

	}

}
