package array;

public class ProductPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,3};
		withoutDivisionButExtraSpace(arr);	// Time - O(n) Space - O(2n)
		withoutDivisionNExtraSpace(arr);	// Time - O(n) Space - Constant
	}
	
	static void withoutDivisionNExtraSpace(int[] arr){
		
		int n=arr.length;
		int[] prod = new int[n];
		
		//Initialize prod arary
		for(int i=0;i<n;i++){
			prod[i]=1;
		}
		int temp = 1;
		for(int i=0;i<n;i++){
			prod[i] = temp;
			temp = temp*arr[i];
		}
		System.out.println("\n1st");
		for(int i=0;i<n;i++){
			System.out.print(" "+prod[i]);
		}
		temp = 1;
		for(int i=n-1;i>=0;i--){
			prod[i] = prod[i]*temp;
			temp = temp*arr[i];
		}
		System.out.println("\n2nd");
		for(int i=0;i<n;i++){
			System.out.print(" "+prod[i]);
		}
		
	}
	
	static void withoutDivisionButExtraSpace(int[] arr){

		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		int[] prod = new int[n];
		
		//form left array
		left[0] = arr[0];
		for(int i=1;i<n;i++){
			left[i] = arr[i] * left[i-1];
		}

		//form right array
		right[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--){
			right[i] = arr[i] * right[i+1];
		}
		
		//form product array
		for(int i=0;i<n;i++){
			if(i==0)
				prod[i] = right[i+1];
			else if(i == n-1)
				prod[i] = left[i-1];
			else 
				prod[i] = left[i-1]*right[i+1];
		}
		
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(" "+prod[i]);
		}
	}

}
