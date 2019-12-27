package classes;

public class Account {
	private String accoutID;
	private String ownerName;
	private int balance;
	private int MAX_BALANCE = 1000000;
	private int MIN_BALANCE = 0;
	Account(){
	}
	public Account(String accoutID, String ownerName, int balance) {
		super();
		this.accoutID = accoutID;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void setAccoutID(String accoutID) {
		this.accoutID = accoutID;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setBalance(int balance) {
		int bal = this.balance + balance;
		if(bal < MIN_BALANCE){
			System.out.println("잔액이 없습니다.");
		}else if(MAX_BALANCE < bal){
			System.out.println("한도 초과입니다.(계좌 한도 : "+balance+")");
		}else {
			this.balance += balance;
			System.out.println("-저장 완료-");
		}
	}

	public String getAccoutID() {
		return accoutID;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getBalance() {
		return balance;
	}
	@Override
	public String toString() { //오브젝트 클래스에 정의된 메서드. 원래 주소를 찍게함
		return "[NO=" + accoutID + ", OWNER=" + ownerName + ", BALANCE=" + balance + "]";
	}
	
}
