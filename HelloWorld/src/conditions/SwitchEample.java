package conditions;

public class SwitchEample {
	public static void main(String[] args) {
//		int num = (int)(Math.random()*6)+1;
		char num = (char)(Math.random()*127);
		switch(num) {
		case 1:
			System.out.println("1 획득" + num);
			break;
		case 2:
			System.out.println("2 획득" + num);
			break;
		case 3:
			System.out.println("3 획득" + num);
			break;
		case 4:
			System.out.println("4 획득" + num);
			break;
		case 5:
			System.out.println("5 획득" + num);
			break;
		default:
			System.out.println("6 획득" + num);
			break;
		}
	}
}
