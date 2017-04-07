package DynamicProgramming;

public class ReachEndWithMinJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 6, 1, 0, 9};
		System.out.println("\nMinimum jumps = "+findMinJumps(arr));
		
	}

	static int findMinJumps(int[] arr){
		
		int[] cost = new int[arr.length];
		for(int i=0;i<arr.length;i++)
			cost[i] = Integer.MAX_VALUE; //fill entire array with infinity
		
		
		if(arr[0] == 0)
			return 0;
		
		cost[0] = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)
				continue;
			for(int j=0;j<i;j++){
				if(arr[j]+j>=i){ //if the previous element can reach the current position
					if(cost[j]+1 < cost[i]){
						cost[i] = cost[j]+1;
					}
				}
			}
			
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
			System.out.print(cost[i]+" ");
		return cost[arr.length-1];
	}
	
}
