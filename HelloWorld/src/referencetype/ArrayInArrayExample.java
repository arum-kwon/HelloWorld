package referencetype;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int [][] intAry = new int[5][4];
		int num =1;
		for(int i=0 ; i<5 ; i++) { //배열 intAryp[i][j]에 값 입력
			for(int j=0 ; j<4 ; j++) {
				intAry[i][j] = num;
				num++;
			}
		}
		
		for(int i=0 ; i<5 ; i++) { //배열 intAryp[i][j]값을 콘솔창에 출력 
			for(int j=0 ; j<4 ; j++) {
				System.out.print(intAry[i][j] + " ");
			}
			System.out.println();
		}
	}
}
