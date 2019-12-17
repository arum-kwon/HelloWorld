package common;

public class IntExample {
	public static void main(String[] args) {
			int var1 = 10;
			int var2 = 010;
			int var3 = 0x1;
			
			System.out.println("v1:" + var1 + ", v2:" + var2 + ", v3:"+ var3);
			
			for(int i=0 ; i<20 ; i++)
			{
				System.out.printf("%X ", var3++);
			}
	}
}
