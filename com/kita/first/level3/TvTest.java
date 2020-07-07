package com.kita.first.level3;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Tv tv1=new Tv();//tv값이 복사되서 tv1에복사  기본생성자 
		   //객체가 생성될때 한번한 사용
		System.out.println("name:"+tv1.name);
		tv1.name="삼성tv";
		
	

		System.out.println("name:"+tv1.name);
		 tv1.chagePower();
			System.out.println("power:"+tv1.power);
         tv1.channelUp();
         tv1.channelUp();
         tv1.channelUp();

 		System.out.println("channel:"+tv1.channel);
         tv1.channelDown();
         
     	System.out.println("channel:"+tv1.channel);
	}

}
