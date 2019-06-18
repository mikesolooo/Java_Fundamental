package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//데이터의 중복을 허용하고, 순서를 관리한다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		//출력 get (인덱스)
		for (int i=0;i<list.size();i++) {
			String temp=list.get(i);
			System.out.println(temp);
		}
		for(String temp : list) {
			System.out.println(temp);
		}
		// 숫자 나오는걸 미리 예상가능해야함
		list.remove(2);
		
		String temp = list.get(2);
		System.out.println(temp);
		//3번쨰자리 것을 꺼낼경우 error
		temp = list.get(1);
		System.out.println(temp);
	}
}
