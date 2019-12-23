package referencetype;

public class ArrayMaxValue {
	public static void main(String[] args) {

		int a=6, b=7, c=3, d=5, e=9;
		char maxIndex = 0;
		int maxValue = 0;
		if(a > b) {
			maxValue = a;
			maxIndex = 65;
		}else {
			maxValue = b;
			maxIndex = 66;
		}
		if(c > maxValue) {
			maxValue = c;
			maxIndex = 67;
		}
		if(d > maxValue) {
			maxValue = d;
			maxIndex = 68;
		}
		if(e > maxValue) {
			maxValue = e;
			maxIndex = 69;
		}
		
		System.out.println("maxvalue : " + maxValue);
		System.out.println("maxIndex : " + maxIndex);
		
		maxValue = 0;
		int maxIndexI = 0;
		int[] intAry = {6,7,3,5,9};
		for(int i=0 ; i<5 ; i++) {
			if (intAry[i] > maxValue) {
				maxValue = intAry[i];
				maxIndexI = i;
			}
		}
		System.out.println("maxvalue(ver.Array) : " + maxValue);
		System.out.println("maxIndex(ver.Array, 0~) : " + maxIndexI);
		
		int minIndex = 0;
		int minValue = intAry[minIndex];
		for(int i=0 ; i<5 ; i++) {
			if (intAry[i] < minValue) {
				minValue = intAry[i];
				minIndex = i;
			}
		}
		System.out.println("minValue(ver.Array) : " + minValue);
		System.out.println("minIndex(ver.Array, 0~) : " + minIndex);
	}
}
