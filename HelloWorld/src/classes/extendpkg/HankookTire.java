package classes.extendpkg;

public class HankookTire extends Tire{
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Hankook Tire 수명 : " + (maxRotation-accumulateRotation));
			return true;
		}else {
			System.out.println("*** " + location + " 사망 ***");
			return false;
		}
		 
	}

}
