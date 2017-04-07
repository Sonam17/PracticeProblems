package array;

public class JollyJumperSequence {

	static boolean isJollyJumperSequence(int[] arr){
		int n= arr.length;
		for(int i=1;i<n;i++){
			if(Math.abs(arr[i]-arr[i-1])>n-1)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {11,7, 4, 2, 1, 6};
		int[] arr = {1, 4, 2, -1, 6};
		System.out.println(isJollyJumperSequence(arr));
	}

}
