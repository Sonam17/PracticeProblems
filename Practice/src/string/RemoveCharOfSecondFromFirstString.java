package string;

public class RemoveCharOfSecondFromFirstString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first = "geeksforgeeks";
		String second = "mask";
		StringBuilder result = new StringBuilder();
		char[] count = new char[256];
		
		char[] firstArr = first.toCharArray();
		char[] secArr = second.toCharArray();
		
		for(int i=0;i<secArr.length;i++){
			int index = secArr[i];
			count[index]++;
		}
		
		for(int i=0;i<firstArr.length;i++){
			int index = firstArr[i];
			if(count[index] == 0)
				result.append(firstArr[i]);
		}
		
		System.out.println("Result = "+result);
		
	}

}
