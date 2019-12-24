package classes;

public class Person {
	//생년월일, 직업, 키, 몸무게, 이름 // 기술(힘, 운동, 건축, 농사, 사육, 예술, 과학), 특성(활발(힘증가) 어쩌구저쩌구) 상태(스트레스, 피로)
	String birthday;
	int occupationID;
	int height;
	int weight;
	String name;
	
	Person(String birthday, int occupationID, int height, int weight, String name){
		this.birthday = birthday;
		this.occupationID = occupationID;
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	//잔다 먹는다 화장실 논다 쉰다 
	void sleep() {
		System.out.println(name+" sleep");
	}
	void eat() {
		System.out.println(name+" eat");
	}
	void toilet() {
		System.out.println(name+" toilet");
	}
	void play() {
		System.out.println(name+" play");
	}
	void rest() {
		System.out.println(name+" rest");
	}
}
