package array;

public class MaxDifferenceInTwoElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {9,10,2,8,5,7};
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		findMaxDiff(arr);
	}

	static void findMaxDiff(int[] arr){
		//Initialize
		int minIndex = 0;
		//int maxIndex = 1;
		int maxDiff = arr[1] - arr[0];
		
		for(int i=2;i<arr.length;i++){
			
			if(arr[i] - arr[minIndex] > maxDiff){
				maxDiff = arr[i] - arr[minIndex];
			}else if(arr[i] - arr[minIndex] < 0){ //case where curr number is less than min value till now
				minIndex = i;
			}
		}
		System.out.println("MaxDiff = "+maxDiff);
	}
}
