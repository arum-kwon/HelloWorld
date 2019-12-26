package classes;

import java.util.Scanner;

public class MemderExample {
	
	Member[] memberAry = new Member[5];
	Scanner sc = new Scanner(System.in);
	
	public void execute() {
		int cnt = 0;
		int menu= 1;
		
		while(true){
			printConsole();
			menu = sc.nextInt();
			sc.nextLine();
			if(menu == 1) {
				createMember();				
			}else if(menu == 2) {
				searchMember();
			}else if(menu == 3) {
				listMember();
			}else if(menu == 4) {
				break;
			}
		}
		System.out.println("END");
	}
	
	public void createMember() {
		Member mem = new Member();
		System.out.print("insert name : ");
		String name = sc.nextLine();
		mem.setName(name);
		System.out.print("insert Id : ");
		String id = sc.nextLine();
		boolean check = true;
		for(Member m : memberAry) {
			if(m != null && id.equals(m.getId())) {
				check = false;
				System.out.println("Disabled ID");
				return;
			}
		}
		if(check) {
			mem.setId(id);	
		}
		System.out.print("insert password : ");
		String password = sc.nextLine();
		mem.setPassword(password);
		System.out.print("insert age : ");
		int age = sc.nextInt();
		sc.nextLine();
		mem.setAge(age);
		
		for(int i=0; i<memberAry.length ; i++) {
			if(memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}
		}
	}
	
	public void searchMember() {
		System.out.print("id : ");
		String inputID = sc.nextLine();
		System.out.print("password : ");
		String inputPassword = sc.nextLine();
		boolean check = false;
		for(Member m : memberAry) { //id&pass o=>ok, id o & pass no, id no 
			if(m != null && inputID.equals(m.getId())) {
				check = true;
				if(inputPassword.equals(m.getPassword())) {
					System.out.println(m);
				}else {
					System.out.println("Invalid Password");
				}
			}
		}
		if(!check) {
			System.out.println("No ID");
		}
	}
	public void listMember() {
		for(Member m : memberAry) {
			if(m != null) {
				System.out.println(m);
			}
		}
	}
	
	public void printConsole() {
		System.out.println("----------------------------");
		System.out.println(" 1.생성, 2.조회, 3.리스트, 4.종료");
		System.out.println("----------------------------");
		System.out.print("선택> ");
	}
}
