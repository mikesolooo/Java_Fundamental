package java_20190531;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;      
	public static final int SATURDAY = 6; 
	
	public boolean isLeafYear(int year) { 		// boolean 은 true, false 를 저장하는 것이다
		boolean isLeafYear = false;				// 이 코딩은 기본적으로 false를 저장하고 윤년의 조건에 맞으면 true를 반환한다
		if((year%4==0 && year%100==0 || year%400==0 )) {
			isLeafYear = true;
		}
		return isLeafYear;
	}
	
	public int getCount(int year, int month, int day) {
		int preYear = year - 1;
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
	
	public int getLastDay(int year, int month) {
		int[] monthArray= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeafYear(year)) {
			monthArray[1] = 29;
		}
		return monthArray[month-1];
	}


	
	public void print(int year) {
		// TODO Auto-generated method stub
		
	}

	public void print(int year, int month) {
		// TODO Auto-generated method stub
		
		System.out.println(year+"년"+month+"월 달력 입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int start = 1;
		int end = getLastDay(year,month);
		int rest = getCount(year,month,1)%7;
		
		for (int i=0;i<rest;i++) {
			System.out.print("\t");
		}

		for (int i=start;i<=end;i++) {
				System.out.print(i+"\t");
				rest++;
				if(rest%7==0) {
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


