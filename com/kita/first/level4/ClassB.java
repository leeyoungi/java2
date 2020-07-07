package com.kita.first.level4;

public class ClassB extends ClassA{
	public ClassB(){
		super();
		System.out.println("나 ClassB");
	}
	public void print() {
		System.out.println("B");
		
	}
	@Override
	void write() {
		System.out.println("비를 쓰다.");
	}
	public void showMe() {
		System.out.println("showme");
	}
}
