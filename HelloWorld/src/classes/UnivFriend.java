package classes;

public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone); //부모 클래스가 갖고 있는 생성자
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "[name=" + super.getName() + ", phone=" + super.getPhone() + ", univ=" + univ + ", major=" + major + "]";
	}

	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		//super.introduce(); //부모 클래스의 메소드를 그대로 쓰는 것

		System.out.println("name is " + super.getName() + ", nuiv " + univ);
	}
	
}
