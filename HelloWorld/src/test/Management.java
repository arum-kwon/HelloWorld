package test;

import java.util.Scanner;

public class Management {
	// 10:53 작성
	//		주요 기능 작성 1.추가  | 2.수정  | 3.삭제  | 4.전체목록  | 5.종료  
	//			1.추가할 때 ID는 입력받지 않고, 저장되는 배열의 인덱스+1로  자동 부여 > 중복 방지
	// 12:47 작성
	//		메서드로 분할,삭제할 때 확인하기(삭제하시겠습니까 y/n), nextInt 예외 처리하기
	//		문제 : findMember(int id)의 결과로 PoolMember를 출력하면 메서드 안의 인스턴스 변수로 받아와야하기 때문에 삭제되지 않음
	//			-> findMember의 결과값으로 memAry[]의 인덱스 값을 가져와 직접 삭제,수정으로 변경
	
	static Scanner sc = new Scanner(System.in);
	static PoolMember[] memAry = new PoolMember[100];

	public static void main(String[] args) {
		exe();
	}
	
	public static void exe() {
		int menu = 0;
		boolean run= true;
		
		while(run) {
			System.out.println("-------------[수영장 회원 관리]---------------");
			System.out.println(" 1.추가  | 2.수정  | 3.삭제  | 4.전체목록  | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("입력> ");
			menu = scInputInt();
			
			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
				memberModify();
			} else if (menu == 3) {
				memberDelete();
			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {
				run = false;
				System.out.println("[종료]");
			}
		}
	}
	public static void memberAdd() {
		System.out.println("[회원 추가]");
		System.out.print("이름> ");
		String name = sc.nextLine();
		System.out.print("연락처> ");
		String ph = sc.nextLine();
		
		for(int i=0 ; i<memAry.length ; i++) {
			if(memAry[i] == null) {
				memAry[i] = new PoolMember((i+1),name, ph);
				System.out.println("[추가] "+memAry[i]);
				break;
			}
		}
	}
	
	public static void memberModify() {
		System.out.println("[회원 정보 수정]");
		System.out.print("회원ID> ");
		int id = scInputInt();
		
		int indexNo = findMember(id);
		if(indexNo == -1) {
			System.out.println("없는 ID입니다.");
		}else {
			System.out.println(memAry[indexNo]);
			System.out.println("[1.이름 수정  | 2.연락처 수정]");
			System.out.print("입력> ");
			int menu = scInputInt();
			if(menu==1) {
				System.out.print("수정할 이름 > ");
				String name = sc.nextLine();
				memAry[indexNo].setName(name);
			} else if (menu==2) {
				System.out.print("수정할 연락처 > ");
				String ph = sc.nextLine();
				memAry[indexNo].setPhone(ph);
			}
			System.out.println("[수정완료] " + memAry[indexNo]);
		}
	}
	
	public static void memberSearch() {
		System.out.println("[회원 조회]");
		System.out.print("회원ID> ");
		int id = scInputInt();
		
		int indexNo = findMember(id);
		if(indexNo == -1) {
			System.out.println("없는 ID입니다.");
		}else {
			System.out.println(memAry[indexNo]);
		}
	}

	public static void memberDelete() {
		System.out.println("[회원 삭제]");
		System.out.print("회원ID> ");
		int id = scInputInt();
		
		int indexNo = findMember(id);
		if(indexNo == -1) {
			System.out.println("없는 ID입니다.");
		}else {
			System.out.println(memAry[indexNo]);
			System.out.print("삭제하시겠습니까?(y/n)");
			String answer = sc.nextLine();
			if(answer.equals("y")) {
				System.out.println("[삭제] " + memAry[indexNo]);
				memAry[indexNo] = null;
			}else if(answer.equals("n")) {
				System.out.println("취소합니다.");
			}else {
				System.out.println("다시 입력해주십시오.");
			}
		}		
	}
	public static void memberList() {
		System.out.println("[회원 목록]");
		
		for(PoolMember m : memAry) {
			if(m != null) {
				System.out.println(m);
			}
		}
	}
	
	public static int findMember(int id) { // 찾는id가 없으면 -1, 있으면 해당 배열의 인덱스값 return
		int indexNo = -1;
		for(int i=0 ; i<memAry.length ; i++) {
			if(memAry[i] != null  && (memAry[i].getMemberId() == id)) {
				indexNo= i;
				break;
			}
		}
		return indexNo;
	}

	public static int scInputInt() { //nextInt를 쓸 때 실수로 문자를 입력하면 에러로 종료되는 것이 번거로워 추가
		
		while(true) {
			try {
				int input = sc.nextInt();
				sc.nextLine();
				return input;
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("숫자만 입력하시오.");
			}
		}
		
	}

}
