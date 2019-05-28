package java_20190528;

public class CharDemo {
	public static void main(String[] args) {
		//문자표현법
		char a = 'q';
		
		//유니코드 표현법 '\n'
		char b = '\uAE40';
		char c = '\uD604';
		char d = '\uBBFC';
		
		System.out.print(b);
		System.out.print(c);
		System.out.println(d);
		
		//아스키 코드 표현법
		char e = 97;
		System.out.println(e);
		
		//에스케입코드 표현법
		System.out.println("김현민 \t 만세");
		System.out.println("김현민 \n 만세");
		System.out.println("김현민 \"만세\"");
		
		double f = 85.1;
		System.out.println(f);
		
		double g = 85.1;
		int score = (int)g;
		
		
		// \,' 두개의 문자는  char에서 인식을 못하기 떄문에
		// \ 를 앞에 붙여준다. 
		
		
		
		
		System.out.println(score);
		
		
		// 문자열 중에서 " 와 \ 는 인식을 못함
	}

}
