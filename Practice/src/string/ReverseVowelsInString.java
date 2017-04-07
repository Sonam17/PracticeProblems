package string;

public class ReverseVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		System.out.println(reverseVowels(s));
	}

	static String reverseVowels(String s) {

		String output  = null;
		if (s != null) {
			char[] arr = s.toCharArray();
			int ctr1 = 0, ctr2 = s.length() - 1;
			System.out.println(ctr1 + ":" + ctr2);
			while (ctr1 < ctr2) {
				if(isVowel(arr[ctr1]) && isVowel(arr[ctr2])){
					char temp = arr[ctr1];
					arr[ctr1] = arr[ctr2];
					arr[ctr2] = temp; 
					ctr1++;
					ctr2--;
				}
				if(!isVowel(arr[ctr1])){
					ctr1++;
				}
				if(!isVowel(arr[ctr2]))
					ctr2--;
			}
			output = new String(arr);
		}
		return output;
	}
	
	static boolean isVowel(char c){
		if(c == 'e' || c == 'a' || c == 'i' || c == 'o' || c == 'u'){
			return true;
		}
		return false;
	}
}
