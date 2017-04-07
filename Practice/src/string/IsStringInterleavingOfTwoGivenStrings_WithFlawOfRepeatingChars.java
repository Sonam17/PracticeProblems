package string;

public class IsStringInterleavingOfTwoGivenStrings_WithFlawOfRepeatingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A = "AAB";
	    String B = "AAC";
	    String C = "AACAAB"; //returns false when it should have returned true
	    char[] aArr=A.toCharArray();
	    char[] bArr=B.toCharArray();
	    char[] cArr=C.toCharArray();
	    System.out.println(isStringInterleavinOfTwoGiven(aArr,bArr,cArr));

	}
	
	static boolean isStringInterleavinOfTwoGiven(char[] A, char[] B, char[] C){
		
		if( A.length+B.length == C.length){
			int aCnt=0, bCnt=0, cCnt=0;
			while(cCnt < C.length){
				if(aCnt < A.length && C[cCnt] == A[aCnt])
					aCnt++;
				else if(bCnt < B.length && C[cCnt] == B[bCnt])
					bCnt++;
				else
					return false;
				cCnt++;
			}
			if(aCnt < A.length || bCnt < B.length)
				return false;
		}
			
		return true;
	}

}
