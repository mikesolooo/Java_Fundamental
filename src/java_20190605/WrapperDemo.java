package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s1 = "42.5";
		String s2 = "90.5";
		
		//primitive data type �� WrapperŬ������ ��ȯ (�ڵ�: boxing) int => Integer
		// 1.5 �̻󿡼��� Integer a1 = a; �̷������� �ڵ�
		Integer a1 = new Integer(a);
		Integer a2 = new Integer(b);
		
		//������ ���ϴ°� �ȵǴµ� ���� ���ϸ� ������
		// wrapper class => primitive data type(�ڵ� : unboxing) �� ��ȯ
		int a3 = a1.intValue() + a2.intValue();
		
		//String => primitive data type ��ȯ
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		System.out.println(a3);
		System.out.println(d3);
		
		//(auto)boxing : primitive data type => Wrapper class �� ��ȯ
		Integer a4 = 300; 	// ������
		Integer a5 = 20;
		
		//(auto)unboxing : Wrapper class => primitive data type �� ��ȯ
		int a6 = a4 + a5; 	// ������
		System.out.println(a6);
	}
}
