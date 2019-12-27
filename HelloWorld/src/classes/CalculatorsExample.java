package classes;

class Calculators{
	static double PI = 3.14159; //정적 변수 대문자, 두단어 이상일 경우 _로 구분
	String color;
	
	public Calculators() {}
	public Calculators(String color) {
		super(); //부모클래스의 생성자
		this.color = color;
	}
	void setColor(String color) {
		this.color = color; //this 매서드는 생성자를 말한다. 
		
	}
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	
}
public class CalculatorsExample {
	public static void main(String[] args) {
		Calculators cal = new Calculators();
		Calculators cal2 = new Calculators();
		cal.color = "White";
		cal.setColor("black"); //인스턴스 메소드는 반드시 인스턴스 선언 후 사용 가능

		System.out.println(cal2.PI);
		System.out.println(cal.PI);
		cal.PI = 30;
		System.out.println(cal2.PI);
		System.out.println(cal.PI);
		
		
		cal.plus(4, 5); //static 메소드는 클래스명.메소드명 으로 사용 가능
		Calculators.plus(6, 7);
	}
}
