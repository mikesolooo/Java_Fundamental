package java_20190528;

public class CharDemo {
	public static void main(String[] args) {
		//����ǥ����
		char a = 'q';
		
		//�����ڵ� ǥ���� '\n'
		char b = '\uAE40';
		char c = '\uD604';
		char d = '\uBBFC';
		
		System.out.print(b);
		System.out.print(c);
		System.out.println(d);
		
		//�ƽ�Ű �ڵ� ǥ����
		char e = 97;
		System.out.println(e);
		
		//���������ڵ� ǥ����
		System.out.println("������ \t ����");
		System.out.println("������ \n ����");
		System.out.println("������ \"����\"");
		
		double f = 85.1;
		System.out.println(f);
		
		double g = 85.1;
		int score = (int)g;
		
		
		// \,' �ΰ��� ���ڴ�  char���� �ν��� ���ϱ� ������
		// \ �� �տ� �ٿ��ش�. 
		
		
		
		
		System.out.println(score);
		
		
		// ���ڿ� �߿��� " �� \ �� �ν��� ����
	}

}
