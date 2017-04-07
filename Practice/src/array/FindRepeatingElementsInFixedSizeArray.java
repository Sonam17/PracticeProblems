package array;

public class FindRepeatingElementsInFixedSizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1,-5,-2,3,-2,3,3,4};
		int n = A.length;
		for(int i=0;i<n;i++){
			if(A[Math.abs(A[i])] >= 0){
				A[Math.abs(A[i])] = -A[Math.abs(A[i])];
			}else{
				System.out.println(Math.abs(A[i]));
			}
		}
	}

}
