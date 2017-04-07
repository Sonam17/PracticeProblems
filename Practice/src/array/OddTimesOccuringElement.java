package array;

public class OddTimesOccuringElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2,3,1,3};
		
		//XOR Method : Time - O(n) Space - Constant
		int element = arr[0];
		for(int i=1;i<arr.length;i++){
			element = arr[i] ^ element;
		}
		System.out.println("OddTimesOccuringElement = "+element);
	}

}
