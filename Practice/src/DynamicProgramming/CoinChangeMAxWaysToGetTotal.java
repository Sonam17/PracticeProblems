package DynamicProgramming;

public class CoinChangeMAxWaysToGetTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N= 5;
		int[] coins = {1,2,3};
		
		System.out.println("\n Max ways to get total from coins = "+findWaysToGetTotal(coins,N));
		
	}
	
	static int findWaysToGetTotal(int[] coins, int N){
		
		int[][] ways = new int[coins.length][N+1];
		
		for(int i=0;i<coins.length;i++){
			for(int j=0;j<N+1;j++){
				
				if(i==0){
					ways[i][j] = 1;
				}else if(j==0){
					ways[i][j] = 1;
				}else{
					if(j>=coins[i])
						ways[i][j] = ways[i-1][j]+ways[i][j-coins[i]];
					else
						ways[i][j] = ways[i-1][j];
				}
				
			}
		}
		
		for(int i=0;i<coins.length;i++){
			System.out.println();
			for(int j=0;j<N+1;j++){
				System.out.print(ways[i][j]+" ");
			}
		}
		return ways[coins.length-1][N];
	}

}
