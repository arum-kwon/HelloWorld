package classes.extendpkg;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		int problemLocatin = 0;
		
		for(int i=0; i<10 ; i++) {
			problemLocatin = car.run();
			switch(problemLocatin) {
			case 1:
				car.tires[problemLocatin-1] = new KumhoTire(10, "frontLeft");
				break;
			case 2:
				car.tires[problemLocatin-1] = new HankookTire(10, "frontRight");
				break;
			case 3:
				car.tires[problemLocatin-1] = new Tire(10, "backLeft");
				break;
			case 4:
				car.tires[problemLocatin-1] = new Tire(10, "backRight");
				break;
			}
		}
		
	}
}
