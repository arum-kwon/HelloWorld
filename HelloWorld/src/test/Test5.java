package test;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-입력-");
		System.out.print("품명 : ");
		String item = sc.nextLine();
		System.out.print("수량 : ");
		int qty = sc.nextInt();
		sc.nextLine();
		System.out.print("단가 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		conpute(item, qty, price);
	}
	
	static void conpute(String item, int qty, int price) {
		System.out.println("-출력-");
		System.out.println("품명 : " + item);
		System.out.println("금액 : " + qty*price);
	}
}
