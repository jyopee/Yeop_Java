package com.yedam.java.c0504;

public class Check01 {

	public static void main(String[] args) {
		// 1) 주어진 배열의 총합과 평균을 구하세요
		// 2) 최댓값 최솟값
		int[] array = { 10, 53, 26, 85, 75 };
		int sum = 0;
		int max = array[0];
		int min = array[0];
		int minindex = 0;
		int maxindex = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] > max) {
				max = array[i];
				maxindex=i;
			}
			if (min > array[i]) {
				min = array[i];
				minindex=i;
			}
			
			
		}
		double avg = sum / array.length;
		System.out.printf("총합 : %d 평균 : %.2f\n", sum, avg);

		System.out.printf("최댓값 :%d ,최솟값 :%d\n", max, min);
		System.out.println("최댓값의 인댁스 값은 :"+maxindex);
		System.out.println("최솟값의 인댁스 값은 :"+minindex);

	}

}
