package java_20190528;
// 소수 구하기
public class ForDemo2 {
	public static void main(String[] args) {
		
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


}
