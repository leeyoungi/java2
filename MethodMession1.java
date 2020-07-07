
public class MethodMession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guguDan(4,7);
	}
	public static void guguDan(int a,int j) {
		for(int i=a;i<=j; i++) {
			guguDan(i);
		System.out.println();
	}
	}
	public static void guguDan(int a) {
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d=%d\n", a, i, a * i);
  
		}
		System.out.println();
	}
	
}
