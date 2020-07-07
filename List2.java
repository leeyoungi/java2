import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();// 배열로처리 object는 최상위계층 object는 누구든지 다가질수있음
		// Object obj=1; obj="aaa"; obj=1.1; 사용할려면 강제형변환해줘야함 object를 사용하려면 형변환을 해줘야함 <>를
		// 제네릭이라고함. ?는 엘로우카드
		list.add(1);
		list.add(2);
		list.add(3);

		list.add(10);
		list.add(2, 11);
		list.remove(1);

		list.remove(list.size() - 1);
		list.remove(list.size() - 1);
		// n번사용하면 계속지워짐
		for (int i = 0; i < list.size(); i++) {
			int val = (int) list.get(i);

			System.out.print(val + ",");
		}
		System.out.println();
		int i = 0;

		for (int val : list) {// foreach문을 쓰면 인덱스사용x
			System.out.print((int) val + ",");
			/* System.out.printf("i:%d,%d/",i++,val); */

		}

	}

}
