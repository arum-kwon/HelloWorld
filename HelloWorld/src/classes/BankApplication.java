package classes;

import java.util.Scanner;

public class BankApplication {

	static Scanner sc = new Scanner(System.in);
	static Account[] accountAry = new Account[10];
	
	public static void main(String[] args) {
		execute();
	}
	
	public static void execute() {
		
		int menu = 0;
		boolean run = true;
		
		while(run) {

			System.out.println("---------------------------------------");
			System.out.println(" 1.계좌생성, 2.계좌목록, 3.예금, 4.출금, 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("입력> ");
			menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				createAccount();
			}else if(menu == 2) {
				listAccount();
			}else if(menu == 3) {
				deposit();
			}else if(menu == 4) {
				withdraw();
			}else if(menu == 5) {
				run = false;
			}
		}	
	}
	
	public static void createAccount() {
		System.out.println("---------------------");
		System.out.println("                계좌생성");
		System.out.println("---------------------");

		
		System.out.print("계좌번호(4자) : ");
		String acID = sc.nextLine();
		if(acID.length()!=4) { // 4자리 검사
			System.out.println("계좌번호는 4자리입니다.");
			return;
		}
		Account ac = findAccount(acID); //중복 검사
		if(ac != null) {
			System.out.println("사용할 수 없는 번호입니다.");
			return;
		}
		System.out.print("계좌주 : ");
		String acOwn = sc.nextLine();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		sc.nextLine();

		ac = new Account(acID, acOwn,balance);
		for(int i=0 ; i<accountAry.length ; i++) { 
			if(accountAry[i] == null) { //빈 배열에 계좌 저장
				accountAry[i]=ac;
				System.out.println("-생성 완료-");
				break;
			}
		}
//		for(Account a : accountAry) { 값을 읽는 것은 가능하나, 넣을 땐 인덱스를 참조 못한다고 한다.
//			System.out.println(a);
////			if(a == null) {
////				a=ac;
////				System.out.println("생성 완료");
////				break;
////			}
//		}
		
	}
	public static void listAccount() {
		System.out.println("---------------------");
		System.out.println("                계좌목록");
		System.out.println("---------------------");

		for(Account a : accountAry) {
			if(a != null) {
				System.out.println(a);
			}
		}
	}
	public static void deposit() { //예금 계좌번호, 입금
		System.out.println("---------------------");
		System.out.println("                예금");
		System.out.println("---------------------");
		System.out.print("계좌번호(4자) : ");
		String acID = sc.nextLine();
		if(acID.length()==4) {
			Account ac = findAccount(acID);
			if(ac == null) {
				System.out.println("계좌번호를 다시 입력해주십시오."); //없는 계좌번호
			}else {
				try {
					System.out.print("예금액(숫자) : ");
					int inputMoney = sc.nextInt();
					sc.nextLine();
					ac.setBalance(inputMoney);
					System.out.println("-예금 종료-");
				}catch(Exception e) {
					System.out.println("숫자만 입력하세요. ");
					sc.nextLine();
				}
			}
		}else {
			System.out.println("계좌번호는 4자리입니다.");
		}
		
	}
	public static void withdraw() { //출급 계좌번호, 출금
		System.out.println("---------------------");
		System.out.println("                출금");
		System.out.println("---------------------");
		System.out.print("계좌번호(4자) : ");
		String acID = sc.nextLine();
		if(acID.length()==4) {
			Account ac = findAccount(acID);
			if(ac == null) {
				System.out.println("계좌번호를 다시 입력해주십시오."); //없는 계좌번호
			}else {
				try {
					System.out.print("출금액(숫자) : ");
					int inputMoney = sc.nextInt(); 
					sc.nextLine();
					ac.setBalance(-1*inputMoney); //출금이라서 -1 곱해서 마이너스로 저장
					System.out.println("-출금 종료-");
				}catch(Exception e) {
					System.out.println("숫자만 입력하세요. ");
					sc.nextLine();
				}
			}
		}else {
			System.out.println("계좌번호는 4자리입니다.");
		}
	}
	
	public static Account findAccount(String ac) {
		Account acnt = null;
		for(Account a : accountAry) {
			if(a != null && ac.equals(a.getAccoutID())) {
				acnt = a;
				break;
			}
		}
		return acnt;
	}
}
