package com.yedam.java.c0502;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// 배열을 선언

//		 int[] intAry = null;
//		 System.out.println("intAry[0]"+intAry[0]);
//		 
		 int [] scores = {83,90,97};
		 
		 System.out.println("scores[0] =" +scores[0]);
		 System.out.println("scores[1] =" +scores[1]);
		 System.out.println("scores[2] =" +scores[2]);
		 
		 
		 int sum=0;
		 for(int i=0; i<scores.length; i++) {
			 System.out.println(scores[i]);
			 sum+=scores[i];
		 }System.out.println("총랍: "+sum);
		 double avg =sum/3.0;
		 System.out.println("평균: "+avg); 
		 
		 //주의 사항
		 int[] scoreList =null;
		 scoreList =new int[] {83,90,87};
		 sum =0;
		 for(int i=0; i<3; i++) {
			 sum =sum+ scoreList[i];
		 }System.out.println(sum);
		 
		 int [] array =new int [3];
		 for(int i=0; i<3; i++) {
			 System.out.println("array["+i+"] : "+array[i] );
		 }
		 String[] strAry = new String[4];
		 for(int i=0; i<strAry.length; i++) {
			 strAry[i] =String.valueOf(i);
			 }
		 
				/* for(int i=0; i<strAry.length) */
		 
		 

		
	
		 
		 
		 
	}

	static int add(int[] numList) {
		return 0;
	}

}
