package Operations;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 =2000000000;
		int v2 = ~v1; // -11
		int v3 = ~v1 + 1; // -10
		System.out.println("v1 : " + toBinaryString(v1) + ", " + v1);
		System.out.println("v2 : " + toBinaryString(v2) + ", " + v2);
		System.out.println("v3 : " + toBinaryString(v3) + ", " + v3);
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
//		while(str.length() < 32) {
//			str = "0"+str;
//		}
		for( ; str.length()<32 ; ) {
			str = "0"+str;			
		}
		return str;
	}
}
