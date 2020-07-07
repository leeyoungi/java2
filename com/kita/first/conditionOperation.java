package com.kita.first;

public class conditionOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		boolean isodd = (num % 2 == 1 ? true : false);
		System.out.printf("%d is odd %n", num, isodd);
	
		/*?앞에 식이 투트이면 첫번째값 아니면 2번째값
		 * 	
		 */
		
		String result=(num % 2 ==1 ? "홀수" : "짝수");
		System.out.printf("%d is %s\n",num,result);

	}

}
