package Operations;

class Student{
	int age;
	String name;	
}

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "lunch";
		String str2 = "lunch";
		String str3 = new String("lunch");
		
		Student stu1 = new Student();
		System.out.println(stu1);

//		System.out.println(str1 == str2);
//		System.out.println(str1 == str3);
//		System.out.println(str1.equals(str3));
	}
}

