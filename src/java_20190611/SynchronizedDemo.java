package java_20190611;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d , y : %d - %s%n",x,y,threadName);
		}
	}
	
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		Thread t1 = new Thread(s1,"ù��° ������");
		
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t2 = new Thread(s2,"�ι�° ������");
		
		t1.start();
		t2.start();
	}
}
