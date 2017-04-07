package string;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "amway";
		
		//System.out.println("Reverse = "+reverseString(input));
		
	}

	static String reverseString(String in){

		String output;
		
		if(in != null && in.length()==1)
			return in;
		
		if(in.length()>1){
			output = reverseString(in.substring(1))+in.charAt(0);
			return output;
		}
		return null;	
	}
	
}
