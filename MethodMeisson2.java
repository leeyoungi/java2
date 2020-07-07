
public class MethodMeisson2 {

	public static void main(String[] args) {

		printstar(5);

	
		 printSquare(4);
		 printTriangle(5);
		printTriangleReverse(5);
        printk(5);
	}

	public static void printk(int i) {
		// TODO Auto-generated method stub
		
	}
  
	public static void printTriangleReverse(int i) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= i; a++) {
			for (int j = i - a; j > 0; j--) {
				System.out.print(" ");
			}
			printstar(a);

		}
		 
	}

	public static void printSquare(int a) {
		// TODO Auto-generated method stub
		System.out.println(); 
		for (int j = 0; j < a; j++) {
			printstar(a);
		}
		System.out.println();
	}

	public static void printTriangle(int a) {
		// TODO Auto-generated method stub

		for (int j = 1; j <= a; j++) {
			printstar(j);
		}
		System.out.println();
	}

	public static void printstar(int a) {
		for (int i = 0; i < a; i++) {
			System.out.print("*");
		}

		System.out.println();
	}

}
