package java_20190603;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "김사장";
		c.cphone = "010-9261-1047";
		System.out.println("이름: "+c.name);
		System.out.println("핸드폰: "+c.cphone);
		c.actionCustomer();
		
		Manager m = new Manager();
		m.name = "매니저";
		m.cphone = "010-3233-2222";
		m.address = "경기";
		m.id = "백종원";
		m.password = "coffee";
		System.out.println("이름: "+m.name);
		System.out.println("핸드폰: "+m.cphone);
		System.out.println("주소: "+m.address);
		System.out.println("아이디: "+m.id);
		System.out.println("비밀번호: "+m.password);
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		//Super 타입(Alba)으로 Sub 객체(Manager)를 생성할 수 있다.
		//멤버변수는 Super 타입(Alba) 을 포함한 상위 클래스(Customer) 접근 가능.
		Alba alba = new Manager();
		alba.name = "매니저";
		alba.cphone = "010-3233-2222";
		alba.address = "경기";
		//alba.id = "백종원";
		//alba.password = "coffee";
		System.out.println("이름: "+m.name);
		System.out.println("핸드폰: "+m.cphone);
		System.out.println("주소: "+m.address);
		System.out.println("아이디: "+m.id);
		System.out.println("비밀번호: "+m.password);
		alba.actionAlba();
		alba.actionCustomer();

	}
}
