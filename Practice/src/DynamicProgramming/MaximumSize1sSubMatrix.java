package DynamicProgramming;

public class MaximumSize1sSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int R = 6;
		int C = 5;
		int[][] M = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0 } };

		int size = findMaxSize1sSubMatrix(M, R, C);

	}

	static int findMaxSize1sSubMatrix(int[][] M, int R, int C) {
		int[][] T = new int[R + 1][C + 1];
		int maxSize = 0;  
		for (int i = 1; i < R+1; i++) {
			for (int j = 1; j < C+1; j++) {
				int min = 0;
				if (M[i - 1][j - 1] != 0) {
					 min = T[i - 1][j - 1];
					if (min > T[i][j - 1])
						min = T[i][j - 1];
					if (min > T[i - 1][j])
						min = T[i - 1][j];
					T[i][j] = min+1;
					if(maxSize < T[i][j])
						maxSize = T[i][j];
				}else
					T[i][j] = 0;
			}
		}
		
		System.out.println("Matrix\n");
		for (int i = 0; i < R+1; i++) {
			System.out.println();
			for (int j = 0; j < C+1; j++) {
				System.out.print(T[i][j]+ " " );
			}
		}

		return maxSize;
	}

}
