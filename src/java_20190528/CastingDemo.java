package java_20190528;

public class CastingDemo {
	public static void main(String[] args) {
		//byte ������ �Ѿ�� ���� �߻�
		//circuit �߻�
		byte a = (byte)128;
		System.out.println(a);
		
		//float,double�� ĳ�����ϴ� ���� �Ҽ��� ���� ©��
		//cut �߻�
		int b = (int)42.5;
		System.out.println(b);
		
		int totalCount = 42;
		int memberCount = 4;
		
		double c = (double)totalCount/(double)memberCount;
		
		// �Ҽ��� ���ϸ� ǥ���Ϸ��� �Ҷ��� ���� �и� ���� ��ȯ�ؼ� �ڵ��ؾ� �Ѵ�.
		
		System.out.println(c);
		
		
	}

}
