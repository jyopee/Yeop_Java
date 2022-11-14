package com.yedam.java.tel;

public class Television implements RemoteControl,Search{
	
	public int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolum(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨은"+volume);
		
	}

	@Override
	public void search(String URL) {
		System.out.println(URL+"을 검색합니다.");
		
	}
	
}
