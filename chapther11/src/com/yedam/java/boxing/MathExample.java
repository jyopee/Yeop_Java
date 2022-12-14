package com.yedam.java.boxing;

public class MathExample {

	public static void main(String[] args) {
		//절대값

		int vr = Math.abs(-5);
		double vr2 = Math.abs(-3.14);
		
		System.out.println("v1=" +vr);
		System.out.println("v2=" +vr2);
		
		//올림

		double vr3 = Math.ceil(5.3);
		double vr4 = Math.ceil(-5.3);
		
		System.out.println("v3=" +vr3);
		System.out.println("v4=" +vr4);
		
		double vr5 = Math.floor(5.3);
		double vr6 = Math.floor(-5.3);
		
		System.out.println("v5=" +vr5);
		System.out.println("v6=" +vr6);
		

		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 ="+v7);
		System.out.println("v8 ="+v8);
		
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 ="+v9);
		System.out.println("v10 ="+v10);
		
		//랜덤
		double v11 = Math.random();
		System.out.println("v11 ="+v11);
		
		double v12 =Math.rint(5.3);
		double v13 =Math.rint(5.5);
		double v14 =Math.rint(5.7);
		
		System.out.println("v12=" +v12);
		System.out.println("v13=" +v13);
		System.out.println("v14=" +v14);
		
		double v15 =Math.round(5.5);
		double v16 =Math.round(5.7);
		
		System.out.println("v15=" +v15);
		System.out.println("v16=" +v16);
		
		int num =(int) (Math.random()*6)+1;
		System.out.println("주사위의 눈 :" +num);
		
		
		
		
		
		
	}

}
