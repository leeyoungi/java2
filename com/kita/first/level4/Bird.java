package com.kita.first.level4;

public class Bird extends Animal { // Animal의부모는 Object //객체를 생성할떄 오브젝트가 먼저 만들어지고 animal,bird
						// 오버라이딩 메소드 재정의
  
	
	
	
	

	

	protected Bird(String name) {
		// TODO Auto-generated constructor stub
		super(name,"");
		System.out.println(name);
	}



	void flying() {
		System.out.println("펄~ 펄~");
	}

	@Override  //@Override 붙이는이유 실수하는 거를 방지
	void crying() {
		super.crying();
		System.out.println("쨱쨱");
	
		
	}
}
