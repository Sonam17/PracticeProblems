package DynamicProgramming;

public class FindEditDistToMakeStr1SameAsStr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "SATURDAY";//"CUT"
		String str2 = "SUNDAY";//"CAT"
		
		System.out.println("\nEdit Dist = "+editDist(str1,str2));
	}

	static int editDist(String s1, String s2){
		
		int m = s1.length();
		int n = s2.length();
		int[][] arr = new  int[m+1][n+1];
		
		for(int i=0;i< m+1;i++){
			for(int j=0;j<n+1;j++){
				if(i==0){
					arr[i][j] = j;
				}else if(j==0){
					arr[i][j] = i;
				}else{
					if(s1.charAt(i-1) == s2.charAt(j-1))
						arr[i][j] = arr[i-1][j-1];
					else
						arr[i][j] = Math.min(arr[i-1][j-1],Math.min(arr[i][j-1], arr[i-1][j])) +1;
				}
				
			}
		}
		
		for(int i=0;i<s1.length()+1;i++){
			System.out.println();
			for(int j=0;j<s2.length()+1;j++){
				System.out.print(arr[i][j]+" ");
			}
		}
		return 0;
	}
	
}
