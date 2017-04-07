package array;

public class MergeTwoSortedArrInOneArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] largeArr = {-1,-1,2,-1,7,-1,10};
		int[] smallArr = {5,8,12,14};
		
		// Below Method - Time - O(m+n) Space - Constant
		
		//Shift all empty spaces to the front of array - O(m+n)
		int end = largeArr.length-1;
		for(int i=largeArr.length-1;i>=0;i--){
			if(largeArr[i] != -1){
				int temp = largeArr[end];
				largeArr[end] = largeArr[i];
				largeArr[i]=temp;
				end--;
			}
		}
		
//		for(int i=0;i<largeArr.length;i++)
//			System.out.print(largeArr[i]+" ");

		//Merge two arrays like merge of MergeSort Algorithm - O(m+n)
		
		int cnt1 = largeArr.length-end, cnt2 = 0, cnt = 0;
		while(cnt1<largeArr.length && cnt2 < smallArr.length){
			if(largeArr[cnt1] < smallArr[cnt2])
				largeArr[cnt++] = largeArr[cnt1++];
			else
				largeArr[cnt++] = smallArr[cnt2++];
		}
		
		while(cnt1<largeArr.length){
			largeArr[cnt++] = largeArr[cnt1++];
		}
		while(cnt2<smallArr.length){
			largeArr[cnt++] = smallArr[cnt2++];
		}
		
		System.out.println("\nFinal Sorted Array ");
		for(int i=0;i<largeArr.length;i++)
			System.out.print(largeArr[i]+" ");
		
	}

}

