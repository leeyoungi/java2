package com.kita.first;

public class NamedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Parent:  for(int i=0; i<10; i++) {
			  Parent2:
		   for(int j=0; j<20; j++) {
			 
			   if(j==15) {
				   continue  Parent2;
			   }
			   System.out.printf("%d - %d \n",i,j);
			 
			   
		   }
	   }

	}

}
