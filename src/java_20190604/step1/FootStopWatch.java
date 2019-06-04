package java_20190604.step1;

public class FootStopWatch {
	public long startTime;
	public long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime-startTime)/(double)1000;
	}
	
	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		f.startTime = System.currentTimeMillis(); // 1970년 부터 지금까지 시간을 반환
		
		for(int i=0;i<2_000_000_000l;i++) {
			
		}
		f.endTime = System.currentTimeMillis();
		double elapsedTime = f.getElapsedTime();
		
		System.out.println("경과된 시간(밀리세컨드) : "+elapsedTime);
	}
}
