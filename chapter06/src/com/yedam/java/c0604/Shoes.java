package com.yedam.java.c0604;

public class Shoes {

	static int totalCount;
	int running;
	int slipper;
	int mule;

	void makerunning() {
		running+=1;
	}

	void makeslipper() {
		slipper+=1;
	}

	void makermule() {
		mule+=1;
	}
	
	void getCount() {
		totalCount=running+slipper+mule;
		System.out.println(totalCount);
	}

}
