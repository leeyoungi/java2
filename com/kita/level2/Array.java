package com.kita.level2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= new int [4];
		   arr[0]=10;
		   arr[1]=20;
		   arr[2]=30;
		   arr[3]=40;
		   
   
    char[]arr2=new char[20];
    System.out.println("char :"+ (int)arr2[2]);
    float[]arr3=new float[10];
    String []arr4=new String [200];
    arr4[0]="dd";
    
    int [] arr5= {10,20,30,40};
    int [] arr6= arr5;
    
    System.out.println(arr5);
    System.out.println(arr6);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr4[0]);
    System.out.println(arr2[2]);
	
    
    System.out.println("---------------------");
    
    int [] arr7= new int[100];
    for(int i=0; i<100; i++) {
    	arr7[i]=5;
    }
    
    for(int j=0; j<100; j++) {
    	System.out.println(arr7[j]);
    
    }
	}

	
}
