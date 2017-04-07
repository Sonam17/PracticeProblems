package array;

public class MaxSumWithNoAdjacentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,20,3,4};
		int sum = findMaxSumWithNoAdjElem(arr);	//Time - O(n) Space - Constant
		System.out.println("Max sum = "+sum);
	}

	static int findMaxSumWithNoAdjElem(int[] arr){
		
		int incl = arr[0];
		int excl = 0;
		for(int i=1;i<arr.length;i++){
			int prev_incl = incl;
			incl = excl+arr[i];
			excl = Math.max(prev_incl, excl);
		}
		return Math.max(incl, excl);
	}
}
