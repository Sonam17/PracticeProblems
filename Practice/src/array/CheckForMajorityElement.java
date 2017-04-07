package array;

public class CheckForMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 3, 3, 3, 10};
		int x= 3;
		System.out.println("Linear Search Result = "+checkIfMajorityElemLinearSearch(arr,x));	// Time - O(n) Space - Constant
		System.out.println("Binary Search Result = "+checkIfMajorityElemBinarySearch(arr,x));	// Time - O(n) Space - Constant
	}
	
	static boolean checkIfMajorityElemLinearSearch(int[] arr,int x){
		
		int n = arr.length;
		for(int i=0;i<arr.length;i++){
			if(x == arr[i]){
				if(arr[i] == x && arr[i+n/2] == x){
					return true;
				}
			}
		}
		return false;
	}
	
	static boolean checkIfMajorityElemBinarySearch(int[] arr,int x){

		int mid = binarySearch(arr,x,0,arr.length-1);
		System.out.println("Mid = "+mid);
		
		
		return false;
	}
	
	static int binarySearch(int[] arr,int x, int start, int end){
		int mid = -1;
		if (end >= start) {
			mid = (start + end) / 2;

			if((mid == 0 || arr[mid-1]<x) && arr[mid] == x){
				System.out.println("finally in here!!");
				return mid;
			}else if (x > arr[mid]) {
				mid = binarySearch(arr, x, mid + 1, end);
			} else {
				mid = binarySearch(arr, x, start, mid - 1);
			}
		}
		return mid;
	}
	
}
