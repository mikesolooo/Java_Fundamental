package java_20190528;
// 소수 구하기
public class ForDemo2 {
/*	public static void main(String[] args) {
		
		int primeCount=0;
		
		for (int a=2;a<=100;a++) { 
			int count = 0;
			for (int k=2;k<=a;k++) {
				if (a%k==0) {
					count +=1;
				}
			}
			if (count==1) {
				System.out.println(a+"는 소수입니다.");
				primeCount += 1;
			}
		}
		System.out.println("소수의 갯수는 :" + primeCount);
	}
*/

		public static void main(String[] args) {
			// 소수 구하기 연습(1~100)
			// for 문 이용하기
			// for 문 이용시 소수 숫자, 약수숫자 int 사용
			
			int primeCount = 0;
			
			for (int i=2;i<=100;i++) {
				int count = 0;
				for (int j=1;j<=i;j++) {
					if (i%j==0) {
						count+=1;
					}
				}
				if (count==2) {
					System.out.println(i+" 는 소수입니다.");
					primeCount+=1;
				}
			}
			System.out.println("1~100 소수의 개수는 " + primeCount + " 개 입니다.");
			
		}
}
