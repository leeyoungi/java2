package com.kita.first.level7;

public class firebat extends Unit implements AttackUnit,Carable{
private int damage;
public firebat() {
	super("파이어벳",60);
	damage=7;
	
}
@Override
public String toString() {

	
	return String.format("%s,현재 :%d ",super.NAME,super.getCurrent_hp());

}
@Override
public void attack(Unit u) {
	// TODO Auto-generated method stub
	System.out.println("파이야~~");
	if(u==this) {
		return ;
	}
	u.getDamage(damage);
}
}
