package conditions;

import java.util.Scanner;

public class ExerciseCondition {
	public static void main(String[] args) {
		// 03
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum = sum + i;
		}
		System.out.println(sum);

		int num1 = 0;
		int num2 = 0;
		boolean run = true;
		while (run) {
			num1 = (int) (Math.random() * 5 + 1);
			num2 = (int) (Math.random() * 5 + 1);
			System.out.println("(" + num1 + ", " + num2 + ")");
			if ((num1 + num2) == 5)
				run = false;
		}
		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				int z = 4 * x + 5 * y;
				if (z == 60)
					System.out.println("(" + x + ", " + y + ")");
			}
		}
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		boolean run7 = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int inputInt;
		int amt;

		while (run7) {
			System.out.println("----------------------------");
			System.out.println(" 1.예금, 2.출금, 3.잔액, 4.종료 ");
			System.out.println("----------------------------");
			System.out.print("입력>");
			inputInt = scanner.nextInt();

			if (inputInt == 1) {
				System.out.print("예금액>");
				amt = scanner.nextInt();
				if (amt > 0) {
					balance = balance + amt;
				} else {
					System.out.println("금액을 정확히 기입해주십시오.");
				}
			} else if (inputInt == 2) {
				System.out.print("출금액>");
				amt = scanner.nextInt();
				if (amt > 0) {
					if (amt > balance) {
						System.out.println("잔액이 부족합니다.");
					} else {
						balance = balance - amt;
					}
				} else {
					System.out.println("금액을 정확히 기입해주십시오.");
				}
			} else if (inputInt == 3) {
				System.out.println("잔액>" + balance);
			} else if (inputInt == 4) {
				run7 = false;
			}
		}
		System.out.println("종료");
	}

}
