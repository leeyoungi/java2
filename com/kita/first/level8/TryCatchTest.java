package com.kita.first.level8;

public class TryCatchTest {

	public static void main(String[] args)  {
		// 에러발생시 예외처리해야함
		math();
		//math2();
	
			int a=div(10, 5);
			System.out.println("a:"+a);
		
		
		System.out.println("Dd");
	}
	public static int div(int n1,int n2) {
		try {
			return n1/n2;
		}catch (Exception e) {
			return 0;
		}
		
	}
	public static void math2() throws Exception{
		Class.forName("sdsdsdsdsdsdsdsddsddds");
	}
	public static void math() {
		int result = 2;
		try {// 예외발생이 안되면 실행x
			//result = 10 / 0;
			if(result %2 ==0) {
				return ;
			}
		Class.forName("");
		}catch (ClassNotFoundException e) {
			System.out.println("클래스 못찾음");
		
		} catch (Exception e) { // 에러잡음
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다.");
		
		} finally {// 에러가 터지든 말든 무조건 실행해야하는 구문은 finally
			System.out.println("finally");
			System.out.println("result : " + result);
			System.out.println("종료!");
		}
		
	}
	
}
