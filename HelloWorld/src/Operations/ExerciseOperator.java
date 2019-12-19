package Operations;

public class ExerciseOperator {
	public static void main(String[] args) {
////		02
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(z);
//			03
//		int score =85;
//		String result = (!(score>90)) ? "GA" : "NA";
//		System.out.println(result);
//			04
//		int pencils =534;
//		int students =30;
//		int pencilsPerStudent = pencils/students;
//		System.out.println(pencilsPerStudent);
//		int pencilsLeft = pencils%students;
//		System.out.println(pencilsLeft);
////			05
//		int value =956;
//		System.out.println(value-value%100);
////			06
//		int lTop = 5;
//		int lbottom = 10;
//		int lHeight = 7;
//		double area = (lTop+lbottom)*lHeight/2.0;
//		System.out.println(area);
////			07
//		int x = 10;
//		int y = 5;
//		System.out.println((x>7) && (y<=5));
//		System.out.println((x%3==2) || (y%2 != 1));
////			08
		double x = 5.0;
		double y = 0.0;
		double z = x % y;
		if(Double.isNaN(z)) {
			System.out.println("NaN not operation % 0");
		}else {
			System.out.println(z+10);
			
		}
	}
}
