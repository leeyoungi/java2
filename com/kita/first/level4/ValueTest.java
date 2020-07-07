package com.kita.first.level4;

public class ValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("A");
		String str2 = new String("A");
		System.out.println("1:" + (str == str2));
		System.out.println("2:" + str.equals(str2)); //String은 부모꺼안쓰고 오버라이딩해서 사용
	Value val1=new Value(1);
	Value val2=new Value(1);
	System.out.println("3:"+(val1==val2));
	System.out.println("4:"+(val1.equals(val2)));
	}

}
