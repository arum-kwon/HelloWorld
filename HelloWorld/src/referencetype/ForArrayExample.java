package referencetype;

public class ForArrayExample {
	public static void main(String[] args) {
		// 1~10까지의 합
		int sum =0;	
		for(int i=0; i<10 ; i++) {	
			sum = sum + i + 1;
		}
		System.out.println(sum);
		
		//1~10까지의 합 
		int n = 1;
		sum = 0;
		while(n<11) {	
			sum = sum + n;
			n++;
		}
		System.out.println(sum);
		
		//1~100까지 숫자 중에 3의 배수의 합
		sum = 0;
		for(int i=1; i<=100 ; i++) {	
			if(i%3 == 0) {
				sum = sum+i; 
			}
		}
		System.out.println("3의 배수의 합 : "+sum);
		
		//1~100까지의 숫자 중에 7의 배수만 출력
		System.out.print("7의 배수 : ");
		for(int i=1; i<=100 ; i++) {	
			if(i%7 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//1~6까지 숫자를 random으로 생성하고 콘솔에 출력, 5일 경우에만 종료하고, 나머지의 경우 계속 반복
		
	}
}
