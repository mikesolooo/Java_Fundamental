package java_20190528;

public class IfDemo {
	public static void main(String[] args) {
		//args[0] ���α׷� ����� �Է¹��� ��
		//Integer.parseInt() �޼ҵ�� ���ڿ��� int ��ȯ�ϴ� ���
		int month = Integer.parseInt(args[0]);
		// �ٷ� ���� �ڵ� �����ϱ�
		/*
		 * if(month==12 || month==1 || month==2) {
		 * System.out.println(month+"���� �ܿ� �Դϴ�."); }else if(month==3 || month==4 ||
		 * month == 5) { System.out.println(month+"���� ���Դϴ�."); }else if
		 * (month==6||month==7||month==8) { System.out.println(month+"���� �����Դϴ�."); }else
		 * if(month==9||month==10||month==11) { System.out.println(month+"���� �����Դϴ�.");
		 * }else { System.out.println(month+"���� ������ �ƴմϴ�."); }
		 */
		String season = null;
		// ���ڿ� ����
		switch(month) {
		default :
			System.out.println(month+"���� ������ �ƴմϴ�..");break;
			case 12 :
			case 1 :
			case 2 :
				season="�ܿ�"; break;
			
			case 3 :
			case 4 :
			case 5 : 
				season="��"; break;
		
			case 6 :
			case 7 :
			case 8 :
				season="����"; break;
				
			case 9 :
			case 10 :
			case 11 :
				season="����"; break;
		}
				
			System.out.println(month+"���� "+season+"�Դϴ�.");
			
	
				
			
		}
	}