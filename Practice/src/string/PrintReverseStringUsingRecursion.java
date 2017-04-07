package string;

public class PrintReverseStringUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "geeks";
		//System.out.println(input.charAt(input.length()-1));
		printReverseString(input);
	}

	static void printReverseString(String str){
		if(str.length()>1){
			System.out.print(str.charAt(str.length()-1));
			printReverseString(str.substring(0, str.length()-1));
		}else
			System.out.print(str);
	}
	
}
