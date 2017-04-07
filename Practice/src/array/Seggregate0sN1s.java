package array;

public class Seggregate0sN1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		seggregate0sN1s(arr);	//Time - O(n) Space - Constant
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ "");
		}
	}

	static void seggregate0sN1s(int[] arr){
		int left = 0, right = arr.length -1;
		
		while(left<right){
			if(arr[left] == 1 && arr[right] == 0){
				//swap
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}else if(arr[left] == 0){
				left++;
			}else if(arr[right] == 1){
				right--;
			}
		}
	}
	
}
