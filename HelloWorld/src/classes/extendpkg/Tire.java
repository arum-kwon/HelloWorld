package classes.extendpkg;

public class Tire {
	int maxRotation; //사용가능한 회전수(10)
	int accumulateRotation; //현재까지 사용한 회전수
	String location; //장착 위치 앞오 앞왼 뒤오 뒤왼
	
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation-accumulateRotation));
			return true;
		}else {
			System.out.println("*** " + location + " 사망 ***");
			return false;
		}
		 
	}
	
}
