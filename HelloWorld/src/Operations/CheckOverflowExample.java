package Operations;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("overflow, unable to calculate accurately.");
		}
		
		int i1 = 10;
		char c1 = 'A';
		String s1 = "" + c1 + i1;
		System.out.println(s1);
	}
	
	public static int safeAdd(int left, int right) {
		if(right>0) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("overflow"); //예외 처리
			}
		}else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("overflow");
			}
		}
		return left+right;
	}
}
