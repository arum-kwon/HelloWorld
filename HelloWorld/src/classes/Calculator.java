package classes;

public class Calculator {
	int plus(int x, int y) {
		return x+y;
	}
	double avg(int a, int b) {
		int sum = plus(a,b);
		double average = sum / 2.0;
		return average;
	}
	void execute() {
		int a = 10;
		int b = 20;
		double result = avg(a,b);
		println("result : " + result);
	}
	void println(String str) {
		System.out.println(str);
	}
	
	
}
