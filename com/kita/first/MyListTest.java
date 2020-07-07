package com.kita.first;

import java.util.ArrayList;
import java.util.Arrays;

import com.kita.level2.Array;

public class MyListTest {// 파일명과 같은 클래스만 public 사용가능
	public static void main(String args[]) {
		
		MyList list = new MyList();
		
		list.add(10);
		list.add(15);
		list.add(20);
		
		list.add(1, 1200);
		int len = list.size();
		int val = list.get(1);
		System.out.println("길이는:"+len);
		int delval=list.remove();// 마지막행삭제
		/*
		 * int delval1=list.remove(1);// 마지막행삭제
		 */		
	MyArrays MyArrays=new MyArrays();
	
		 System.out.println(delval);
		
		 MyArrays.print(list);	
		String str=MyArrays.toString(list);
		System.out.println(str);
		
		
	
	}

}
class MyArrays{

	public static void print(MyList list) {
		// TODO Auto-generated method stub
		 System.out.print("[");
		for(int i=0; i<list.size();i++) {
			
		
				if(i<list.size()-1) {
					System.out.print(list.get(i)+",");
				}
				else {
					System.out.print(list.get(i)+"]");
				}
			
			
		}
	
	}

	public String toString(MyList list) {
		// TODO Auto-generated method stub
	   
		String str="";
		for(int i=0;i<list.size();i++) {
			if(i>0) {
				 str+=",";
			}
			str+=list.get(i);
	
		}
		System.out.println();
		return String.format("[%s]", str);
		
	}
	
	
}

class MyList {

	private int a[] = new int[0];
	

	void add(int num) {

		int b[] = new int[a.length + 1];

		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];

		}

		b[a.length] = num;

		// 리터럴을 4 사용할 수 있고
		// arr=new int[]{1,2,3,4};//금지!!!;

		a = b;
		
	}

	
   
	public int remove(int num) {
		// TODO Auto-generated method stub
		int b[] = new int[a.length-1];
            
		for (int i = 0; i < b.length; i++) {
                if(i<num) {
                	b[i] = a[i];
                }else {
                	 b[i] = a[i+1];
                }
		
               

		}
		
		int delval=a[num];
		a = b;
		System.out.println(Arrays.toString(a));
		return delval;
	}



	
	  public int remove() { 
		 
		int c = a.length-1;
		  int b[] = new int[a.length-1];
          
			for (int i = 0; i < b.length; i++) {
	                if(i<c) {
	                	b[i]= a[i];
	                }else {
	                	 b[i] = a[i+1];
	                }
			}
	                int result=a[c];
	        		a = b;
	        		System.out.println(Arrays.toString(a));
			return result; 
	  }
	 
	public int get(int num) {

		
		return a[num];
	}

	public int size() {

		
		return  a.length;
	}

	public void add(int num, int num2) {

		int b[] = new int[a.length + 1];

		for (int i = 0; i < a.length; i++) {
            if(i<num) {
            	b[i] = a[i];
            }else {
            	b[i + 1] = a[i];
            }
		

		}
		/*
		 * for (int i = 0; i < a.length; i++) {
		 * b[i] = a[i];
		 * }
		 * for (int j = num; j < a.length; j++) {// 0 // 1=a[0] }
		 */
		b[num] = num2;
		a = b;
		System.out.println("삽입" + Arrays.toString(a));
	}

}