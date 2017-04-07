package string;

public class CheckIfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "test";
		String b = "tesi";
			
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		
		System.out.println(isAnagram(aArr,bArr));
		
	}

	
	static boolean isAnagram(char[] a, char[] b){
		
		if(a.length!=b.length)
			return false;
		
		int[] count = new int[256];
		for(int i = 0;i< 256;i++){
			count[i]=0;
		}
		for(int i = 0;i< a.length;i++){
			int asciiVal= a[i];
			count[asciiVal] = count[asciiVal]+1; 
		}
		
		for(int i = 0;i< b.length;i++){
			int asciiVal= b[i];
			count[asciiVal] = count[asciiVal]-1; 
		}
		
		for(int i = 0;i< 256;i++){
			if(count[i]>0)
				return false;
		}
		
		return true;
	}
}
