package Sorting;

public class InsertionSort {

	static void insertionSort(int[] arr){
		int j,key;
		for(int i=1;i<arr.length;i++){
			key = arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0 , 1,  4 , 3 , 2 , 5 , 7,  6};
		insertionSort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ "  " );

	}

}
