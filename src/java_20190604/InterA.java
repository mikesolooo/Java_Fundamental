package java_20190604;
//인터페이스 상속은 다중 상속이 가능함.
public interface InterA extends InterB, InterC{
	//double static final PI = 3.14; (인터페이스의 변수)인데 생략가능
	double PI = 3.14;	
	//인터페이스의 메서드의 접근 한정자를 붙이지 않으면 public이 생략되어 있음
	//abstract는 생략가능
	void mA();	//public void mA();
}
