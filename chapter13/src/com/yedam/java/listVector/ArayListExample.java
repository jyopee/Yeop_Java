package com.yedam.java.listVector;

import java.util.ArrayList;
import java.util.List;

public class ArayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list = new ArrayList<String>();
		
		List<String> list2 = new ArrayList<>();
		list.add("Java"); //리스트는 값을 넣은만큼 크기 정해짐
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"DataBase");
		list.add("iBATIS");
		
		
		
		int size =list.size();   //배열 LIST.LENGTH()
		System.out.println("총 객체수 : "+size);
		System.out.println();
		
		String skill = list.get(2);  //skill = list[2]
		System.out.println("2 :"+skill +"\n"); //0~
		
		for (int i=0; i<list.size(); i++) {
			String str =list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove("iBATIS");
		
		for (int i=0; i<list.size(); i++) {
			String str =list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println();
	}

}
