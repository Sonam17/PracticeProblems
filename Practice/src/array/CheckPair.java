package array;

import java.util.HashSet;

public class CheckPair {

	public static void main(String[] args) {
	
		int A[] = {7,5,3,1,9};
		int N = 16;
		
		System.out.println("Brute force result - "+bruteForce(A, N));	//Time - O(n^2) Space - Constant
		System.out.println("Merge Sort result - "+sorting(A, N));	//Time - O(nlogn) Space - Constant
		System.out.println("HashSet result - "+usingHashSet(A, N));	//Time - O(n) Space - O(n)
    
	}
	
	public static boolean usingHashSet(int[] A, int N){
		
		HashSet<Integer> values = new HashSet<Integer>();
		for(int i=0;i<A.length;i++){
			values.add(A[i]);
		}

		for(int i=0;i<A.length;i++){
			//System.out.println("A[i]= "+A[i]);
			if(values.contains(N-A[i]))
				return true;
		}
		
		return false;
	}

	public static boolean bruteForce(int A[], int N){
		
		int n = A.length;
		for(int i=0; i<n; i++){
			int current = A[i];
			for(int j=i; j<n; j++){
				if(current + A[j] == N){
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static boolean sorting(int A[], int N){
		
		if(null != A){
			mergeSort(A);
		}
		int cnt1=0;
		int cnt2=A.length-1;	
		
		while(cnt1<cnt2){
			if(A[cnt1]+A[cnt2] > N)
				cnt2--;
			else if(A[cnt1]+A[cnt2] < N)
				cnt1++;
			else
				return true;
		}
		return false;
	}
	
	public static void mergeSort(int A[]){
		
		int mid;
		int[] arr1 = null;
		int[] arr2 = null;

		if(A.length > 1){
			
			mid = (A.length)/2;
			arr1 = new int[mid];
			for(int i=0;i<mid;i++){
				arr1[i] = A[i];
			}
			
			arr2 = new int[A.length-mid];
			for(int i=mid;i<A.length;i++){
				arr2[i-mid] = A[i];
			}
			
//			System.out.println("\n===Arr1===");
//			for(int i=0;i<arr1.length;i++){
//				System.out.print(arr1[i]+"-");
//			}
//			System.out.println("\n===Arr2===");
//			for(int i=0;i<arr2.length;i++){
//				System.out.print(arr2[i]+"-");
//			}

			mergeSort(arr1);
			mergeSort(arr2);
			
			merge(arr1,arr2, A);
			
//			System.out.println("\n===Final Arr===");
//			for(int i=0;i<A.length;i++){
//				System.out.print(A[i]+"-");
//			}
		}
	}

	public static int[] merge(int arr1[], int arr2[], int[] arr){
		
		int cnt = 0,cnt1 = 0,cnt2 = 0;
		
		while(cnt1 < arr1.length && cnt2 < arr2.length){
			if(arr1[cnt1] < arr2[cnt2]){
				arr[cnt++]=arr1[cnt1++];
			}else{
				arr[cnt++]=arr2[cnt2++];
			}
		}
		
		while(cnt1 < arr1.length){
			arr[cnt++] = arr1[cnt1++];
		}
		while(cnt2 < arr2.length){
			arr[cnt++] = arr2[cnt2++];
		}
	
		return arr;
	}
	
}
