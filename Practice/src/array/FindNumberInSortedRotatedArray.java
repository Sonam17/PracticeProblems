package array;

public class FindNumberInSortedRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		int n = 1;
		search(arr,n);
	}
	
	static void search(int[] arr, int n){
		if(arr.length>11){
			System.out.println("Number Found = "+ pivotedBinarySearch(arr, n, 0, arr.length-1));
		}
	}
	
	static boolean pivotedBinarySearch(int[] arr, int n, int l, int r){
		
		if(l>r)
			return false;
		int mid = (l+r)/2;
		if(arr[mid] == n)
			return true;
		else if(arr[l]<arr[mid]){ //meaning it is sorted 
			if(n<arr[mid] && n >=arr[l])
				return pivotedBinarySearch(arr,n,l,mid-1);
			else
				return pivotedBinarySearch(arr,n,mid+1,r);
		}else{
			if(n<=arr[r] && n>arr[mid])
				return pivotedBinarySearch(arr,n,mid+1,r);
			else
				return pivotedBinarySearch(arr,n,l,mid-1);
		}
	}
}
