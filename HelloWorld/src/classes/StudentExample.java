package classes;

public class StudentExample {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");
		
		Student student = new Student();
		Student stuMin = new Student("Yedam", "20191890", "Min");
		student.studentNO = "20192223";
		student.studentName = "Dota";
		student.age = 20;
		student.major = "Korean";
		student.studyHard();
//		stuMin.studyHard();
		student.introduce();
		stuMin.introduce();
		System.out.println();
		
	}
}
