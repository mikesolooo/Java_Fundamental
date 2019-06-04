package java_20190604;

public class Rectangle extends Shape {
	@Override
	public void draw() {
		// 부모의 기능을 그대로 쓰는 것 
		//super.draw();
		System.out.println("Rectangle - draw()");
	}
}
