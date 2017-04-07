package DynamicProgramming;

public class FindMinCostMatrixChainMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] p = {10, 20, 30, 40, 30};
		int[][] matrices = new int[p.length][2];

		for(int i=0;i<p.length-1;i++){
			matrices[i][0]=p[i];
			matrices[i][1]=p[i+1];
		}
		//created matrices
//		for(int i=0;i<p.length-1;i++){
//			System.out.println(matrices[i][0]+"  "+matrices[i][1]);
//		}
		findMinCostMatrixChainMult(matrices, p);
		
	}
	
	static int findMinCostMatrixChainMult(int[][] matrices,int[] p){

		int[][] cost = new int[matrices.length][matrices.length];

		System.out.println(matrices.length);
		//Not needed to put 0 in diagonal as well when only two matrices are involved
		for(int i=0;i<cost.length;i++){
			for(int j=0;j<cost.length;j++){
				if(i==j)
					cost[i][j]=0;
				else if(i>j){
					cost[i][j]=-1;
				}
			}
		}
		
		
		for(int t=2;t<cost.length;t++){
			for(int i=0;i<cost.length-t;i++){
				int j = i+t;
				cost[i][j] = Integer.MAX_VALUE;
				for(int k=i+1;k<j;k++){
					int val = cost[i][k]+cost[k][j]+(p[i]*p[k]*p[j]);
					System.out.print(val+ "   ");
					if(cost[i][j] > val )
						cost[i][j] = val;
				}
			}
		}
		
		
		
		for(int i=0;i<cost.length;i++){
			System.out.println();
			for(int j=0;j<cost.length;j++){
				System.out.print(cost[i][j]+" ");
			}
		}
			return 0;
	}

}
