package conditions;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int sumOdd = 0;
		int sumEven = 0;
		for(int i=0 ; i<100 ; i++)
		{
			sum = sum + i + 1;
			if( ((i+1)%2 == 0) ) { //짝수
				sumOdd = sumOdd + i + 1;
//				System.out.println(i + 1);
			} else {
				sumEven = sumEven + i + 1;
//				System.out.println(i + 1);
			}
		}
		System.out.println(sum);
		System.out.println(sumOdd);
		System.out.println(sumEven);
	}
}
