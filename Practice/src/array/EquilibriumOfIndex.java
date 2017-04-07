package array;

public class EquilibriumOfIndex {

	static int findEquilibriumOfIndex(int[] arr){
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
			
		int leftArr = 0;
		int rightArr = sum-arr[0];
		
		for(int i=0;i<arr.length-1;i++){
			if(leftArr==rightArr)
				return (i);
			leftArr = leftArr+arr[i];
			rightArr = sum-leftArr-arr[i+1];
			
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println("Equilibrium is at index = "+findEquilibriumOfIndex(arr));
	}

}
