package com.kita.first;

import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner Scan=new Scanner(System.in);
   
 
   
   
   System.out.println("ㅎㅇ");
   
 
    
    
    int rval=(int)(Math.random()*81)+10;
    int a=0;
    int count=0;
    while(true) {
    	System.out.println("ㅎㅇ:");
    			a=Scan.nextInt();
    			count++;
    	if(a<rval) {
    		System.out.println("UP");
    		
    	} else if(a>rval) {
    		System.out.println("Down");
    	}else if(a<10 || a>100){
    		System.out.println("ㅎㅇ");
    		break;
    	}else {
    		System.out.println("great "+count+"ㅎㅇ");
    		break;
    	}
     }
	  
	 
   
   }
	
    
   
   
   
   
	

}
