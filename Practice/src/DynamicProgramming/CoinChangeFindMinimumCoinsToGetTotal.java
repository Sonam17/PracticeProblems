package DynamicProgramming;

public class CoinChangeFindMinimumCoinsToGetTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N= 13;
		int[] coins = {7,2,3,6};
		
		System.out.println("\n Min #coins to get total = "+findMinCoisToGetTotal(coins,N));
		
	}
	
	static int findMinCoisToGetTotal(int[] coins, int N){
		
		int[] arr = new int[N+1];
		int[] T = new int[N+1];
		
		arr[0]=0;
		T[0] = -1;
		for(int i=1;i<N+1;i++){
			arr[i] = Integer.MAX_VALUE;
			T[i]=-1;
		}
		
		for(int j=0;j<coins.length;j++){
			for(int i=1;i<N+1;i++){
				if(i >= coins[j]){
					int val = 1+arr[i-coins[j]];
					if(val>=0){
						if(val<arr[i])
							T[i]=j;
						arr[i] = Math.min(arr[i], val);
					}
				}
			}
		}
		
		for(int j=0;j<N+1;j++){
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		for(int j=0;j<N+1;j++){
			System.out.print(T[j]+" ");
		}
		
		//find which coins used
		int sum = N;
		
		while(sum>0){
			System.out.print("\nCoin used = "+coins[T[sum]]);
			sum = sum - coins[T[sum]];
		}
		
		return arr[N];
	}

}
