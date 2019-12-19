package conditions;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		i = 1;
		sum = 0;
		do {
			sum = sum + i;
			i++;
		}while(i <= 100);
	}
}
