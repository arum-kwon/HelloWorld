package classes.extendpkg;

public class Child extends Parent{
	String field2;

	@Override
	void method1() {
		System.out.println("Child method1");
	}

	@Override
	void method2() {
		System.out.println("Child method2");
	}

	void method3() {
		System.out.println("Child method3");
	}
	
}
