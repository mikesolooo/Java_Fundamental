package java_20190603;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "�����";
		c.cphone = "010-9261-1047";
		System.out.println("�̸�: "+c.name);
		System.out.println("�ڵ���: "+c.cphone);
		c.actionCustomer();
		
		Manager m = new Manager();
		m.name = "�Ŵ���";
		m.cphone = "010-3233-2222";
		m.address = "���";
		m.id = "������";
		m.password = "coffee";
		System.out.println("�̸�: "+m.name);
		System.out.println("�ڵ���: "+m.cphone);
		System.out.println("�ּ�: "+m.address);
		System.out.println("���̵�: "+m.id);
		System.out.println("��й�ȣ: "+m.password);
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		//Super Ÿ��(Alba)���� Sub ��ü(Manager)�� ������ �� �ִ�.
		//��������� Super Ÿ��(Alba) �� ������ ���� Ŭ����(Customer) ���� ����.
		Alba alba = new Manager();
		alba.name = "�Ŵ���";
		alba.cphone = "010-3233-2222";
		alba.address = "���";
		//alba.id = "������";
		//alba.password = "coffee";
		System.out.println("�̸�: "+m.name);
		System.out.println("�ڵ���: "+m.cphone);
		System.out.println("�ּ�: "+m.address);
		System.out.println("���̵�: "+m.id);
		System.out.println("��й�ȣ: "+m.password);
		alba.actionAlba();
		alba.actionCustomer();

	}
}
