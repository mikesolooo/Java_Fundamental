package java_20190528;
// �Ҽ� ���ϱ�
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
				System.out.println(a+"�� �Ҽ��Դϴ�.");
				primeCount += 1;
			}
		}
		System.out.println("�Ҽ��� ������ :" + primeCount);
	}
*/

		public static void main(String[] args) {
			// �Ҽ� ���ϱ� ����(1~100)
			// for �� �̿��ϱ�
			// for �� �̿�� �Ҽ� ����, ������� int ���
			
			int primeCount = 0;
			
			for (int i=2;i<=100;i++) {
				int count = 0;
				for (int j=1;j<=i;j++) {
					if (i%j==0) {
						count+=1;
					}
				}
				if (count==2) {
					System.out.println(i+" �� �Ҽ��Դϴ�.");
					primeCount+=1;
				}
			}
			System.out.println("1~100 �Ҽ��� ������ " + primeCount + " �� �Դϴ�.");
			
		}
}
