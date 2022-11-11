package homework4;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
				int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

				int index = 0;
				// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
				for (int i = 0; i < arr1.length; i++) {
					if (arr1[i] == 60) {
						index = i;
					}
				}
				System.out.println(index);

				System.out.println("================================");

				// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
				for (int i = 0; i < arr1.length; i++) {
					if (i == 3) {
						continue;
					}
					System.out.println(arr1[i]);
				}

				// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
				// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}

				Scanner input = new Scanner(System.in);
				System.out.print("변경하고 싶은 위치를 입력하세요 :");
				int num = input.nextInt();
				int change;
				
				for (int i = 0; i < arr1.length; i++) {
					if(i == num) {
						change = arr1[i];
						arr1[i] = 1000;
					}
					System.out.println(arr1[i]);
				} 
				
				
				System.out.println("================================");

				// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
				
				int max =arr1[0];
				int min =arr1[0];
				
			for (int i = 0; i < arr1.length; i++) {
					if(arr1[i] > max ) {
						max = arr1[i];
					}
					
					if(arr1[i] < min ) {
						min = arr1[i];
					}
				}
				
				System.out.printf("최댓값은 : %d ,최솟값은 : %d",max,min);
					
				
				
				System.out.println("====================================");
				// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.

				int Arr1[] = new int[10];

				for (int i = 0; i < 10; i++) {
					System.out.println("배열안에 숫자를 입력하세요 :");
					int Num = input.nextInt();
					Arr1[i] = Num;
				}

				for (int j = 0; j < Arr1.length; j++) {
					if (Arr1[j] % 3 == 0) {
						System.out.println(Arr1[j]);
					}
				}
	}

}
