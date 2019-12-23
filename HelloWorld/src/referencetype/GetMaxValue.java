package referencetype;

public class GetMaxValue {
	public static void main(String[] args) {
		int temp = 0;
		int[] intAry = {8,7,6,5,4};
		
		//(if 배열[0] < 배열 [1]) 
		//    : 아무것도 안한다.
		// else
		//    : 배열[1]과 배열[0]의 자리를 바꾼다.
		//(if 배열[1] < 배열 [2])
		//    : 아무것도 안한다
		//     ..
		//
		//
		//
		
		for(int j=1; j<(intAry.length) ; j++) {
			for(int i=0; i<(intAry.length-j) ; i++){
				if(intAry[i] < intAry[i+1]) {
				}else {
					//    : 배열[i]과 배열[i+1]의 자리를 바꾼다.
					temp = intAry[i];
					intAry[i] = intAry[i+1];
					intAry[i+1] = temp;
				}
			}
		}
		
		for(int i=0 ; i<5 ; i++)
		{
			System.out.print(intAry[i] + " ");
		}
		
	}
}
