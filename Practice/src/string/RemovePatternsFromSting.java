package string;

public class RemovePatternsFromSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =  "acbac";
		char[] inArr = input.toCharArray();
		
		normalApproach(inArr);

		//OR run only one at a time
		
		//stateMachineApproach(inArr);
		
		
	}
	static void normalApproach(char[] inArr){
		
		int j =0,i=0;
		while(i<inArr.length){
			
			if(inArr[i] == 'b')
				i++;
			else if(inArr[i] == 'a' && inArr[i+1] == 'c')
				i+=2;
			else if(inArr[i] == 'c' && j>0 && inArr[j] == 'a'){
				i--;
				j--;
			}else{
				inArr[j++]= inArr[i++];
			}
		}

		System.out.println("\nnormalApproach.....");
		for(int k=0;k<j;k++)
		System.out.print(inArr[k]+ " " );
	}
	
	static void stateMachineApproach(char inArr[]){
		int j=0;
		String state = "one"; //state is "one" if previous character is not 'a'
		for(int i=0;i<inArr.length;i++){
			
			// If state is ONE, then do NOT copy the current character
	        // to output if one of the following conditions is true
	        // ...a) Current character is 'b' (We need to remove 'b')
	        // ...b) Current character is 'a' (Next character may be 'c')
			if(state.equalsIgnoreCase("one") && inArr[i] != 'b' && inArr[i] != 'a'){
				inArr[j++] = inArr[i];
			}
			// If state is TWO and current character is not 'c' (other-
			// wise we ignore both previous and current characters)
			if(state.equalsIgnoreCase("two") && inArr[i] != 'c'){
				inArr[j++] = 'a';
				
				// Then copy the current character if it is not 'a' and 'b'
				if(inArr[i] != 'a' && inArr[i] != 'b'){
					inArr[j++]=inArr[i];
				}
			}
			
			// Change state according to current character
			if(inArr[i] == 'a')
				state = "two";
			else
				state = "one";
			
		}
		
		// If last character was 'a', copy it to output
		if(state.equalsIgnoreCase("two"))
			inArr[j++] = 'a';
		
		System.out.println("\nstateMachineApproach.....");
		for(int i=0;i<j;i++)
		System.out.print(inArr[i]+ " " );
	}

}
