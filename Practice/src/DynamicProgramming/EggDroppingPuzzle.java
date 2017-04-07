package DynamicProgramming;

public class EggDroppingPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int floors = 6;
		int eggs = 2;
		System.out.println("\nMin attempts = "+findMinAttemptsToFindFloor(floors,eggs));
		
	}
	
	static int findMinAttemptsToFindFloor(int floors, int eggs){
		
		int[][] T = new int[eggs][floors];
		
		for(int i=0;i<eggs;i++){
			for(int j=0;j<floors;j++){
				if(i==0){ //#eggs is 1 so worst case attempts is same as #floors
					T[i][j] = j+1;
				}else if(i>j){  // if #eggs is greater than floors
					T[i][j] = T[i-1][j];
				}else{
					int min = Integer.MAX_VALUE;
					for(int cnt=0;cnt<j;cnt++){
						int ifEggBreaks=0, ifNotBreaks=0;
						int lowerFloors = cnt-0;
						int higherFloors = j-cnt;
						if(lowerFloors>0)
							ifEggBreaks = T[i-1][lowerFloors-1];
						if(higherFloors > 0)
							ifNotBreaks = T[i][higherFloors-1];
						int val = 1+Math.max(ifEggBreaks,ifNotBreaks);
						if(min>val)
							min = val;
					}
					T[i][j] = min;
				}
			}
		}
		
		for(int i=0;i<eggs;i++){
			System.out.println();
			for(int j=0;j<floors;j++){
				System.out.print(T[i][j]+" ");
			}
		}
		
		return T[eggs-1][floors-1];
	}

}
