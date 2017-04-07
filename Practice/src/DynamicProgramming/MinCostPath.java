package DynamicProgramming;

public class MinCostPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[][] cost = { {1, 2, 3},
				 		  {4, 8, 2},
				 		  {1, 5, 3} };
		 int n=3;
		 int m=3;
		
		 Cell position = new Cell(2,2,0);
		 System.out.println("\nMinimum Cost Path  = "+findMinCostToReach(position,cost,m,n));
		 
	}
	
	static int findMinCostToReach(Cell position, int[][] cost, int m, int n){
		
		Cell[][] arr = new Cell[m][n];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				
				if(i==0 && j==0){
					arr[i][j] = new Cell(0,0,cost[i][j]);
				}else if(i==0){
					Cell value = arr[i][j-1];
					arr[i][j] = new Cell(i,j-1,value.cost+cost[i][j]);
				}else if(j==0){
					Cell value = arr[i-1][j];
					arr[i][j] = new Cell(i-1,j,value.cost+cost[i][j]);
				}else{
					int v1= arr[i-1][j-1].cost;
					int v2 = arr[i-1][j].cost;
					int v3 = arr[i][j-1].cost;
					if(v1<v2 && v1< v3){
						arr[i][j] = new Cell(i-1,j-1,v1+cost[i][j]);
					}else if(v2<v1 && v2<v3){
						arr[i][j] = new Cell(i-1,j,v2+cost[i][j]);
					}else{
						arr[i][j] = new Cell(i,j-1,v3+cost[i][j]);
					}
					
				}
				
				
			}
		}
		
		for(int i=0;i<m;i++){
			System.out.println();
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j].toString()+" ");
			}
		}
		
		return arr[position.r][position.c].cost;
	}

}


class Cell{
	int r;
	int c;
	int cost;
	
	Cell(int r, int c, int cost){
		this.r = r;
		this.c = c;
		this.cost = cost;
	}
	
	public String toString(){
		return (this.r+":"+this.c+":"+this.cost);
	}
}

