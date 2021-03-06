package java_20190531;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;      
	public static final int SATURDAY = 6; 
	
	//윤년인지 아닌지 판단하는 메서드
	private boolean isLeafYear(int year) { 		// boolean 은 true, false 를 저장하는 것이다

		boolean isLeafYear = false;				// 이 코딩은 기본적으로 false를 저장하고 윤년의 조건에 맞으면 true를 반환한다
		if((year%4==0 && year%100==0 || year%400==0 )) {
			isLeafYear = true;
		}
		return isLeafYear;
	}
	//1년 1월 1일부터~ 년,월,일의 총일수를 구하는 메서드
	private int getCount(int year, int month, int day) {
		//총일수 구할때는 년도는 이전년도까지 일수를 구해야 하기 때문에 preYear변수를 설정
		int preYear = year - 1;
		//해당 년도의 이전달을 저장하기 위한 변수
		int preMonth= month - 1;
		int totalCnt = 0;
		
		// 2018년도까지 총 일수 구하기
		totalCnt = preYear*365+
						(preYear/4-preYear/100+preYear/400);
		
		// 2019년도 4월 30일까지 일수 구하기
		// 월 배열을 생성한다.
		int[] monthArray= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int i=0 ; i < preMonth ; i++) {

			totalCnt += monthArray[i];
		}
		
		//해당 년도가 윤년인지 판단하고 윤년인 경우 3월 이상이면 1을 추가해준다.
		if (month >=3 && isLeafYear(year)) {
			totalCnt++;
		} 	//totalCnt += 31+28+31+30;
		
		totalCnt += day;
		return totalCnt;
	}
	
	//년도의 매월 마지막날짜를 구하는 메서드
	private int getLastDay(int year, int month) {
		int[] monthArray= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeafYear(year)) {
			monthArray[1] = 29;
		}
		return monthArray[month-1];
	}


	
	public void print(int year) {
		for(int i=1;i<=12;i++){
			print(year,i);
		}
		
	}

	public void print(int year, int month) {
		// TODO Auto-generated method stub
		
		System.out.println(year+"년"+month+"월 달력 입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//시작 날짜
		int start = 1;
		//마지막 날짜
		int end = getLastDay(year,month);
		//2019년 5월 1일의 요일을 구함.
		int dayOfWeek = getCount(year,month,1)%7;
		
		//요일수만큼 탭처리
		//월요일이면 dayOfWeek => 1
		//화요일이면 dayOfWeek => 2
		//수요일이면 dayOfWeek => 3
		//.......
		//일요일이면 dayOfWeek => 7
		for (int i=0;i<dayOfWeek;i++) {
			System.out.print("\t");
		}

		for (int i=start;i<=end;i++) {
				System.out.print(i+"\t");
				//dayOfWeek을 증가해서
				dayOfWeek++;
				//dayOfWeek가 7이 되면 개행을 해준다
				if(dayOfWeek%7==0) {
					System.out.println();
				}
			}
			System.out.println();

	
	
	
	}
		

	public void print(int year, int month, int day) {
		// TODO Auto-generated method stub
		
		int totalCnt= getCount(year,month,day);
		int rest = totalCnt % 7;
		String dayOfWeak="";
		switch (rest) {
			case Calendar.MONDAY : dayOfWeak = "월요일"; break;
			case Calendar.TUESDAY : dayOfWeak = "화요일"; break;
			case Calendar.WEDNESDAY : dayOfWeak = "수요일"; break;
			case Calendar.THURSDAY : dayOfWeak = "목요일"; break;
			case Calendar.FRIDAY : dayOfWeak = "금요일"; break;
			case Calendar.SATURDAY : dayOfWeak = "토요일"; break;
			case Calendar.SUNDAY : dayOfWeak = "일요일"; break;
		}
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + dayOfWeak + "입니다.");
		

	}
		
}


