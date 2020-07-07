package com.kita.first.level3;

//사용자 정의 클래스
public class Tv {
	String name;// 객체 주소값
//맴버필드 메소드
	boolean power;
	int channel;

	void chagePower() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
}
