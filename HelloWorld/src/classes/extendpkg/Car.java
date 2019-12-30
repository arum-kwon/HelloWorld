package classes.extendpkg;

public class Car {
	Tire tires[] = {new Tire(6, "앞 왼쪽"), new Tire(3, "앞 오른쪽"), new Tire(3, "뒤 왼쪽"), new Tire(4, "뒤 오른쪽")};
//	Tire frontLeft = new Tire(6, "앞 왼쪽");
//	Tire frontRight = new Tire(3, "앞 오른쪽");
//	Tire backLeft = new Tire(3, "뒤 왼쪽");
//	Tire backRight = new Tire(4, "뒤 오른쪽");
	
	void stop() {
		System.out.println("Car STOP");
	}
	
	int run() {
		System.out.println("Car running");
		for(int i=0 ; i<tires.length ; i++) {
			if(tires[i].roll() == false) {
				stop();
				return i+1;
			}
		}
		return 0;
//		if(frontLeft.roll()==false) {
//			stop();
//			return 1;
//		}
//		if(frontRight.roll()==false) {
//			stop();
//			return 2;
//		}
//		if(backLeft.roll()==false) {
//			stop();
//			return 3;
//		}
//		if(backRight.roll()==false) {
//			stop();
//			return 4;
//		}
//		return 0; 
	}
}
