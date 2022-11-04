package homewokr;

public class First_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 안녕하세요

		int num1 = 37;
		int num2 = 91;

		System.out.printf("변수명1 :%d , 변수명2 :%d", num1, num2);
		System.out.println("\n--------------------------------------------");

		// 2. 만나서 반가워요

		int add;
		int min;
		int mult;
		int div;

		add = num1 + num2;
		min = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		System.out.println();
		System.out.printf("num1+num2 =%d\nnum1-num2 =%d\nnum1*num2 =%d\nnum1/num2 =%d", add, min, mult, div);
		System.out.println();
		System.out.println("--------------------------------------------");

		// 3. 제이름은 정재엽 이라고 합니다.
		int var1 = 128;
		String var2 = "B";
		int var3 = 440302;
		long var4 = 100000000000L;
		double var5 = 43.93106;
		double var6 = 301.3;

		System.out.printf("var1 : %d int\n", var1);
		System.out.printf("var2 : %s String\n", var2);
		System.out.printf("var3 : %d int\n", var3);
		System.out.printf("var4 : %d long \n", var4);
		System.out.printf("var5 : %.5f double \n", var5);
		System.out.printf("var6 : %.1f double \n", var6);
		System.out.println("--------------------------------------------");

		// 4. 앞으로 잘부탁드려요 ㅎㅎ
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;

		long result1 = a + c + d;
		System.out.println(result1);

		int result2 = a + b + c;
		System.out.println(result2);

		double e = 45.31;
		double result3 = c + d + e;
		System.out.println(result3);
		System.out.println("--------------------------------------------");

		// 5.그럼 20000
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";

		// 출력예시) A278번지10.0

		System.out.printf("%s%d%d%s" + "%.1f", charValue, (intValue1 + intValue2), intValue3, strValue,
				(float) intValue4);
		System.out.println("\n--------------------------------------------");

		/*
		 * 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 예시) 373 일 경우 3 + 7 + 3 = 13 으로
		 * 결과는 13입니다. 힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요.
		 */
		int value = 485;

		int hund = value / 100;
		int ten = value % 100 / 10;
		int one = value % 100 % 10;

		System.out.printf(value + "의 각자리 합은 %d+%d+%d = %d 입니다.", hund, ten, one, (hund + ten + one));

	}

}
