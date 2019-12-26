package classes;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.execute();
		
		double avg = cal.avg(30, 50);
		cal.println("avg : " + avg);
	}
}
