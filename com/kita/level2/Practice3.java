package com.kita.level2;

public class Practice3 {

	public static void main(String[] args) {
		// 1 ~ 9 사이의 랜덤한 값을 중복되지 않게 arr크기만큼 초기화한다.
		
		int len=3;
		
		int[]arr= new int[len];
		
	  for(int a=0;a<arr.length;a++) {
		  arr[a]=(int)(Math.random()*9+1);  ///  
		  for(int j=0;j<a;j++) {
			  if(arr[a]==arr[j]) {
				  a--;
				  break;
			  }
		  }
	  }
	     
	  
	  for(int val:arr) {
		  System.out.println(val);
	  }
	}

}
