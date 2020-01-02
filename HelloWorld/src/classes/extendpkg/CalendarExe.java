package classes.extendpkg;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		cal.set(2019, 5-1, 1);
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		createCal(2019, 12);
	}
	
	public static void createCal(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int maxDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int startWeek = (cal.get(Calendar.DAY_OF_WEEK))-1;

		System.out.println("==========["+ year + "년 " + month +"월]==========");
		String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for(int i=0 ; i<7 ; i++) {
			System.out.printf("%4s", weeks[i]);
		}
		System.out.println();
		System.out.println("==============================");
		for(int i=0 ; i<startWeek ; i++) {
			System.out.print("    ");
		}
		for(int i=1 ; i<=maxDate ; i++) {
			System.out.printf("%4d", i);
			if ((startWeek+i)%7==0) {
				System.out.println();
			}
		}
	}
}

