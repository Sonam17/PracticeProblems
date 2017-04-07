package string;

public class LongestPalindromeSubstr_ManachersAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =  "abaxabaxabb";
		char[] inArr = input.toCharArray();
		int[] lenPali = new int[inArr.length];
		
		for(int i=0;i<lenPali.length;i++)
			lenPali[i]=1;
		
		int centre = 0;
		int end = 0;
		int start = 0;
		for(int i=0;i<inArr.length;){
			
			start = i-lenPali[i]/2;
			end = i+lenPali[i]/2;
			
			while(start > 0 && end<inArr.length-1 && inArr[end+1] == inArr[start-1] ){
				lenPali[i]+=2;
				start--;
				end++;
			}
			
			if(end == inArr.length-1)
				break;
			
			centre = end+1;
			if(i<end){
				//Mirror then copy contents
				for(int ctr=i+1;ctr<=end;ctr++){
					
					//so we copy only if the current values pali does not go beyond start
					// thus we take min of value at mirror index of ctr or the value of pali from end to ctr
					lenPali[ctr] 
							= Math.min(lenPali[i-(ctr-i)] // mirror index of ctr is within the main pali
							, 2*(end - ctr)+1); //max pali that can be formed considering ctr as centre till end 

					 if(ctr + lenPali[i - (ctr - i)]/2 == end) {
						 	centre = ctr;
		                    break;
		                }
					
				}
			}
			i = centre;
			
		}
		
		System.out.println();
		for(int i=0;i<lenPali.length;i++){
			System.out.print(lenPali[i]+ " ");
		}
		
	}

}
