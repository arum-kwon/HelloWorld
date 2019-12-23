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
			System.out.println("---------------------------------");
			System.out.println(" 1.입력, 2.합계, 3.평균, 4.삭제, 5.종료 ");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			
			inputInt = scanner.nextInt();
			if(inputInt == 1) { //점수 입력을 받아옵니다.
				if(scoreIndex < 5) {
					System.out.print("  입력>");
					int inputScore = scanner.nextInt();
					score[scoreIndex] = inputScore;
					scoreIndex++;
				}else {
					System.out.println("저장 공간이 부족합니다.");
				}
			}else if(inputInt == 2) { //모든 점수의 합을 가져옵니다.
				int sum = 0;
				for(int i=0; i<scoreIndex ; i++) {
					sum = sum + score[i];
				}
				System.out.println("  합계 : " + sum);
			}else if(inputInt == 3) { //모든 점수의 평균을 가져옵니다.
				int sum = 0;
				for(int i=0 ; i<scoreIndex ; i++) {
					sum = sum + score[i];
				}
				System.out.println("  평균 : " + (double)sum/(scoreIndex));
			}else if(inputInt == 4){ //점수를 삭제합니다.
				System.out.print("[");
				for(int i=0; i<scoreIndex ; i++) {
					System.out.print(" " + (i+1) +"번:" + score[i]);
				}
				System.out.println(" ]");
				System.out.print("  삭제할 번호(돌아가기 0)>");
				int inputNum = scanner.nextInt();
				if(0<inputNum && inputNum<=scoreIndex+1) {  //(1)숫자의 범위가 1~scoreIndex+1일 때
					for(int i=(inputNum-1) ; i<scoreIndex-1 ; i++) {//(2) n을 선택하면 n-1의 숫자가 사라지고 n-1=n, n=n+1, n+1=n+2.. 치환
						score[i] = score[i+1];
					}
					scoreIndex--; //(3)scoreIndex-1
				}else if(inputNum == 0) {
				}else {
					System.out.println("선택할 수 없는 번호입니다.");
				}
			}else if(inputInt == 5) {
				run = false;
			}
		}
		System.out.println("종료");
	}
}
