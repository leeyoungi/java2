package com.kita.first;

public class Mission9 {

	/*
	 * arr 1 ~ 100까지 들어가도ㅓ록 해주세요 순서대로 
	 * 0번일때 1
	 * 1번일때 2
	 * 99번방에 100
	 * _____
	 * 각 방에 있는 모든 값을 더한 후 결과값 출력
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr=new int [10];
    
     for(int i=0; i<arr.length; i++) {
    	
    		arr[i] = (i+1) *2;
    		 System.out.print(arr[i]);
    		if(arr.length-1!=i) {
    			 System.out.print(",");
    			
    		
    		}else {
    			
    			
    		}
    		
    	 
    	
       
        
     }
     
     
     
     
    		
     
  
     
     
	}

}
