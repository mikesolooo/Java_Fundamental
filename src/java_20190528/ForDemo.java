package java_20190528;

public class ForDemo {
	public static void main(String[] args) {
	/*	int sum = 0;
		int i =0;
		for (; i<=100 ; i++) {
			if (i%2==1) {
			sum = sum + i;
		} 
			}
		System.out.printf("1부터 " + (i-1) + "까지 홀수의 합은 : " + sum + "입니다.");
		*/
		
		//구구단 2단 2*3까지
		
		tt2: for (int j=2;j<=9;j++) {
			if (j==3) continue;
			for(int k=1 ; k<=9 ; k++) {
				if (k==4) break tt2;
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
		
	}

}
