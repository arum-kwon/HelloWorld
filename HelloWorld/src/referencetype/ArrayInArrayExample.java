package referencetype;
/*
 *
 *intAry[j][i]

j/i 0  1  2  3  4 (iMax)
0  21 22 23 24 25 (jMax-j)+i
1  16 17 18 19 20 (jMax-j)+i
2  11 12 13 14 15 (jMax-j)+i
3   6  7  8  9 10 (jMax-j)+i
4   1  2  3  4  5 (jMax-j-1)*(iMax)+i+1
(jMax)


i/j 0  1  2  3  4
0   1  6 11 16 21 i+1 (i+1)+(j*5)
1   2  7 12 17 22 i+1 (i+1)+(j*5)
2   3  8 13 18 23 i+1 (i+1)+(j*5)
3   4  9 14 19 24 i+1 (i+1)+(j*5)
4   5 10 15 20 25 i+1 (i+1)+(j*5)

j/i 0  1  2  3  4 
0   1  2  3  4  5 
1   6  7  8  9 10 
2  11 12 13 14 15 
3  16 17 18 19 20 


 * */
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

		System.out.println();
		
		int xIndex = 5;
		int yIndex = 5;
		int [][] intAry2 = new int[xIndex][yIndex];
		for(int i=0 ; i<xIndex ; i++) { //배열 intAryp2[i][j]에 값 입력
			for(int j=0 ; j<yIndex ; j++) {
				intAry2[i][j] = i+1+(j*5);
			}
		}
		for(int i=0 ; i<xIndex ; i++) { //배열 intAryp2[i][j]값을 콘솔창에 출력 
			for(int j=0 ; j<yIndex ; j++) {
				System.out.print(intAry2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		int xIndex3 = 5;
		int yIndex3 = 5;
		int [][] intAry3 = new int[xIndex3][yIndex3];
		for(int i=0 ; i<xIndex3 ; i++) { //배열 intAryp3[i][j]에 값 입력
			for(int j=0 ; j<yIndex3 ; j++) {
				intAry3[i][j] = (xIndex3-i-1)*(yIndex3)+(j+1);
			}
		}
		for(int i=0 ; i<xIndex3 ; i++) { //배열 intAryp3[i][j]값을 콘솔창에 출력 
			for(int j=0 ; j<yIndex3 ; j++) {
				System.out.print(intAry3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
