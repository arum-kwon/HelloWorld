package conditions;

public class IfExample {
	public static void main(String[] args) {
		int score = 3;
		if (score >= 90) {
			System.out.println("great. grade A");
		} else{
			if(score >= 80) {
				System.out.println("good. grade B");
			} else {
				if(score >= 70) {
					System.out.println("nice. grade C");
				}else {
					System.out.println("nice. grade D");
				}
				
			}
			
		}
	}
}
