package referencetype;

public class MethodExample {
	public static void main(String[] args) {
//		double s1 = divideBy(5, 3);
//		System.out.println("result : " + s1);
//		String result = printResult("arum");
//		System.out.println(result);
		double d1 = calculator(10,4,"%");
		System.out.println(d1);
	}
	
	public static String printResult(String name) {
		
		
		return ("hi, " + name) ;
	}
	public static double divideBy(int a, int b) {
		return a / (double) b;
	}
	public static double calculator(double a, double b, String cal) {
		double result =0;
		if(cal.equals("+")) {
			result = a+b;
		}else if(cal.equals("-")) {
			result = a-b;
		}else if(cal.equals("*")) {
			result = a*b;
		}else if (cal.equals("/")) {
			result = a/b;
		}else if(cal.equals("%")) {
			result = a%b;
		}else {
			System.out.println("사용할 수 없는 문자입니다.");
		}
		return result;
	}
}
