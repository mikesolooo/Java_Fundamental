package java_20190603pr;

class Tv {
	//TV�� �Ӽ�(�������)
	String color;	//����
	boolean power; 	//��������(on/off)
	int channel;	//ä��
	
	//TV�� ���(�޼���)
	void power() { power = !power; }	//TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel; }		//TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel;}	//TV�� ä���� ���ߴ� ����� �ϴ� �޼���
}

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� ä�� ���� "+t1.channel+" �Դϴ�.");
		System.out.println("t2�� ä�� ���� "+t2.channel+" �Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� ä�� ���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� ä�� ���� "+t1.channel+" �Դϴ�.");
		System.out.println("t2�� ä�� ���� "+t2.channel+" �Դϴ�.");
	}
}
