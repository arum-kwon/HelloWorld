package classes;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		Person[] personAry = new Person[3];
//		for(int i=0 ; i<3 ;i++) {
//			System.out.println(personAry[i]);
//		}
		
		Person p1 = new Person("190101", 100,120,40,"Mary");
		Person p2 = new Person("191201", 100,140,50,"Ann");
		Person p3;

		personAry[0] = new Person("190110", 101,130,45,"Tollola");
		personAry[1] = p1;
		personAry[2] = p2;

		Person[] personAry2 = {new Person("190110", 101,130,45,"Tu"), new Person("190110", 101,130,45,"Tun")};
		Person[] personAry3 = new Person[] {new Person("190110", 101,130,45,"Alan"),};

//		for(int i=0 ; i<3 ;i++) {
//			System.out.println(personAry[i]);
//		}
//		System.out.println(personAry3.length);
//		for(int i=0 ; i<3 ;i++) {
//			personAry[i].sleep();
//		}
//		for(int i=0 ; i<2 ;i++) {
//			personAry2[i].sleep();
//		}
//		for(int i=0 ; i<personAry3.length ;i++) {
//			personAry3[i].sleep();
//		}
//		System.out.println("------------------");
//		for(Person p : personAry) {
//			p.sleep();
//		}
		System.out.println("---------------------------");
		System.out.print("조회할 사람의 이름을 입력하시오 : ");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		for(Person p : personAry) {
			if(p.name.equals(input)) {
				System.out.println("name:" + p.name + "| birthday:" + p.birthday + "| occupationID :" +p.occupationID);
			}
		}
	}
}
