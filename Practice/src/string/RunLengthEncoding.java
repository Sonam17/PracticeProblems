package string;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "wwwwaaadexxxxxx";
		char[] inputArr = input.toCharArray();
		StringBuilder output = new StringBuilder();
		
		char currChar = inputArr[0];
		int count = 1;
		for(int i=1;i<inputArr.length;i++){
			if(currChar == inputArr[i]){
				count++;
			}else{
				output.append(""+currChar+count);
				count = 1;
				currChar = inputArr[i];
			}
		}
		//for last character
		output.append(""+currChar+count);
		System.out.println("Output = "+ output);
		
	}
	

}
