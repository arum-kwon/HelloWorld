package Operations;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		x++;
		y--;
		
		System.out.println("x:" + x + ", y:" + y);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		
		x = 10;
		y = 10;
		int z = (x++) + y;
		System.out.println("z : " + z);
		System.out.println("x : " + x);
		
		
		
		boolean play = true;
		System.out.println(play);
		
		for(int i=0; i<1 ; i++) {
			play = !play;
			System.out.println(play);
			if(play)
				System.out.println("one more");
		}
		
			
	}
}
