package java_20190528;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i =0;
		for (; i<=100 ; i++) {
			if (i%2==1) {
			sum = sum + i;
		} 
			}
		System.out.printf("1���� " + (i-1) + "���� Ȧ���� ���� : " + sum + "�Դϴ�.");
		
		for (int j=2;j<=9;j++) {
			for(int k=1 ; k<=9 ; k++) {
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
		
	}

}
