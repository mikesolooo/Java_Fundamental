package java_20190604;

public abstract class Shape {
	String name;
	double degree;
	
	public abstract void draw();
	//오버라이드 되어있지 않은 자식 자체 메서드
	public void drawLine() {
		System.out.println("Shape - drawLine()");
	}
}
