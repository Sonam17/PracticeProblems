package string;

public class StringMatchingWithWilCardChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "g*k";
		String s2 = "geek";
		
		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		System.out.println(match(s1Arr,s2Arr,0,0));

	}
//	String s1 = "g*k";
//	String s2 = "geek";
	
	
	static boolean match(char[] s1, char[] s2, int cnt1, int cnt2){
		
		if(s1.length==cnt1 && s2.length==cnt2) // both reach end
			return true;
		else if(cnt1 == s1.length && cnt2 < s2.length) // str1 reached end and str2 has not
			return false;
		else if(cnt1<s1.length  && s1[cnt1]=='*' && s2.length == cnt2)    // str1 has * end and str2 has reached end
			return false;
		else if((cnt1 < s1.length && s1[cnt1]=='?') || (cnt1 < s1.length && cnt2 < s2.length && s1[cnt1]==s2[cnt2])) // if a match or '?'
			return match(s1,s2,++cnt1,++cnt2);
		else if(cnt1<s1.length && s1[cnt1] == '*') 
			return (match(s1,s2,cnt1,++cnt2) || match(s1,s2,++cnt1, cnt2));
		
		return false;
	}

}
