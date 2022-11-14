package com.yedam.java.key;

public class key {

	public int number;
	
	public key (int number) {
		this.number=number;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof key) {
			key comparekey = (key)obj;
			if(this.number = comparekey)
				return true;
		}
	}
}
