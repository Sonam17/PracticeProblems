package DynamicProgramming;

public class KMPAlgo_PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String pattern = "abcdabca";
		//String pattern = "aabaabaaa";
		String pattern = "abcaby";
		String str = "abxabcabcaby";
		int[] prefixSuffixArr = findprefixSuffixArr(pattern);
		System.out.println("Pattern exists = "+patternExists(str,pattern,prefixSuffixArr));
		
	}
	
	static boolean patternExists(String str,String pattern,int[] prefixSuffixArr){
		
		
		int cnt1=0,cnt2=0;
		char[] s = str.toCharArray();
		char[] p = pattern.toCharArray();
		while(cnt2<str.length() && cnt1 < pattern.length()){
			if(s[cnt2] != p[cnt1] && cnt1 ==0){
				cnt2++;
			}else if(s[cnt2] == p[cnt1]){
				cnt1++;
				cnt2++;
			}else{
				//cnt2++;
				if(cnt1>=0)
					cnt1 = prefixSuffixArr[cnt1-1];
			}
			
		}
		
		if(cnt1<pattern.length())
			return false;
		
		return true;
	}
	
	static int[] findprefixSuffixArr(String pattern){
		
		int[] arr = new int[pattern.length()];
		char[] str = pattern.toCharArray();
		
		
		int cnt1=0, cnt2=1;
		boolean flag = false;
		
		arr[0]=0;
		while(cnt2<str.length){
			if(str[cnt1] != str[cnt2] && cnt1 == 0){
				arr[cnt2]=0;
				cnt2++;
			}else if(str[cnt1] == str[cnt2]){
				arr[cnt2]=arr[cnt2-1]+1;
				cnt1++;
				cnt2++;
			}else{
				
				if(arr[cnt1-1]>=0)
					cnt1 = arr[cnt1-1];
				if(str[cnt1] == str[cnt2]){
					arr[cnt2] = arr[cnt1]+1;
					cnt2++;
				}
			}
		}
		System.out.println();
		for(int i=0;i<pattern.length();i++)
			System.out.print(arr[i]+" ");
		
		return arr;
	}
	
	

}
