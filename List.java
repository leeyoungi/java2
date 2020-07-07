import java.util.Arrays;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		int[] temp = new int[4];
   
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
         
		}
		temp[arr.length] = 4;

		// 리터럴을 4 사용할 수 있고
		// arr=new int[]{1,2,3,4};//금지!!!;

		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

}
