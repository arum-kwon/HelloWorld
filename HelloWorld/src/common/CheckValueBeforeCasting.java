package common;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		
		if(i>Byte.MAX_VALUE || i<Byte.MIN_VALUE) {
			System.out.println("do not change byte");
			System.out.println("check value");
			
		}else {
			byte b = (byte) i;
			System.out.println(b);
		}		
	}
}
