package com.yedam.java.key;

import java.util.HashMap;

public class ketExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<key, String> hashmap = new HashMap<>();

		
		// new key(1) ->1
		hashmap.put(new key(1), "홍길동");

		String value = hashmap.get(new key(1));
		System.out.println(value);

	}
}
