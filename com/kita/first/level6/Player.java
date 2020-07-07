package com.kita.first.level6;

public abstract class Player { // 1.객체화x
								// 2.타입으로써 주소값만,부모역활만
								// 3. abstract를 붙이면 객체화를 막음
	public abstract void play();

	public void stop() {
		System.out.println("재생을 멈췄다");
	}

}

class CDPlayer extends Player {
	// public abstract void ff();
	@Override

	public void play() {
		System.out.println("CD를 재생합니다.");
	}
}

class DVDplayer extends Player {
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DVD를 재생합니다.");
	}
}
