package java_20190529;

public class WhileDemo1 {
	public static void main(String[] args) {
		// 1~100 ���� �� while ������ �ۼ�, for���� �� 2��
		
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
		
		System.out.println("(while��)1~100�� �հ� : "+sum);
		System.out.println("(for��)1~100�� �հ� : "+sum1);

		// 1~100���� Ȧ����, ¦����, while, for�� �� 4��
		
		
	

		// ������ while ������ �غ���, for�����ε� 2��
	}
}