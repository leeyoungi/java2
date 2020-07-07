package com.kita.level2;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[][]arr=new int[2][3];//정형화할때 사용
   
   int[][]arr2= {  //가변적으로 사용할때 사
		   {10,20,30},
		   {12,13,14,11}
   };
  int [][][]arr3=new int[3][4][5];
  int[]arr4=new int[60];
	/*
	 * System.out.println(arr.length);//arr.lengh를 쳤을떄 2뜨는이유 arr입장에는 중괄호 기준으로 몇개가
	 * 있는지확인. 배열이 가지고있는 개수
	 */	/*
	 * System.out.println(arr2.length); System.out.println(arr2[0].length);
	 * System.out.println(arr2[1].length);
	 */
  for(int i=0;i<arr2.length;i++) {
	  for(int z=0;z<arr2[i].length;z++) {
		 
			  System.out.print(arr2[i][z]+",");  
		  
		  
	  }
	 System.out.println();
  }
   
	}

}
