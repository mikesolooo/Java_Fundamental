package java_20190530;

public class Customer {
	//instance variable(��ü ����)
	String name;
	String cphone;
	
	//static variable
	static double interestRate;
	static final String BANKNAME = "��������";
	public void register() {
		//DB insert
		System.out.println("���� ��� �Ǿ����ϴ�.");
		System.out.println("�̸� : "+ name + ", �ڵ�����ȣ : "+cphone
				+", ������: "+interestRate+", ����� : "+BANKNAME);
	}
}