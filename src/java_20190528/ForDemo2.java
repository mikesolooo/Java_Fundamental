package java_20190528;
// �Ҽ� ���ϱ�
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
				System.out.println(a+"�� �Ҽ��Դϴ�.");
				primeCount += 1;
			}
		}
		System.out.println("�Ҽ��� ������ :" + primeCount);
	}


}
