package com.kita.first.level7;

public class Starcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		firebat fb = new firebat();
		fb.attack(m1);
		fb.attack(m1);
		fb.attack(m1);
		System.out.println(m1);
		m1.attack(fb);
		m1.attack(fb);
		System.out.println(fb);
		medic.heal(fb);
		medic.heal(fb);
		medic.heal(fb);
		medic.heal(fb);
		medic.heal(fb);
		medic.heal(fb);
		medic.heal(fb);
		medic.heal(fb);
		medic.heal(fb);
		medic.heal(fb);
		
		
		medic.heal(m1);

		System.out.println(m1);
		System.out.println(fb);
	
		// 마린, 현재 Hp:50
		System.out.println(fb instanceof Carable);
		System.out.println(m1 instanceof Carable);
	}

}
