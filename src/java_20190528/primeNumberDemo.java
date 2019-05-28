package java_20190528;

public class primeNumberDemo {
	public static void main(String[] args) {
		
		int pnc=0;
		
		for (int a=2;a<=100;a++) {
			int count = 0;
			for (int k=2;k<=a;k++) {
				if (a%k==0) {
					count+=1;
				}
			}
				if (count==1) {
					pnc+=1;
					System.out.println(a+"는 소수입니다.");
				}
			}
	
		System.out.println("소수의 개수는 "+ pnc + "개입니다.");
	}
}

