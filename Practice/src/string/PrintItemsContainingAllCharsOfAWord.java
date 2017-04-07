package string;

import java.util.ArrayList;
import java.util.List;

public class PrintItemsContainingAllCharsOfAWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "sun";
		List items = new ArrayList<String>();
		items.add("geeksforgeeks");
		items.add("unsorted");
		items.add("sunday");
		items.add("just");
		items.add("sss");
		
		char[] wordArr = word.toCharArray();
		char[] count = new char[256];
		
		for(int i=0;i<wordArr.length;i++){
			int asciiVal = wordArr[i];
			count[asciiVal]++;
		}
		
		for(Object item: items){
			int counter = wordArr.length;
			char[] itemArr = item.toString().toCharArray();
			for(int i=0;i<itemArr.length;i++){
				int asciiVal = itemArr[i];
				if(count[asciiVal] > 0){
					count[asciiVal]--;
					counter--;
				}
			}
			if(counter == 0){
				System.out.println(item.toString());
			}
			for(int i=0;i<wordArr.length;i++){
				int asciiVal = wordArr[i];
				count[asciiVal]++;
			}
		}
	}
}
