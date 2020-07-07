package practice;

import java.util.Scanner;

public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        double num1 = scan.nextInt();
        double num2 = scan.nextInt();
        
        System.out.println(num1/num2);
        System.out.println(Math.round(num1/num2)*10);
        System.out.println(Math.round(num1/num2)*10);
        System.out.println(Math.round(num1/num2)*10);
	}

}
