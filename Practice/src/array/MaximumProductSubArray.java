package array;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,3,4,-1,-3,0};
		System.out.println(findMaxProductSubArra(arr));
		
	}
	static int findMaxProductSubArra(int[] arr){
		
		int imax = arr[0];
		int imin = arr[0];
		int r= arr[0];
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]<0){
				int temp = imax;
				imax = imin;
				imin = temp;
			}
			imax=Math.max(imax*arr[i], arr[i]);
			imin=Math.min(imin*arr[i], arr[i]);
			
			r = Math.max(imax, r);
		}
		
		return r;
	}
	

}
