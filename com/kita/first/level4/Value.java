package com.kita.first.level4;

public class Value extends Object{
	private int val;

	public Value(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}
	@Override
	public String toString() {

		
		return String.format("%,d ", val);

	}
	
	@Override
	public boolean equals(Object obj) {
		Value objValue = (Value) obj;
		return this.val == objValue.getVal();
	}
	
}
