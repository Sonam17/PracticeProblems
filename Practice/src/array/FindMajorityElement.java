package array;

public class FindMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {3,3,4,2,4,3,2,3,3};
		findByBruteForce(A);	//Time - O(n^2) Space - Constant
		int value = byMooresVotingAlgorithm(A);	//Time - O(n) Space - Constant
		System.out.println("CandidateNumber is "+ value);
	}

	public static void findByBruteForce(int[] A){
		
		int count;
		int cand;
		boolean flag = false;
		for(int i=0;i<A.length;i++){
			cand = A[i];
			count = 0;
			for(int j=0;j<A.length;j++){
				if(cand==A[j])
					count++;
			}
			if(count > (A.length/2)){
				flag=true;
				System.out.println("here"+cand);
				break;
			}
		}
		if(!flag)
			System.out.println("NONE");
			
	}
	
	public static int byMooresVotingAlgorithm(int[] A){
		
		int index = 0;
		int count = 1;
		
		for(int i=1;i<A.length;i++){
			if(A[index] == A[i])
				count++;
			else
				count--;
			if(count == 0)
			{
				index = i;
				count = 1;
			}
		}
		
		//check if majority elem appears n/2 times
		int cand_Majority = A[index];
		count = 0;
		for(int i=0;i<A.length;i++){
			if(A[i] == cand_Majority)
				count++;
		}
		if(count>A.length/2)
			return cand_Majority;
		return -1;
		
	}
	
}
