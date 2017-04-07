package string;

import java.util.HashSet;
import java.util.Iterator;

public class PermutationOfAllCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ABBC";
		char[] input = s.toCharArray();
		HashSet output = new HashSet<String>();
		
		permute(input,0,input.length-1);
//		Iterator itr = output.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		
	}

	static void permute(char[] input, int l, int r){
		
 		if(l == r){
			//output.add(new String(input));
			System.out.println(new String(input));
			return;
		}
		
		for(int i=l;i<=r;i++){
			swap(i,l,input);	//swap to form new string as input
			permute(input,l+1,r);
			swap(l,i,input);	//swap again to restore the string
		}
		
	}
	
	static void swap(int a, int b, char[] input){
		char temp = input[a];
		input[a] = input[b];
		input[b] = temp;
	}
}
