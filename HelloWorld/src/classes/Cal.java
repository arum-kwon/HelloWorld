package classes;

public class Cal {
	
	int a;
	String p;
	Friend f;
	Friend[] fAry;
	
	public static void main(String[] args) { //달력 출력 2019년 1월~12월만 가능

		CalendarExe cal = new CalendarExe();
		int a = 5;
		cal.createCal(a);
		
	}
}
