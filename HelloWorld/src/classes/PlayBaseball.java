package classes;

import java.util.Scanner;

public class PlayBaseball {

	static int indexMax = 3;
	static Scanner sc = new Scanner(System.in);
	static int[] inputAry = new int[indexMax];
	static int[] intAry = new int[indexMax];

	public static void main(String[] args) {
		
		System.out.println("Play Baseball!!");
		
		do {
			printNum(intAry);
			System.out.print(" / ");
			printNum(inputAry);
			setintAry();
			setinputAry();
		}while(checkNum()!=indexMax);

	}
	
	public static int checkNum() {
		int strike = 0;
		int ball = 0;
		for(int i=0; i< indexMax ; i++) {
			for(int j=0 ; j<indexMax ; j++) {
				if(intAry[i]==inputAry[j]) {
					if(i==j) {
						strike++;
						break;
					}
					ball++;
				}
			}
		}
		System.out.println("S:" + strike + ", B:" + ball);
		return strike;
	}
	public static void setinputAry() {		
		for(int i=0; i<indexMax ; i++) {
			System.out.print((i+1) + "번: ");
			int input = sc.nextInt();
			inputAry[i] = input;
		}
	}
	public static void setintAry() {
		int index = 0; 
		while(index<indexMax) {
			int num = (int)(Math.random()*9 + 1);
			if(check(num)) { //중복 체크, 중복이 없으면
				intAry[index] = num;
				index++;
			}
		}
	}
	public static boolean check(int num) {
		for(int j=0 ; j<indexMax-1 ; j++) {
			if(num == intAry[j]) {
				return false;
			}
		}
		return true;
	}
	public static void printNum(int[] intA) {
		for(int i=0; i<intA.length ; i++) {
			System.out.print(intA[i] + " ");
		}
	}
	
}
