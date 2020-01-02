package test;

public class PoolMember {
	int memberId;
	String name;
	String phone;
	
	public PoolMember(int memberId, String name, String phone) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.phone = phone;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "회원번호 " + memberId + " : " + name + ", " + phone;
	}

}
