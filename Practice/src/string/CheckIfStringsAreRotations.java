package string;

public class CheckIfStringsAreRotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ABCDC";
		String str2 = "CABCD";
		
		if(areRotations(str1,str2))
			System.out.println("Strings are rotations of each other!!");
		else
			System.out.println("Strings are NOT rotations of each other!!");
		
	}
	
	static boolean areRotations(String str1, String str2){
		
		if((str1.length() == str2.length()) && (str1+str1).indexOf(str2)!=-1)
			return true;
		
		return false;
	}

}
