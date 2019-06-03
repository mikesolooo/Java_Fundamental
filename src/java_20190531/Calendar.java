package java_20190531;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;      
	public static final int SATURDAY = 6; 
	
	//�������� �ƴ��� �Ǵ��ϴ� �޼���
	private boolean isLeafYear(int year) { 		// boolean �� true, false �� �����ϴ� ���̴�

		boolean isLeafYear = false;				// �� �ڵ��� �⺻������ false�� �����ϰ� ������ ���ǿ� ������ true�� ��ȯ�Ѵ�
		if((year%4==0 && year%100==0 || year%400==0 )) {
			isLeafYear = true;
		}
		return isLeafYear;
	}
	//1�� 1�� 1�Ϻ���~ ��,��,���� ���ϼ��� ���ϴ� �޼���
	private int getCount(int year, int month, int day) {
		//���ϼ� ���Ҷ��� �⵵�� �����⵵���� �ϼ��� ���ؾ� �ϱ� ������ preYear������ ����
		int preYear = year - 1;
		//�ش� �⵵�� �������� �����ϱ� ���� ����
		int preMonth= month - 1;
		int totalCnt = 0;
		
		// 2018�⵵���� �� �ϼ� ���ϱ�
		totalCnt = preYear*365+
						(preYear/4-preYear/100+preYear/400);
		
		// 2019�⵵ 4�� 30�ϱ��� �ϼ� ���ϱ�
		// �� �迭�� �����Ѵ�.
		int[] monthArray= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int i=0 ; i < preMonth ; i++) {

			totalCnt += monthArray[i];
		}
		
		//�ش� �⵵�� �������� �Ǵ��ϰ� ������ ��� 3�� �̻��̸� 1�� �߰����ش�.
		if (month >=3 && isLeafYear(year)) {
			totalCnt++;
		} 	//totalCnt += 31+28+31+30;
		
		totalCnt += day;
		return totalCnt;
	}
	
	//�⵵�� �ſ� ��������¥�� ���ϴ� �޼���
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
		
		System.out.println(year+"��"+month+"�� �޷� �Դϴ�.");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//���� ��¥
		int start = 1;
		//������ ��¥
		int end = getLastDay(year,month);
		//2019�� 5�� 1���� ������ ����.
		int dayOfWeek = getCount(year,month,1)%7;
		
		//���ϼ���ŭ ��ó��
		//�������̸� dayOfWeek => 1
		//ȭ�����̸� dayOfWeek => 2
		//�������̸� dayOfWeek => 3
		//.......
		//�Ͽ����̸� dayOfWeek => 7
		for (int i=0;i<dayOfWeek;i++) {
			System.out.print("\t");
		}

		for (int i=start;i<=end;i++) {
				System.out.print(i+"\t");
				//dayOfWeek�� �����ؼ�
				dayOfWeek++;
				//dayOfWeek�� 7�� �Ǹ� ������ ���ش�
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
			case Calendar.MONDAY : dayOfWeak = "������"; break;
			case Calendar.TUESDAY : dayOfWeak = "ȭ����"; break;
			case Calendar.WEDNESDAY : dayOfWeak = "������"; break;
			case Calendar.THURSDAY : dayOfWeak = "�����"; break;
			case Calendar.FRIDAY : dayOfWeak = "�ݿ���"; break;
			case Calendar.SATURDAY : dayOfWeak = "�����"; break;
			case Calendar.SUNDAY : dayOfWeak = "�Ͽ���"; break;
		}
		
		System.out.println(year + "�� " + month + "�� " + day + "�� " + dayOfWeak + "�Դϴ�.");
		

	}
		
}


