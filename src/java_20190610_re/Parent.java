package java_20190610_re;

public abstract class Parent {
	String name;
	String cphone;
	
	public abstract void insert();  // 부모의 메서드는 아무기능도 없음. 그래서 중괄호 없애주고 abstract 를 붙임 
	public abstract void delete(int i) ;
}
