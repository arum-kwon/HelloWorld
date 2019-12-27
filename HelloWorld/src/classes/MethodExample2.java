package classes;

public class MethodExample2 {
	public static void main(String[] args) {
		double result = sum(3.3, 4.5);
		System.out.println("result : " + result);
		
		int[] intAry = {2,3,4,5,6,7};
		System.out.println("sum : " + sum(intAry));
		
		printString(5, "a");
		
	}
	
	public static double sum(double a, double b) {
		return a+b;
	}
	
	public static int sum(int[] iAry) {
		int sum = 0;
		for(int i=0 ; i<iAry.length ; i++) {
			sum = sum + iAry[i];
		}
		return sum;
	}
	//*
	//**
	//***
	//****  str으로 받은 문자를 a개의 줄로 표현
	public static void printString(int a, String str) {
		for(int i=0; i<a ; i++) {
			for(int j=0; j<i+1 ; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
}
