package test;

public class Test6 {

	public Test6(int a, int b){
		if(a<b) {
			System.out.println(b);
		}else {
			System.out.println(a);
		}
	}
	public Test6(double a, double b){
		if(a<b) {
			System.out.println(b);
		}else {
			System.out.println(a);
		}
		
	}
	public Test6(char a, char b){
		if(a<b) {
			System.out.println(b);
		}else {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Test6 ob1 = new Test6(10, 20);
		Test6 ob2 = new Test6(12.4, 9.45);
		Test6 ob3 = new Test6('z', 'p');
	}
}
