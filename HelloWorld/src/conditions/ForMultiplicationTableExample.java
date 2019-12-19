package conditions;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for(int m=0 ; m<10 ; m++) {
			for(int n=2 ; n<10 ; n++) {
				if(m==0) {
					System.out.print("----" + n + "단----|");
				}else {
					System.out.print(n + " * " + m + " = " + m*n + " | ");					
				}
			}
			System.out.println("");
		}
		int iMAX = 20;
		for(int i=0 ; i<iMAX ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(i < iMAX/2)
					System.out.print("*");
				else if(j<(iMAX-i)){ 
					System.out.print("*");
				}
				
				
			}
			System.out.println("");
		}
	}
}
