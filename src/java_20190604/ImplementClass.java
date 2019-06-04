package java_20190604;

public class ImplementClass implements InterB,InterC {

	@Override
	public void mB() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass - mB()");
	}

	@Override
	public void mC() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass - mC()");
	}

	
	public static void main(String[] args) {
		// InterB b = new InterB(); 이렇게 객체생성은 못한다
		InterB b = new ImplementClass();
		b.mB();
		
		InterC c = new ImplementClass();
		c.mC();
	}

}
