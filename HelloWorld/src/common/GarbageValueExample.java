package common;

public class GarbageValueExample {
	public static void main(String[] args) {
		int var1 = 2147483640; //2,147,483,648
		byte var2 = 125; //max 127
		
		for(int i=10 ; i>0 ; i--)
		{
			var1 = var1 + i;
			var2 = (byte)(var2 + i);
			System.out.println("v1(int):" + var1 + ", v2(b):" + var2 );
		}
	}

}
