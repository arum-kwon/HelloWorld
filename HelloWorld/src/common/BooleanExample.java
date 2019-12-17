package common;

public class BooleanExample {
	public static void main(String[] args) {
		boolean trueOrFalse = true;
		
		trueOrFalse = 100>20;
		int var1 = 10;
		
		for(int i=0 ; i<10 ; i++) {
			var1++;
			trueOrFalse = var1 > 15;
			
			if(trueOrFalse)
				System.out.println("true " + var1);
			else
				System.out.println("false " + var1);			
		}
	}
}
