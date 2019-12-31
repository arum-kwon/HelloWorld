package classes;

import java.util.Scanner;

/* 1.입력, 2.조회, 3.리스트, 4.종료
 * 
 * 필요요소
 * 친구를 담을 배열 Friend
 * 
 * (1) 입력
 *  1.대학동창 2.회사동료 3.그외
 *  1-1 대학동창을 선택할 경우 UnivFriend 인스턴스에 이름 번호 대학 전공 입력받고, 배열에 저장(UnivFriend->Friend)
 *  1-2 회사동료를 선택할 경우 ComFriend인스턴스에 이름 번호 회사 부서 를 입력받음 , 배열에 저장(ComFriend->Friend)
 *  1-3 그외를 선택할 경우 Friend인스턴스에 이름 번호를 받고, 배열에 저장
 *  
 * (2) 조회
 *  1.이름을 입력 받으면, 해당 이름이 있는지 배열을 탐색
 *  1-1 배열이 없으면 없다고 문구 출력
 *  1-2 배열이 있으면 해당 배열의 정보 출력
 *     -1 해당 배열타입이 if(friend instanceof UnivFriend)이면 이름 번호 대학 전공 출력(Friend->UnivFriend)
 *     -2 해당 배열타입이 if(friend instanceof ComFriend)이면 이름 번호 회사 부서 출력(Friend->ComFriend)
 *     -3 그 어디에도 해당되지 않으면, 이름 번호 출력
 *   
 * 
 * 
 * */

public class AddressBook {
	
	static Friend[] friendsAry = new Friend[100]; 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			printMenu(0);
			int input = scInputInt();
			
			if(input == 1) {
				add();
			}else if(input == 2) {
				query();
			}else if(input == 3) {
				list();
			}else if(input == 4) {
				run = false;
			}
		}
		
	}
	
	public static void printMenu(int num) {
		switch(num) {
		case 0:
			System.out.println("=============================");
			System.out.println(" 1.입력 / 2.조회 / 3.리스트 / 4.종료");
			System.out.println("=============================");
			System.out.print(" 선택 > ");
			break;
		case 1:
			System.out.println("-----------------------------------");
			System.out.println(" 입력 >> 1.대학동창 / 2.회사동료  / 3.그 외");
			System.out.println("-----------------------------------");
			System.out.print(" 선택 > ");
			break;
		}
	}
	public static void add() {
		printMenu(1);
		int input = scInputInt();
		
		if(input == 1) {
			inputUnivFriend();
		}else if(input == 2) {
			inputComFriend();
		}else if(input == 3) {
			inputFriend();
		}
	}
	
	public static void query() {
		System.out.println("검색할 이름을 입력하십시오");
		System.out.print(" > ");
		String inputName = sc.nextLine();
		
		for(Friend f : friendsAry) {
			if(f != null) {
				if(inputName.equals(f.getName())) {
					printInfo(f);
				}
			}
		}
	}
	
	public static void list() {
		for(Friend f : friendsAry) {
			if(f != null) {
				printInfo(f);
			}
		}
	}
	
	public static void inputUnivFriend() {
		String[] s = {"이름", "번호", "학교명", "전공"};
		s = inputFriend(s);
		UnivFriend uf = new UnivFriend(s[0], s[1], s[2], s[3]);
		insertAry(uf);
	}
	public static void inputComFriend() {
		String[] s = {"이름", "번호", "회사명", "부서"};
		s = inputFriend(s);
		ComFriend cf = new ComFriend(s[0], s[1], s[2], s[3]);
		insertAry(cf);
	}
	public static void inputFriend() {
		String[] s = {"이름", "번호"};
		s = inputFriend(s);
		Friend f = new Friend(s[0], s[1]);
		insertAry(f);
	}
	public static String[] inputFriend(String[] str) {
		String[] result = new String[str.length];
		for(int i=0 ; i<str.length ; i++) {
			System.out.print(str[i] + " > ");
			result[i] = sc.nextLine();
		}
		return result;
	}
	public static void insertAry(Friend f) {
		for(int i=0 ; i<friendsAry.length ; i++) {
			if(friendsAry[i] == null) {
				friendsAry[i] = f;
				break;
			}
		}
	}

	public static void printInfo(Friend f) {
		//System.out.println(f);
		if(f instanceof UnivFriend) { //형변환
			System.out.println((UnivFriend)f);
		}else if(f instanceof ComFriend) {
			System.out.println((ComFriend)f);
		}else {
			System.out.println(f);
		}
	}
	public static int scInputInt() {
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
}
