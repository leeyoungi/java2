package com.kita.first.level7;

public class Marine extends Unit implements AttackUnit,Carable {
	private int damage;

	public Marine() {
		super("마린", 50);
		damage = 5;
		
	}
 
	@Override
	public String toString() {

		
		return String.format("%s,현재 :%d ",super.NAME,super.getCurrent_hp());

	}
	
	@Override
	public void attack(Unit u) {
	
		System.out.println("따다다다");
		if(u==this) {
			return ;
		}
		u.getDamage(damage);
	}
}
