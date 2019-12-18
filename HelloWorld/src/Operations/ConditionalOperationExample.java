package Operations;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 56;
		char grade = (score>90) ? 'A' : (
										 (score>80) ? 'B' : (
															 (score>70) ? 'C' : (
																				 (score>60) ? 'D' : 'E'
																					 					)
																	 									 )
												 														  );
		System.out.println(score + ", " + grade);
	}
}
