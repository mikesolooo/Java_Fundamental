package java_20190531;

public class StaticMethod {
	static String name;
	int age;
	
	public void m1() {
		name = "��������";
		age = 10;
		m2();
		m4();
		
	}
	public void m2() {
		System.out.println("instance method m2()");
	}
	
	public void m3() {
		name = "��������";//static �޼ҵ忡���� static ���� ���� ����
		//age=10; // static �޼ҵ忡���� instance ���� ���� �Ұ�
		//m2(); // static �޼ҵ忡���� static �޼ҵ� ȣ�� ����
		m4();
	}
	public static void m4() {
		System.out.println("static method m4()");
	}
	public static void main(String[] args) {
		m4(); // StaticMethod.m4();
		name = "��������"; // StaticMethod.name="��������"; ������ �̷����ľ���. ���� �޼���� �ٿ����°� ����
		
		StaticMethod sm = new StaticMethod();
		sm.age = 10;
		sm.m1();
		sm.m2();
		
	}

}
