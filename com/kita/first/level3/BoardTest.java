package com.kita.first.level3;

public class BoardTest extends BoardVo {

	// private 같은 클래스안에서
	// default private + 같은 패키지
	// protected default +상속관계
	// public 어디서든 가능
    
	
	//값 넣는방법 생성자,setter
	// 값 빼는방법 getter
	public static void main(String[] args) {

		BoardVo vo1 = new BoardVo("1", "2", 3);
		BoardVo vo2 = new BoardVo();
		System.out.println(vo1.getTitle());
		System.out.println(vo1.getContent());
		System.out.println(vo1.getWriteId());
		vo2.setTitle("ㅎ");
		;
		vo2.setContent("d");
		vo2.setWriteId(3);
		System.out.println("vo2 제목" + vo2.getTitle());
		System.out.println("vo2 내용" + vo2.getContent());
		System.out.println("vo2 내용" + vo2.getWriteId());
	}

}
