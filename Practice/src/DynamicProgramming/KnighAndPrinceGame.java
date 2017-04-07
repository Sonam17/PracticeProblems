package DynamicProgramming;

public class KnighAndPrinceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int[][] dungeon = {{-2,-3,3},
//								{-5,-1,1},
//								{10,30,-5}};
		int[][] dungeon = {{100}};
			calculateMinimumHP(dungeon);
	}

	   public static int calculateMinimumHP(int[][] dungeon) {
	        int m = dungeon.length;
	        int n = dungeon[0].length;
	        int[][] T = new int[m][n];
	        T[0][0]=dungeon[0][0];
	        
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(i==0){
	                    if(j!=0){
	                        T[i][j] = T[i][j-1] + dungeon[i][j]; 
	                    }
	                }else if(j==0){
	                    if(i!=0){
	                        T[i][j] = T[i-1][j] + dungeon[i][j];
	                    }
	                }else{
	                	//System.out.println(Math.abs(T[i-1][j]));
	                	//System.out.println(Math.abs(T[i][j-1]));
	                	//find how far are both values from 0
	                	if(Math.abs(T[i-1][j])<Math.abs(T[i][j-1]))
	                			T[i][j] = dungeon[i][j] +T[i-1][j]; 
	                    else
	                    		T[i][j] = dungeon[i][j] +T[i][j-1];
	                }
	            }
	        }
	        
			for(int i=0;i<m;i++){
				System.out.println();
				for(int j=0;j<n;j++){
					System.out.print(T[i][j]+" ");
				}
			}
			int minHealth;
			if(T[m-1][n-1]>0)
				minHealth = 1 ;
			else
				minHealth = 1 + Math.abs(T[m-1][n-1]);
			System.out.println("\nFinal Value = "+minHealth);
	        return minHealth; 
	    }
	
}
