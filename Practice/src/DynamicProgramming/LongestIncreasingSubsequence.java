package DynamicProgramming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50, 3, 10, 7, 40, 80};
		//{10, 22, 9, 33, 21, 50, 41, 60, 80};
		System.out.println("\nLIS = "+lis(arr));
		
		
		
	}

	static int lis(int[] arr){
		
		int[] count = new int[arr.length];
		int maxSize = 0; 
		
		count[0] =1;
		for(int i=1;i<arr.length;i++){
			int max = 1;
			for(int j=0;j<i;j++){
				if(arr[j]<=arr[i]){
					if(max <= count[j]){
						max = count[j]+1; 
					}
				}
			}
			count[i] = max;
		}
		
		//System.out.println("\n");
		for(int i=0;i<count.length;i++){
			//System.out.print(count[i]+" ");
			if(maxSize < count[i]){
				maxSize = count[i];
			}
		}
				return maxSize;
	}
	
}
