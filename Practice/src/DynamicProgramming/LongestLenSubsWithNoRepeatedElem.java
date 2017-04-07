package DynamicProgramming;

public class LongestLenSubsWithNoRepeatedElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABDEFGABEF";
		if(null != str)
			System.out.println("\n LongestLenSubsWithNoRepeatedElem = "+findlongLenSubsWithNoRepeatedElem(str));
		
	}
	
	static int findlongLenSubsWithNoRepeatedElem(String str){
	
		char[] s = str.toCharArray();
		int[] count = new int[256];
		
		if(s.length == 1)
			return 1;
		
		int start=0;
		
		int max = 0;
		
		int cntr = 1;
		
		int val = s[0];
		System.out.println(val);
		count[val]++; 
		for(int curr=1;curr<s.length;curr++){
			int value = s[curr];
			if(count[value] > 0){
				for(int i=0;i<curr;i++){
					if(s[i] == s[curr]){
						start = i+1;
					}else{
						count[value]--;
					}
				}
			}else{
				count[value]++;
				cntr++;
			}
			if(max<cntr)
				max=cntr;
		}
		
		return max;
	}

}
