package referencetype;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = {1,2,3,4,5};
		System.out.println(intAry[2]);
		intAry[2] = 30;		
		System.out.println(intAry[2]);

		String[] strAry = {"perfact","excellent", "very good", "good", "naic"};
		for(int i=0 ; i<5 ; i++) {
			System.out.println(strAry[i]);
		}
		
		int sum =0;
		for(int i=0; i<5 ; i+=2) {
			sum=sum+intAry[i];
		}
		System.out.println("sum : " + sum + ", age : " + (double)sum/intAry.length);
		
		
		int[] intAry2 = new int[25];
		System.out.println(intAry2.length);
		for(int i=0 ; i<25 ; i++) {
			intAry2[i] = (i+1)*2;
		}
		int sum1 = 0;
		for(int i=0 ; i<25 ; i++) {
			sum1 = sum1 + intAry2[i];
		}
		System.out.println("sum : " + sum1 + ", avg : " + (double)sum1/intAry2.length);
		
		for(int i=0 ; i<25 ; i++) {
			System.out.print(intAry2[i] + " ");
			if(i%5 == 4) {
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		int[] num = new int[25];
		for(int i=0 ; i<25 ; i++) {
			num[i] = i+1;
		}
		
		int a,b,c;
		//int sum = 0;
		sum = num[0] + num[1] + num[2] + num[3] + num[4] + num[5];
		
		
		
		
		
		
		
		
		
		
		
		sum = num[0];
		sum = sum + num[1];
		sum = sum + num[2];
		sum = sum + num[3];
		sum = sum + num[4];
		sum = sum + num[5];
		sum = sum + num[6];
		
		
		
		
		
		
		
	}
}
