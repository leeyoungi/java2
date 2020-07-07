package com.kita.first.baseball;

import java.util.Arrays;

public class Baseball {


	private int [] rArr;
	
	public Baseball(int num) {
		
		init(num);
		
    
	}
	private void init(int num) {
		rArr = new int[num];
		setRandom();
	}
	public void setRandom() {
		// TODO Aut1o-generated method stub
		
		 for (int i = 0; i < rArr.length; i++) { 
			 
				rArr[i] = (int) (Math.random() * 9)+1; 

				for (int j = 0; j < i; j++) { 
					 
					   if (rArr[i] == rArr[j]) {
						 
							 i--;
							 
							 break;
							

					   }
					  
					  
				}
					
		 }
		
	
	}

	public int get(int idx) {
		// TODO Auto-generated method stub
		return rArr[idx];
	}

}
