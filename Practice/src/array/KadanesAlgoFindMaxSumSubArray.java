package array;

public class KadanesAlgoFindMaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-2,-3,-4,-1,-6,0};

		System.out.println(largestSubArraySum(arr));
		System.out.println(largestSubArrayProduct(arr));
		
	}
	
	static int largestSubArraySum(int[] arr){
		
		int localMax = 0;
		int globalMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			localMax = localMax + arr[i];
			
			if(globalMax < localMax)
				globalMax = localMax;
			
			if(localMax<0)
				localMax = 0;
	
		}
		
		return globalMax;
	}
	
	static int largestSubArrayProduct(int[] arr){
			int imax = arr[0];
			int imin = arr[0];
			int globalMax= arr[0];
			//int globalMin= arr[0];
			
			for(int i=1;i<arr.length;i++){
				
				//if curr elem is negative number then swap because negative+bignumber = small number
				// and negative plus small number = big bumber
				if(arr[i]<0){
					int temp = imax;
					imax = imin;
					imin = temp;
				}
				//redefine imax an imin
				imax=Math.max(imax*arr[i], arr[i]);
				imin=Math.min(imin*arr[i], arr[i]);
				
				
				globalMax = Math.max(imax, globalMax);
				//globalMin = Math.max(imin, globalMin);
			}
			//System.out.println("globalMin = "+globalMin);
			
			return globalMax;
		}

}
