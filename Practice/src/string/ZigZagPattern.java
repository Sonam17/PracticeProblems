package string;

public class ZigZagPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "PAYPALISHIRING";
		String s = "ABC";
		System.out.println(s.length());
		int r = 2;
		System.out.println("\n"+convert(s, r));
	}

	static String convert(String s, int numRows) {

		String output = "";
		if(numRows<=0)
			return output;
		if(s==null || s.equals(""))
			return s;
		char[] arr = s.toCharArray();
		
		int fullCols = s.length()/numRows;
		int numExtraCols = numRows - 2;
		int totalNumCols = fullCols+numExtraCols*fullCols;
		int totalNumChars = fullCols*numRows+numExtraCols*fullCols;
		System.out.println("totalNumChars="+totalNumChars);

		if(totalNumChars>s.length()){
			int ctr = numExtraCols;
			while(ctr>0 && totalNumChars>s.length()){
				totalNumChars--;
				totalNumCols--;
				ctr--;
			}
		}else if(totalNumChars<s.length()){
			totalNumCols++;
		}
		System.out.println("totalNumCols="+totalNumCols);
		
		int columns = totalNumCols;
		if(numRows == 1)
			columns = s.length();
		
		if(columns<=0)
			columns = s.length();
			//return output;
		
		System.out.println("Columns = "+columns);
		char[][] mat = new char[numRows][columns];
		int jump = numRows-2;  
		int ctr=0;
		
		for (int i = 0; i < columns; ) {

			int j;
			for (j = 0; j < numRows; j++) {
				if(ctr<arr.length)
					mat[j][i] = arr[ctr++];
				else
					break;
			}
			j--;
			int ctr1=j;
			int ctr2=i;
			ctr1--;
			ctr2++;
			while(ctr2<columns && ctr1>0){
				if(ctr<arr.length)
					mat[ctr1][ctr2]=arr[ctr++];
				else
					break;
				ctr1--;
				ctr2++;
			}
			if(jump>0)
				i = i+jump+1;
			else
				i++;
		}
		for(int i=0;i<numRows;i++){
			//System.out.println();
			for(int j=0;j<columns;j++){
				//System.out.print(mat[i][j]);
				if(mat[i][j] != '\0')
					output=output+mat[i][j];
			}
		}
		return output;
	}
}
