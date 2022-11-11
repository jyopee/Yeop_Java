package com.yedam.java.c0604;

public class Shoesfact {

	//필드
	
	int staticTest = 0;
	
	public static void main(String[] args) {
		Shoesfact ap = new Shoesfact();
		ap.staticTest =1;
		Shoes shoes = new Shoes();
		
		shoes.makerunning();
		shoes.makeslipper();
		shoes.makermule();
		shoes.getCount();
		
//		System.out.println(Shoes.totalCount);
		
		ConstantNo csno = new ConstantNo();
		System.out.println(csno.words);
		System.out.println(csno.word);
		
		System.out.println(ConstantNo.EARTH_ROUND);
		
		
	}

}
