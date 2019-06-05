package java_20190605;

import java.text.DecimalFormat;

public class MathDemo {
	public static void main(String[] args) {
		// 실제 개발할 때는 ceil 과 floor 빼고는 거의 쓸 일 없다.
		double d1 = Math.ceil(4.5);
		System.out.println(d1);
		
		double d2 = Math.floor(11.45);
		System.out.println(d2);
		
		long d3 = Math.round(42.5);
		System.out.println(d3);
		
		double d4 = Math.abs(-4234.56);
		System.out.println(d4);
		
		double d5 = Math.max(4.6, 6.7);
		System.out.println(d5);
		
		double d6 = Math.min(34.67, 56.24);
		System.out.println(d6);
		
		double d7 = Math.sqrt(4);
		System.out.println(d7);
		
		double d8 = Math.pow(4,2);
		System.out.println(d8);
		
		double d9 = Math.random();
		System.out.println(d9);
		
		// Display 용도로만 쓰인다
		DecimalFormat cf = new DecimalFormat("#,###.##");
		String str = cf.format(123456.8868);
		
		System.out.println(str);
	}
}
