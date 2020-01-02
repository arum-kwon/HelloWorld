package classes;

public class CalendarExe {
//	public static void main(String[] args) {
//		createCal(9);
//	}
	public void createCal(int month) {
		System.out.println("============["+ month +"월]============");
		String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int firstWeek = getFirstDayofMonth(month);
		for(int i=0 ; i<7 ; i++) {
			System.out.print(" " + weeks[i]);
		}
		System.out.println();
		System.out.println("==============================");
		for(int i=0; i<firstWeek ; i++) {
			System.out.print("    ");
		}
		for(int i=1 ; i<=getMaxDate(month) ; i++) {
			System.out.printf("%4d", i);
			if ((firstWeek+i)%7==0) {
				System.out.println();
			}
		}
	}
	
	
	public int getFirstDayofMonth(int month) {
		// 0 1 2 3 4 5 6
		// 일 월 화 수 목 금 토
		//기준일 19년 1월 1일 화요일(2)
		int standardM =1;
		int standardW =2;
		
		int intervalD =0;
		if(standardM==month) {
			return standardW;
		}else {
			while(true) {
				intervalD =	intervalD + getMaxDate(standardM);
				standardM++;
				if(standardM==month) {
					return (standardW+intervalD)%7;
				}
			}
		}
	}
	
	public int getMaxDate(int m) {
		if(m<8) {
			if(m%2==1) {
				return 31;
			}else {
				if(m==2){
					return 28;
				}
				return 30;
			}
		}else {
			if(m%2==1) {
				return 30;
			}else {
				return 31;
			}
		}
//		switch (m) {
//		case 1:
//			break;
//		
//		}
	}
}
