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

//ä���� 7���� 1 ���ߴ� Ŭ���� �����ϱ�

public class TvTest{
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� "+ t.channel+" �Դϴ�.");
	}
}