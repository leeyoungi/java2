package com.kita.first.level3;

public class Car {
	// 맴버변수는 무조건 private;
	// 유일하게 public인것은 final
	// private은 순서에 상관없이 값을 변경가능
	private final String name;
	String color;
	int cc;

	// 생성자는 리턴타입x 클래스이름과같다
	public Car() {
		/*
		 * this 자기자신의 주소값 파라미터가있는 생성자 호출 this외에 코드는 적을 수없다.
		 */

		this("소나타", "흰색", 2500);
	}

	public Car(String car) {
		/*
		 * this 자기자신의 주소값 파라미터가있는 생성자 호출 this외에 코드는 적을 수없다.
		 */

		this(car, "검정색", 3000);

	}

	public Car(String name, String color, int cc) {
		/*
		 * super 부모의 주소값
		 * 
		 */
		super(); // 슈퍼클래스의 기본생성자를 호출
		// super()위에는 아무런 코드도 생성x
		this.name = name;
		this.color = color;
		this.cc = cc;
		// super.XX()는 맴버변수나 맴버변수를 호출
	}

	public Car(int cc) {
		// TODO Auto-generated constructor stub
		this("", "", cc);
	}

	public void introduceMyCar() {

		System.out.printf("%s의 컬러는 %s이고 %dcc이다", name, color, cc);
		System.out.println();

	}

}
