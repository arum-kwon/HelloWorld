package classes;

public class Friend {
	private String name;
	private String phone;
	
	public Friend() {
		super();
	}

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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
		return "[name=" + name + ", phone=" + phone + "]";
	};
		
	public void introduce() {
		System.out.println("name is " +name);
	}	

	
}
