package DynamicProgramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str1 = "AGGTAB";
		//String str2 = "GXTXAYB";
		String str1 = "AYZX";
		String str2 = "AXYT";
		
		System.out.println("\nLCS = "+lcs(str1,str2));
		
	}
	
	static int lcs(String s1,String s2){
		
		int[][] arr = new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<s1.length()+1;i++){
			for(int j=0;j<s2.length()+1;j++){
				if(j==0 || i==0){
					arr[i][j] = 0;
				}else{
					if(s1.charAt(i-1) == s2.charAt(j-1)){
						arr[i][j] = arr[i-1][j-1]+1;
					}else{
						arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
					}
					
				}
			}
		}
		
		for(int i=0;i<s1.length()+1;i++){
			System.out.println();
			for(int j=0;j<s2.length()+1;j++){
				System.out.print(arr[i][j]+" ");
			}
		}
		return arr[s1.length()][s2.length()];
		
	}

}
