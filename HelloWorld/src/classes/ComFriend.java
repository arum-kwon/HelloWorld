package classes;

public class ComFriend extends Friend{
	private String company;
	private String dept;
	
	public ComFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dept = dept;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "[name=" + super.getName() + ", phone=" + super.getPhone() + ", company=" + company + ", dept=" + dept + "]";
	}

	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		//super.introduce(); //부모 클래스의 메소드를 그대로 쓰는 것

		System.out.println("name is " + super.getName() + ", company " + company);
	}	
	
	
	
}
