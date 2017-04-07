package string;

public class FindSmallestWindowContainingAllCharsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1 = "this is a test string";
		String input2 = "tist";
		char[] stringArr = input1.toCharArray();
		char[] wordArr = input2.toCharArray();
		int[][] count = new int[256][2];

		for (int i = 0; i < wordArr.length; i++) {
			int asciiVal = wordArr[i];
			count[asciiVal][0] = count[asciiVal][0] +1;
		}

//		int min_len = stringArr.length;
//		int counter = wordArr.length;
//		int lenCounter = 0;
//		int indexOfFirstChar = -1;
//		for (int i = 0; i < stringArr.length; i++) {
//			int asciiVal = stringArr[i];
//
//			if (counter != 0) {
//				if (count[asciiVal] > 0) {
//					if (indexOfFirstChar < 0)
//						indexOfFirstChar = i;
//					count[asciiVal]--;
//					counter--;
//					lenCounter++;
//				}
//				if (counter == 0) {
//					if (min_len > lenCounter)
//						min_len = lenCounter;
//					lenCounter = 0;
//					System.out.println("Min len for first time = " + min_len);
//					continue;
//				}
//			} else {
//
//				lenCounter++;
//				for (int k = 0; k < wordArr.length; k++) {
//					int ascii = wordArr[k];
//					count[ascii]++;
//				}
//				if (stringArr[indexOfFirstChar] == stringArr[i]) {
//					lenCounter = min_len+lenCounter-1;
//					for (int j = indexOfFirstChar + 1; j < i; j++) {
//						int ascii = stringArr[j];
//						if (count[ascii] == 0) {
//							lenCounter--;
//						}
//					}
//				}
//			}
//		}

	}

}
