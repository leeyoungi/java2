package com.kita.level2;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    sum(4,5);//9
    sum(5,7,9);//21
    sum(1,2,3,4);
	

	
	
	
		}
	public static void sum(String g,int ...arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println("sum:"+sum);
	}
		public static void sum(int ...arr) {
			// TODO Auto-generated method stub
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			System.out.println("sum:"+sum);
		
}
}
