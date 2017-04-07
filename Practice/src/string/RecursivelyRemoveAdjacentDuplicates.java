package string;

public class RecursivelyRemoveAdjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =  "azxxzy";
		//char[] inArr = input.toCharArray();
		char lastRem = '$';
		String output = removeAdjDup(input, lastRem);
		System.out.println(output);
	}

	static String removeAdjDup(String in, char lastRem){

		if(in == null || in.length() == 1)
			return in;
		
		if(in.charAt(0) == in.charAt(1)){
			lastRem = in.charAt(0);
			int ctr = 1;
			while(in.charAt(ctr) == in.charAt(ctr+1)){
				ctr++;
			}
			ctr++;
			return removeAdjDup(in.substring(ctr),lastRem);
		}
		
		String rem_str = removeAdjDup(in.substring(1),lastRem);
		
		//if first char of string matches last removed char
		if(rem_str == null && lastRem == in.charAt(0)){
			return rem_str;
		}
		
		//if first char of string matches first char of remaining str
		if(rem_str != null && rem_str.charAt(0) == in.charAt(0)){
			lastRem = in.charAt(0);
			return rem_str.substring(1);
		}
		
		return in.charAt(0)+rem_str;
	}
}
