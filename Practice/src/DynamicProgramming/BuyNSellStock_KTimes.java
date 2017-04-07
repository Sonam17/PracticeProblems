package DynamicProgramming;

public class BuyNSellStock_KTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price = {2,5,7,1,4,3,1,3};   //for k=3 o/p=10
		//int[] price = {10,22,5,75,65,80};   //for k=2 o/p=87
		//int[] price = {12, 14, 17, 10, 14, 13, 12, 15};  //for k=3 o/p=12
		//int[] price = {100, 30, 15, 10, 8, 25, 80}; //for k=3 o/p=72
		//int[] price = {90, 80, 70, 60, 50}; //for k=1 o/p=0
		int k=3;
		System.out.println("\nMax Profit by buying and selling K times = "+findMaxProfit(price,k));
	}

	static int findMaxProfit(int[] price, int k){
		
		int[][] T = new int[k+1][price.length];
		
		for(int i=0;i<k+1;i++){
			int maxDiff = 0-price[0];
			for(int j=0;j<price.length;j++){
				if( i ==0 ){
					T[i][j] = 0;
				}else if(j==0){
					T[i][j] = 0;
				}
				else{
					// logic with O(n)
					T[i][j] = Math.max(T[i][j-1], (maxDiff+price[j]));
					//check the maxDiff before going to the next iteration
	 				maxDiff = Math.max(maxDiff, T[i-1][j]-price[j]);
					
					// logic with O(n^2)
					/*
					int maxDiff = 0;
					for(int n=0;n<j;n++){
						maxDiff = Math.max(maxDiff,price[j]-price[n]+T[i-1][n]);
					}
					T[i][j] = Math.max(T[i][j-1],maxDiff);
					*/
				}
			}
		}
		
		for(int i=0;i<k+1;i++){
			System.out.println();
			for(int j=0;j<price.length;j++){
				System.out.print(T[i][j]+" ");
			}
		}
		
		return T[k][price.length-1];
	}
}
