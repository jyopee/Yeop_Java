package com.yedam.java.c0604;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator myCalc = new calculator();
		myCalc.powerOn();
		
		int sumRes=myCalc.plus(5,6);
		System.out.println("sum : "+sumRes);
		
		byte x = 10;
		byte y = 4;
		double diviRes = myCalc.divided(x,y);
		System.out.println("divid : "+diviRes);
		
		myCalc.execute();
		
		double result1 =myCalc.areaRectangle(10);
		double result2 =myCalc.areaRectangle(10,20);
		
		System.out.println(result1);
		System.out.println(result2);
		
//		myCalc.powerOff();
		
//		Computer myCom = new Computer();
//		int [] values1 = {1,2,3};
//		int intResult1 = myCom.sum1(values1);
//		System.out.println("intResult1 :"+intResult1);
//		
//		int inResult2 = myCom.sum1(new int[] {1,2,3,4,5});
//		System.out.println("intResult2 :" + inResult2);
//		
//		int intResult3 = myCom.sum2(1,2,3);
//		System.out.println("intResult3 :" + intResult3);
//		
//		int intResult4 = myCom.sum2(1,2,3,4,5);
//		System.out.println("intResult4 :" + intResult4);
	

	}

}
