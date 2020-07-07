package com.kita.first.level4;

public class ClassTest2 {
	public static void main(String[] args) {
		// 1.부모타입은 자식 객체 주소값을 저장 할 수 있다.(가리킬 수 있다)
		ClassA ca = new ClassB();
		ClassA cb = new ClassC();
		ClassA cd = new ClassA();

		// 2. 자식타입은 부모타입은 부모 객체 주소값을 저장할 수 없다.
		// (가리 킬수 없다.)
		// 3.타입은 메소드 호출 할 수 있나 없나 결정!! (자기가 알고 있는 메소드만 호출 할 수 있다)
		// 호출했을 때는 객체 기준으로 실행이 된다!
		ca.print();

		ClassA clsA = new ClassA();

		clsA.print();
		// clsA.showMe();

		ClassB clsB = (ClassB) clsA;
		clsB.showMe();

	}
}
