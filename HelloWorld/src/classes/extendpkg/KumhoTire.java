package classes.extendpkg;

public class KumhoTire extends Tire{
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Kumho Tire 수명 : " + (maxRotation-accumulateRotation));
			return true;
		}else {
			System.out.println("*** " + location + " 사망 ***");
			return false;
		}
		 
	}
}
