package classes;

public class Student {
	//클래스의 요소 필드, 메소드, 생성자
	String university;
	String studentNO;
	String studentName;
	String major;
	int age;
	
	Student(String university, String studentNO, String studentName){
		this.university = university;
		this.studentNO = studentNO;
		this.studentName = studentName;
	}
	Student(){
		
	}
	
	void studyHard() {	
		System.out.println("Study Hard");
	}
	void playBaskatBall() {
		System.out.println("Play BasketBall");
	}
	void sleep() {
		System.out.println("Sleep");
	}
	void doHomework() {
		System.out.println("Do Homework");
	}
	void introduce() {
		System.out.println(university + "학교 " + studentNO + "학번 " + studentName + "입니다.");
	}
}
