package common;

public class BooleanForExample {
	public static void main(String[] args) {
		int var1 = 88;

		// 60점을 이상 pass 아니면 fail
		if (var1 > 60)
			System.out.println("pass");
		else
			System.out.println("fail");

		// 90점을 넘으면 양호, 70점을 넘으면 보통, 70점 미만은 미흡
		if (var1 > 90)
			System.out.println("양호");
		else if (var1 > 70)
			System.out.println("보통");
		else
			System.out.println("미흡");

		for (int i = 0; i < 10; i++) {
			var1 = 50 + i * 5;
			// 90이상 수 , 80우, 70미, 60양, 가
			if (var1 > 90) {
				if (var1 > 95) {
					System.out.println("+A");
				} else {
					System.out.println("A");
				}
			} else if (var1 > 80) {
				if (var1 > 85) {
					System.out.println("+B");
				} else {
					System.out.println("B");
				}
			} else if (var1 > 70) {
				if (var1 > 75) {
					System.out.println("+C");
				} else {
					System.out.println("C");
				}
			} else if (var1 > 60) {
				if (var1 > 65) {
					System.out.println("+D");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
		}
		for (int i = 0; i < 10; i++) {
		}
	}
}
