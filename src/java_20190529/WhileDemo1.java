package java_20190529;

public class WhileDemo1 {
	public static void main(String[] args) {
		// 1~100 까지 합 while 문으로 작성, for문도 총 2개
		
		int a = 1;
		int sum = 0;
		int sum1 = 0;
		
		while (a<=100) {
			sum+=a;
			a++;
		}
		
		for(int b = 1 ; b <= 100 ; b++ ) {
			sum1 += b;
		}
		
		System.out.println("(while문)1~100의 합계 : "+sum);
		System.out.println("(for문)1~100의 합계 : "+sum1);

		// 1~100까지 홀수합, 짝수합, while, for문 총 4개
		
		
	

		// 구구단 while 문으로 해보기, for문으로도 2개
	}
}