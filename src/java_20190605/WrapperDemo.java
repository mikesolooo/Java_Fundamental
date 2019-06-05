package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s1 = "42.5";
		String s2 = "90.5";
		
		//primitive data type 을 Wrapper클래스로 변환 (자동: boxing) int => Integer
		// 1.5 이상에서는 Integer a1 = a; 이런식으로 코딩
		Integer a1 = new Integer(a);
		Integer a2 = new Integer(b);
		
		//원래는 더하는게 안되는데 막상 더하면 더해짐
		// wrapper class => primitive data type(자동 : unboxing) 로 변환
		int a3 = a1.intValue() + a2.intValue();
		
		//String => primitive data type 변환
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		System.out.println(a3);
		System.out.println(d3);
		
		//(auto)boxing : primitive data type => Wrapper class 로 변환
		Integer a4 = 300; 	// 생략형
		Integer a5 = 20;
		
		//(auto)unboxing : Wrapper class => primitive data type 로 변환
		int a6 = a4 + a5; 	// 생략형
		System.out.println(a6);
	}
}
