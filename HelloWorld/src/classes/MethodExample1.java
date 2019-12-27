package classes;

public class MethodExample1 {
	public static void main(String[] args) {
		showName();
		showName("LIO");
	}
	public static void showName() {
		System.out.println("Hello, My F");
	}
	public static void showName(String name) {
		System.out.println("Hello, " + name);
	}

	public static void showAge(int age) {
		System.out.println("Hello, " + age);
	}
	
}
