package string;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I love geeks for,it geeks very much";
		String[] inputArr = input.split(" |,");
		StringBuilder output = new StringBuilder(); 

		for(int i=inputArr.length-1;i>=0;i--){
			output.append(inputArr[i]+ " ");
		}
		System.out.println("Output = "+output);
	}

}
