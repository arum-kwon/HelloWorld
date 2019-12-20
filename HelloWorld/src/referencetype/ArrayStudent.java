package referencetype;
import java.util.Scanner;

public class ArrayStudent {
	
	public static void main(String[] args) {
		
		boolean run = true;
		int[] score  = new int[5];
		int scoreIndex =0;
		Scanner scanner = new Scanner(System.in);
		int inputInt;
		
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println(" 1.입력, 2.합계, 3.평균, 4.종료 ");
			System.out.println("---------------------------");
			System.out.print("선택>");
			
			inputInt = scanner.nextInt();
			if(inputInt == 1) {
				if(scoreIndex < 5) {
					System.out.print("  입력>");
					int inputScore = inputInt = scanner.nextInt();
					score[scoreIndex] = inputScore;
					scoreIndex++;
				}else {
					System.out.println("저장 공간이 부족합니다.");
				}
			}else if(inputInt == 2) {
				int sum = 0;
				for(int i=0; i<scoreIndex ; i++) {
					sum = sum + score[i];
				}
				System.out.println("  합계 : " + sum);
			}else if(inputInt == 3) {
				int sum = 0;
				for(int i=0 ; i<scoreIndex ; i++) {
					sum = sum + score[i];
				}
				System.out.println("  평균 : " + (double)sum/(scoreIndex));
			}else if(inputInt == 4) {
				run = false;
			}
		}
		System.out.println("종료");
	}
}
