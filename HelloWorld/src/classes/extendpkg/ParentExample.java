package classes.extendpkg;

public class ParentExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.method1();
		parent.method2();
//		parent.method3();
		
		Child child = (Child) parent;
		child.method1();
		child.method2();
		child.method3();

		Parent parent2 = new Parent();
		if(parent2 instanceof Child) {
			child = (Child)parent2;
			child.method1();
			child.method2();
			child.method3();
		}else {
			System.out.println("Parent cannot be cast to Child");
		}
		
		
	}
}
