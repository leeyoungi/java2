package com.kita.first.level5;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
		//ani.sleep();
		
		Cat cat = (Cat)ani;
		cat.cry();
		cat.sleep();
	}

}