package com.kita.first.level7;

public class Medic extends Unit {
	private int addhp;
	
	
	public Medic() {
		super("메딕", 70);
     
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {

		return String.format("%s,현재 :%d ", super.NAME, super.getCurrent_hp());

	}

	public void heal(Unit unit) {
		// TODO Auto-generated method stub
		firebat fb=new firebat();
		if (unit == this || !(unit instanceof Carable) ) {
			System.out.println("치료할 수 없습니다.");
			return;
			
		}
		if(unit.getCurrent_hp() < unit.MAX_HP) {
			unit.setCurrent_hp(unit.getCurrent_hp()+1);
		}
		  

     
	}

}
